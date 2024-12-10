package book_library.repositary;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import book_library.entity.Book;
import book_library.store.BookStore;

@Repository // Marks these class as a repository and it is managed by spring
public class BookRepositary {

	public Collection<Book> getAllBooks() {
		Collection<Book> allAvailBooks = BookStore.getAllBooks();
		return allAvailBooks;
	}

	public Book getOneBook(int bookId) {
		Book foundBook = BookStore.getOneBook(bookId);
		return foundBook;
	}
	
	public void createNewBook(Book newBook)// newBook Accepts the new object
	{
		 BookStore.createNewBook(newBook);

	}
}
