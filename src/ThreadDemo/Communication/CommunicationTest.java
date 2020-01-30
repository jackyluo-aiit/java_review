package ThreadDemo.Communication;

public class CommunicationTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Producer producer = new Producer(basket);
        Concumer concumer = new Concumer(basket);

        producer.start();
        concumer.start();
    }
}
