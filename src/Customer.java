public class Customer {
    private String name;
    private int ticketNumber;

    public Customer(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Customer " + name + " ticket number " + ticketNumber;
    }
}
