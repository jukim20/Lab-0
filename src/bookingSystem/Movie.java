package bookingSystem;

public class Movie {
	private String title;
	private int ageLimit;
	
	public Movie() {

	}
	public Movie(String title, int ageLimit) {
		this.title = title;
		this.ageLimit = ageLimit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
}
