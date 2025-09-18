public class TicketReservationSystem {
    public static void main(String[] args){
        Theater theater = new Theater(10);

        Runnable[] customers = {
                new Customer(theater, "Customer 1", 2),
                new Customer(theater, "Customer 2", 1),
                new Customer(theater, "Customer 3", 3),
                new Customer(theater, "Customer 4", 1),
                new Customer(theater, "Customer 5", 2),
                new Customer(theater, "Customer 6", 2),
                new Customer(theater, "Customer 7", 1),
                new Customer(theater, "Customer 8", 1),
                new Customer(theater, "Customer 9", 3),
                new Customer(theater, "Customer 10", 3),
                new Customer(theater, "Customer 11", 2),
                new Customer(theater, "Customer 12", 4),
                new Customer(theater, "Customer 13", 1),
                new Customer(theater, "Customer 14", 4),
                new Customer(theater, "Customer 15", 3),
        };
    Thread[] threads = new Thread[customers.length];
    for (int i = 0; i < customers.length; i++){
        threads[i] = new Thread(customers[i]);
        threads[i].start();
    }
    for (Thread t : threads){
        try{
            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    }

}
