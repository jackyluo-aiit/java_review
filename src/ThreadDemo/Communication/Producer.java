package ThreadDemo.Communication;

public class Producer extends Thread {

    private Basket basket;

    public Producer(Basket basket) {
        super();
        this.basket = basket;
    }

    @Override
    public void run() {
        while (true) {
            //定义同步代码块
            synchronized (basket) {
                try {
                    if (!basket.isEmpty()) {
                        //因为篮子不是空，线程等待消费者消费
                        basket.wait();
                    }

                    System.out.println("Producing fruit");
                    basket.setEmpty(false);
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
