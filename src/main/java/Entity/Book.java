package Entity;

public class Book {

	private String title;
	private String author;
	private boolean available;
	
	public Book(String title, String author, boolean available) {
		this.title = title;
		this.author = author;
		this.available = available;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}