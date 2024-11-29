package example.jdbc.bean;

public class Article {
	private int id;
	private String title;
	private String category;
	private String date; // Store date as java.sql.Date
	private String author;

	// Constructor to initialize the Article object
	public Article(int id, String title, String category, String article_dateCreated, String author) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.date = article_dateCreated;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", category=" + category + ", date=" + date + ", author="
				+ author + "]";
	}
}
