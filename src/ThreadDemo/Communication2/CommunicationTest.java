package ThreadDemo.Communication2;

public class CommunicationTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Producer producer = new Producer(basket);
        Concumer concumer = new Concumer(basket);

        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(concumer);

        thread.start();
        thread1.start();
//        producer.start();
//        concumer.start();
    }
}
