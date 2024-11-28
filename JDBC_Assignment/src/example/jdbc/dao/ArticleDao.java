package example.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;

import example.jdbc.bean.Article;
import example.jdbc.bean.Article.Category;
import example.jdbc.utils.JdbcUtils;

public class ArticleDao implements DaoInterface<Article, Integer> {

	@Override
	public Collection<Article> retrieveAll() {
		Collection<Article> allArticles = new ArrayList<>();

		String sqlQuery = "SELECT * FROM article_master";

		try (Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)) {

			while (rs.next()) {
				int article_Id = rs.getInt(1);
				String article_Name = rs.getString(2);
				String article_Category = rs.getString(3);
				Date article_dateCreated = rs.getDate(4);
				String article_creatorName = rs.getString(5);

				Category article_CategoryEnum = Category.valueOf(article_Category.toUpperCase());

				Article art = new Article(article_Id, article_Name, article_CategoryEnum, article_dateCreated,
						article_creatorName);
				allArticles.add(art);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return allArticles;
	}
}
