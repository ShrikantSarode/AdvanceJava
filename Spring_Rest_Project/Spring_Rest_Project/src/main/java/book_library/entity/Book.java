package book_library.entity;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private float price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String title, String author, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
