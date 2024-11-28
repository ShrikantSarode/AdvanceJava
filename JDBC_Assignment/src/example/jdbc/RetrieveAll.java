package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Article;
import example.jdbc.dao.ArticleDao;
import example.jdbc.dao.DaoInterface;

public class RetrieveAll {

	public static void main(String[] args) {

		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		Collection<Article> allAvailableRestaurents = daoRef.retrieveAll();

		for (Article currentArticle : allAvailableRestaurents)
			System.out.println(currentArticle);

	}

}
