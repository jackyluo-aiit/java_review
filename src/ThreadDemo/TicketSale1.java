package ThreadDemo;

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
            synchronized (object) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + " sales " + tickets-- + "号");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" Sale ticket completed");
    }
}
