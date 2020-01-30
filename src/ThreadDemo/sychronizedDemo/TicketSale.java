package ThreadDemo.sychronizedDemo;

/*
这个类是卖票的窗口类，创建了4个类对象就是4个窗口
 */
public class TicketSale extends Thread {
    /*
    定义共享的数据100张票
     */
    static int tickets = 100;

    //创建锁对象
    static Object object = new Object();

    public TicketSale(String name) {
        super(name);
    }

    @Override
    public void run() {
        //卖票是持续的
        while (true) {
            if (saleTickets()) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName()+" Sale ticket completed");
    }
    /*
    此时共享的锁对象是当前类的类对象
     */
    public static synchronized boolean saleTickets(){
//        synchronized (object) {
        boolean isFinished = false;
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " sales " + tickets-- + "号");
        } else {
            isFinished = true;
        }
        return isFinished;
//        }
    }
}
