package testing_pck;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import BookService.Service;
import Entity.Book;

public class Testing_Books {

	@Test
	public void testGetBook() {

		Service obj = new Service();
		obj.addBook(new Book("Data Structure", "Shivam Kumar", true));
		assertFalse(obj.getBooks().isEmpty());
		assertTrue(obj.getBooks().size() == 1);
	}

	@ParameterizedTest
	@ValueSource(strings = "Data Structure")
	public void testBorrowandReturnBook(String title) {

		Service obj = new Service();
		obj.addBook(new Book(title, null, true));
		System.out.println("Avail Before: " + obj.getBooks().get(0).isAvailable());

		obj.borrowBook(title);
		System.out.println("Avail After borrow: " + obj.getBooks().get(0).isAvailable());

		assertFalse(obj.getBooks().get(0).isAvailable());

		obj.returnBook(title);
		System.out.println("Avail After return: " + obj.getBooks().get(0).isAvailable());

		assertTrue(obj.getBooks().get(0).isAvailable());

	}
}
