package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Article;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ArticleDao;

public class RetrieveAllUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Article, Integer> daoRef = new ArticleDao();
		Collection<Article> allAvailableRestaurents = daoRef.retriveAll();
		for(Article currentRestaurent : allAvailableRestaurents) {
			System.out.println(currentRestaurent);
		}
		System.out.println("==================================================");
		allAvailableRestaurents.stream().forEach(rst -> System.out.println(rst));
	}
}
 