package BookService;

import java.util.ArrayList;
import java.util.List;

import Entity.Book;
public class Service {

	private List<Book> books;

	//Constructor
	public Service() {
	 this.books = new ArrayList<Book>();
	 }

	public void addBook(Book book) {
		books.add(book);
	}
	
	//Getter
	public List<Book> getBooks() {
		return new ArrayList<Book>(books);
	}

	public void borrowBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title) && book.isAvailable()) {
				book.setAvailable(false);
				return;
			}
		}
	}

	public void returnBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title) && !book.isAvailable()) {
				book.setAvailable(true);
				return;
			}
		}
	}
}
