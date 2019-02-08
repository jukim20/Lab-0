package bookingSystem;

public class Screen {
	private int id;
	private static boolean[] seats = new boolean[100];
	private double price;
	private int showtime;
	private Movie screeningMovie;
	private int seatNo;
	
	public Screen() {
	}
	
	public Screen(double price, int showtime, Movie screeningMovie) {
		this();
		this.price = price;
		this.showtime = showtime;
		this.screeningMovie = screeningMovie;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	


	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getShowtime() {
		return showtime;
	}



	public void setShowtime(int showtime) {
		this.showtime = showtime;
	}



	public Movie getScreeningMovie() {
		return screeningMovie;
	}



	public void setScreeningMovie(Movie screeningMovie) {
		this.screeningMovie = screeningMovie;
	}


	public boolean[] getSeats() {
		return seats;
	}

	public void setSeats(boolean[] seats) {
		Screen.seats = seats;
	}
	
	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public boolean reserveNextAvailableSeat() {
		if (seatNo < 10) {
			seats[seatNo] = true;
			++seatNo;
			return true;
		} else {
		return false;
		}
	}

}
