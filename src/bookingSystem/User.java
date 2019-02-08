package bookingSystem;

public class User {
	private static int numberOfUsers = 0;
	private long userID = ++numberOfUsers;
	private int age;
	
	public User() {
		
	}
	public User(int age) {
		this.age = age;

	}

	public static int getNumberOfUsers() {
		return numberOfUsers;
	}

	public static void setNumberOfUsers(int numberOfUsers) {
		User.numberOfUsers = numberOfUsers;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Ticket buyTicket(Movie movie, MovieTheater movieTheater, int currentTime) {
		Screen[] screens = movieTheater.getTotalScreens();
		
		for (int i = 0; i < 10; i++) {
			if (screens[i].getScreeningMovie() == movie && currentTime <= screens[i].getShowtime()) {
				if (age >= movie.getAgeLimit()) {
					int time = screens[i].getShowtime();
					Ticket ticket = new Ticket (movie, movieTheater, time);
					long ticketNo = Ticket.getNumberOfTickets();
					if (screens[i].reserveNextAvailableSeat() == true) {
						System.out.println(
								"Ticket No." + Long.toString(ticketNo) + " issued :" + "\n" + 
								"Movie - " + movie.getTitle() + "\n" +
								"Screen - " + screens[i].getId() + "\n" +
								"Seat - " + screens[i].getSeatNo() + "\n" +
								"Time - " + Integer.toString(time) + ":00" + "\n" +
								"Price - $" + screens[i].getPrice() + "\n");
		
						return ticket;
					}
					else {
						System.out.println("No more seats available." + "\n");
					}
				}
				System.out.println("User does not meet the age limit." + "\n");
				return null;
			}
		}
		
		System.out.println("No more screenings of " + movie.getTitle() + " today." + "\n");
		return null;
		
		
	}
	

}
