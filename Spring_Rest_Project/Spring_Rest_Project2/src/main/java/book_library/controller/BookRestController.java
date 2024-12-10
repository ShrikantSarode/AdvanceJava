package book_library.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;
import book_library.service.BookService;
import book_library.store.BookStore;

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

		return foundBook;
	}
	

	@PostMapping("/books-api")
	public void createNewBook(@RequestBody Book newBook)// newBook Accepts the new object
	{
		System.out.println("Received Book: " + newBook);
		bookServiceReference.createNewBook(newBook);

	}

}
