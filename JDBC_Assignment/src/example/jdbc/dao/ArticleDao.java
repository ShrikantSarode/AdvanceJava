package example.jdbc.dao;

import java.util.Collection;

import example.jdbc.bean.Article;

public class ArticleDao implements DaoInterface<Article, Integer> {

	@Override
	public Collection<Article> retrieveAll() {

		return null;
	}

}
