package TicketBuyingApp;

public class Ticket {
    private int totalTickets;

    public void setTotalTickets(int totalTickets) {
        if (totalTickets >= 0) {
            this.totalTickets = totalTickets;
        } else {
            throw new IllegalArgumentException("Total tickets cannot be negative.");
        }
    }

    public int getTotalTickets() {
        return totalTickets;
    }
    public int soldTickets(Cinemahall bashundhara) {
        return getTotalTickets() - bashundhara.getVisitors().size();
    }
}
