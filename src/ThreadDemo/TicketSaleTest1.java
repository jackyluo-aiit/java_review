package src.ThreadDemo;

public class TicketSaleTest1 {
    public static void main(String[] args) {
        TicketSale1 ticketSale1 = new TicketSale1();

        Thread thread1 = new Thread(ticketSale1, "Window1");
        Thread thread2 = new Thread(ticketSale1, "Window2");
        Thread thread3 = new Thread(ticketSale1, "Window3");
        Thread thread4 = new Thread(ticketSale1, "Window4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
