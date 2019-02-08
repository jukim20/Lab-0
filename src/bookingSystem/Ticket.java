package bookingSystem;

public class Ticket {
	
	private static long numberOfTickets = 0;
	
	public Ticket(Movie movie, MovieTheater movieTheater, int time) {
		++numberOfTickets;
	}
	
	public static long getNumberOfTickets() {
		return numberOfTickets;
	}

	public static void setNumberOfTickets(long numberOfTickets) {
		Ticket.numberOfTickets = numberOfTickets;
	}

	
}
