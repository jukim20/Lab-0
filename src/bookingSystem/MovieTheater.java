package bookingSystem;

public class MovieTheater {
	String name;
	Screen[] totalScreens = new Screen[10];
	Movie[] totalMovies = new Movie[5];
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Screen[] getTotalScreens() {
		return totalScreens;
	}

	public void setTotalScreens(Screen[] totalScreens) {
		this.totalScreens = totalScreens;
	}

	public Movie[] getTotalMovies() {
		return totalMovies;
	}

	public void setTotalMovies(Movie[] totalMovies) {
		this.totalMovies = totalMovies;
	}

	public MovieTheater() {
		
	}
	public MovieTheater(String name) {
		this.name = name;
	}
	
}
