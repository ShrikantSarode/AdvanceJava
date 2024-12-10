package book_library.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;

public class BookStore {

	private static Map<Integer, Book> allBooks;

	static {
		allBooks = new HashMap<>();
		Book b1 = new Book(101, "java complete reference", "patrick nough", 547.35f);
		Book b2 = new Book(102, "Let us C", "Yeshwant", 657.35f);
		Book b3 = new Book(103, "Let us C++", "Om", 22547.35f);

		allBooks.put(b1.getBookId(), b1);
		allBooks.put(b2.getBookId(), b2);
		allBooks.put(b3.getBookId(), b3);

	}

	// a method to return all the books

	public static Collection<Book> getAllBooks() {
		Collection<Book> allAvailableBooks = allBooks.values();
		return allAvailableBooks;
	}

	// a method to return one book against its ID
	public static Book getOneBook(int bookId) {

		Book foundBook = allBooks.get(bookId);
		return foundBook;
	}

	// a method to add a new book
	public static void createNewBook(Book newBook)// newBook Accepts the new object
	{
		allBooks.put(newBook.getBookId(), newBook);

	}

}
