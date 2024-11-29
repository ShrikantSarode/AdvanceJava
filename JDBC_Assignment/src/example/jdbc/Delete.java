package example.jdbc;

import example.jdbc.bean.Article;
import example.jdbc.dao.ArticleDao;
import example.jdbc.dao.DaoInterface;

public class Delete {

	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();

		ArticleDao articleDao = new ArticleDao();

		Integer articleIdToDelete = 8;
		articleDao.delete(articleIdToDelete);
	}
}
