package example.jdbc;

import example.jdbc.bean.Article;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ArticleDao;

public class UpdateUsingDaoExample {
	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		Article rst = new Article(101, "Texture", "Painting", "2024-12-11", "Omkar");
		daoRef.update(rst);
	}
}
