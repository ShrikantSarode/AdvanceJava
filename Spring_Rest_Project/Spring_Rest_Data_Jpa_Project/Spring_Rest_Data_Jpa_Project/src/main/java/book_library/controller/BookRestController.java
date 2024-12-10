package book_library.controller;

import java.util.Collection;

import org.hibernate.sql.results.DomainResultCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;
import book_library.exceptions.BookNotFoundException;
import book_library.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookServiceReference;

	@GetMapping("/books-api")
	public Collection<Book> getAllBooks() {
		Collection<Book> allAvailableBooks = bookServiceReference.getAllBooks();
		return allAvailableBooks;
	}

	@GetMapping("/books-api/{book_id}")
	public Book getOneBook(@PathVariable("book_id") int bookId) {
		Book foundBook = bookServiceReference.getOneBook(bookId);

		// If book is not found, raise some exception
		if (foundBook == null) {
			throw new BookNotFoundException("Book with given ID not found", bookId);

		}
		return foundBook;
	}

	@PostMapping("/books-api")
	public void createNewBook(@RequestBody Book newBook)// newBook Accepts the new object
	{
		System.out.println("Received Book: " + newBook);
		bookServiceReference.createNewBook(newBook);

	}

	@PutMapping("/books-api")
	public void updateExistingBook(@RequestBody Book existingBook) {
		bookServiceReference.updateExistingBook(existingBook);
	}

	@DeleteMapping("/books-api/{book_id}")
	public void deleteOneBook(@PathVariable("book_id") int bookId) {
		bookServiceReference.deleteBookById(bookId);
	}

}
