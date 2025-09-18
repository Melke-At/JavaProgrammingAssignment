public class Theater {
    private int availableSeats;

    public Theater(int seats){
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeat(String coustomerName, int numTicket){
        if(numTicket <= availableSeats){
            System.out.println(coustomerName + "reserved " + numTicket + " tickets. ");
            availableSeats -= numTicket;
            return true;
        }else {
            System.out.println(coustomerName + " couldn't reserve " + numTicket + " tickets. ");
            return false;
        }
    }
}
