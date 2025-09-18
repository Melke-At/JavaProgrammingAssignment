public class Customer implements Runnable {
    private Theater theater;
    private int numTickets;
    private String customerName;

    public Customer(Theater theater, String customerName, int numTickets){
        this.theater = theater;
        this.customerName = customerName;
        this.numTickets = numTickets;
    }

    @Override
    public  void run(){
        theater.reserveSeat(customerName, numTickets);
    }
}
