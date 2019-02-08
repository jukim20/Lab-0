package bookingSystem;

public class TicketingSystem {
	
	public static void main(String args[]) {
		Movie movie1 = new Movie();
		movie1.setTitle("Glass");
		movie1.setAgeLimit(17);
		
		Movie movie2 = new Movie();
		movie2.setTitle("The Wizard of Oz");
		movie2.setAgeLimit(7);
		
		Movie movie3 = new Movie();
		movie3.setTitle("Aquaman");
		movie3.setAgeLimit(13);
		
		Movie movie4 = new Movie();
		movie4.setTitle("Escape Room");
		movie4.setAgeLimit(13);
		
		Movie movie5 = new Movie();
		movie5.setTitle("The Upside");
		movie5.setAgeLimit(13);
		
		Movie[] playingMovies = new Movie[] {movie1, movie2, movie3, movie4, movie5};
		
		Screen screen1 = new Screen();
		Screen screen2 = new Screen(); 
		Screen screen3 = new Screen();
		Screen screen4 = new Screen();
		Screen screen5 = new Screen();
		Screen screen6 = new Screen();
		Screen screen7 = new Screen();
		Screen screen8 = new Screen();
		Screen screen9 = new Screen(); 
		Screen screen10 = new Screen();
		
		Screen[] theaterScreens = new Screen[] {screen1, screen2, screen3, screen4, screen5, 
												screen6, screen7, screen8, screen9, screen10};

		for(int i = 0; i < 10; i++) {
			// Assigning a number to each screen
			theaterScreens[i].setId(i+1);
			
			// Assigning a movie to each screen
			if (i < 5) {
				theaterScreens[i].setScreeningMovie(playingMovies[i]);
			} else {
				theaterScreens[i].setScreeningMovie(playingMovies[i-5]);
			}
			
			// Assigning price to each movie; 
			// children's movie = $5.99, teen movie = $7.99, adult movie = $9.99
			if (theaterScreens[i].getScreeningMovie().getAgeLimit() > 13) {
				theaterScreens[i].setPrice(9.99);
			} else if (theaterScreens[i].getScreeningMovie().getAgeLimit() < 13) {
				theaterScreens[i].setPrice(5.99);
			} else {
				theaterScreens[i].setPrice(7.99);
			}
			
			// Assigning show time for each screen; 
			// first movie at 10:00, last movie at 19:00
			theaterScreens[i].setShowtime(i+10);
		}
	
		
		MovieTheater theater = new MovieTheater();
		theater.setName("Claremont Theater");
		theater.setTotalMovies(playingMovies);
		theater.setTotalScreens(theaterScreens);
		
		User user1 = new User();
		user1.setAge(10);
		int currentTime = 11;
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		user1.buyTicket(movie2, theater, currentTime);
		
		user1.buyTicket(movie3, theater, currentTime);
		currentTime = 17;
		user1.buyTicket(movie2, theater, currentTime);
		
		User user2 = new User();
		user2.setAge(25);
		user2.buyTicket(movie5, theater, currentTime);
		
		
		
	}
}
