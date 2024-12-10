package example.jdbc;

import example.jdbc.bean.Article;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ArticleDao;

public class DeleteUsingDaoExample {
	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		daoRef.delete(101);
		
	}
}
