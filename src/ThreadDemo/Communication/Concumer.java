package ThreadDemo.Communication;

public class Concumer extends Thread {
    private Basket basket;

    public Concumer(Basket basket){
        super();
        this.basket = basket;
    }

    @Override
    public void run() {
        while (true) {
            //定义同步代码块
            synchronized (basket) {
                try {
                    if (basket.isEmpty()) {
                        //因为篮子是空，消费者等待生产者生产
                        basket.wait();
                    }

                    System.out.println("Consuming fruit");
                    basket.setEmpty(true);
                    basket.notify();//通知在这个共享对象上等待的线程


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
