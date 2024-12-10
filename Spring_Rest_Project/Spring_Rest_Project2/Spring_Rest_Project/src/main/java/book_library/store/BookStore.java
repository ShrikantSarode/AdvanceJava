package book_library.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;

public class BookStore {

	private static Map<Integer, Book> allBooks;

	static {
		allBooks = new HashMap<>();
		Book b1 = new Book(101, "Java Complete Reference", "Patrick Naughton", 500.25f);
		Book b2 = new Book(102, "Python Complete Reference", "Dennis Ritchie", 300f);
		Book b3 = new Book(103, "Sql Complete Reference", "Bjarne Stoustrup", 600.50f);

		allBooks.put(b1.getBookId(), b1);
		allBooks.put(b2.getBookId(), b2);
		allBooks.put(b3.getBookId(), b3);
	}

	// A method to return all the books
	public static Collection<Book> getALlBooks() {
		Collection<Book> allAvailableBooks = allBooks.values();
		return allAvailableBooks;
	}
}
