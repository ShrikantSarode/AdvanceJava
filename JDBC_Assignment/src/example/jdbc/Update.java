package example.jdbc;

import example.jdbc.bean.Article;
import example.jdbc.dao.ArticleDao;
import example.jdbc.dao.DaoInterface;

public class Update {

	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();

		Article rst = new Article(3, "ra", "sculpture", "2012-01-01", "Shrikant");
		daoRef.create(rst);
	}

}
