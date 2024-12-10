package book_library.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repositary.BookRepositary;

@Service // marks this class as a service and it is managed by spring
public class BookService {

	@Autowired
	private BookRepositary bookRepositaryReference;

	public Collection<Book> getAllBooks() {

		Collection<Book> allBooks = bookRepositaryReference.findAll();
		return allBooks;
	}

	public Book getOneBook(int bookId) {
		Book foundBook = null;
		Optional<Book> opt = bookRepositaryReference.findById(bookId);

		if (opt.isPresent()) // if found
		{
			foundBook = opt.get();// Get the book
		}
		return foundBook;
	}

	public void createNewBook(Book newBook)// newBook Accepts the new object
	{
		bookRepositaryReference.save(newBook);
	}

	public void updateExistingBook(Book exsitingBook)// newBook Accepts the new object
	{
		bookRepositaryReference.save(exsitingBook);
	}

	public void deleteBookById(int bookId) {
		bookRepositaryReference.deleteById(bookId);
	}
}
