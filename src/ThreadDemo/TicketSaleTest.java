package ThreadDemo;

public class TicketSaleTest {
    public static void main(String[] args) {
        TicketSale ticketSale1 = new TicketSale("Window1");
        TicketSale ticketSale2 = new TicketSale("Window2");
        TicketSale ticketSale3 = new TicketSale("Window3");
        TicketSale ticketSale4 = new TicketSale("Window4");

        ticketSale1.start();
        ticketSale2.start();
        ticketSale3.start();
        ticketSale4.start();
    }
}
