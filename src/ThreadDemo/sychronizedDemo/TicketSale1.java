package ThreadDemo.sychronizedDemo;

public class TicketSale1 implements Runnable {
    /*
    这两个是共享数据
     */
    private int tickets = 100;

    private Object object = new Object();
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
        System.out.println(Thread.currentThread().getName()+" Sale ticket completed");
    }

    /*
    如果一个对象方法上有sychronized的话，锁的对象就是this,当前的对象
     */
    public synchronized boolean saleTickets(){
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
