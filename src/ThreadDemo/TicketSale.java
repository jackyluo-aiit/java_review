package ThreadDemo;

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
            synchronized (object) {
                if (tickets > 0) {
                    System.out.println(this.getName() + " sales " + tickets-- + "号");
                } else {
                    break;
                }
            }

        }
        System.out.println("Sale ticket completed");
    }
}
