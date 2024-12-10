package example.jdbc.bean;

public class Article {
	private int articleId;
	private String name;
	private String category;
	private String dateCreated;
	private String creatorName;
	public Article() {
		
	}
	public Article(int articleId, String name, String category, String dateCreated, String creatorName) {
		super();
		this.articleId = articleId;
		this.name = name;
		this.category = category;
		this.dateCreated = dateCreated;
		this.creatorName = creatorName;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", name=" + name + ", category=" + category + ", dateCreated="
				+ dateCreated + ", creatorName=" + creatorName + "]";
	}
	
}
