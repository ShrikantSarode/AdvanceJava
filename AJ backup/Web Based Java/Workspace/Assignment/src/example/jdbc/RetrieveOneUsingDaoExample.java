package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Article;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ArticleDao;

public class RetrieveOneUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		Article obj = daoRef.retrieveOne(103);
		if(obj != null)
			System.out.println(obj);
		else
			System.out.println("Restaurent with given ID does not exist..!");
	}

}
