package example.jdbc.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Connection;
import java.sql.PreparedStatement;

import example.jdbc.bean.Article;
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
				java.sql.Date article_dateCreated = rs.getDate(4);
				String article_creatorName = rs.getString(5);

				// Convert java.sql.Date to String
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String article_dateCreatedString = sdf.format(article_dateCreated);

				Article art = new Article(article_Id, article_Name, article_Category, article_dateCreatedString,
						article_creatorName);
				allArticles.add(art);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return allArticles;
	}

	@Override
	public Article retrieveOne(Integer id) {
		Article foundArticle = null;
		String sqlQuery = "SELECT * FROM article_master WHERE art_id=?";
		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery)) {

			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				int article_Id = rs.getInt(1);
				String article_Name = rs.getString(2);
				String article_Category = rs.getString(3);
				java.sql.Date article_dateCreated = rs.getDate(4);
				String article_creatorName = rs.getString(5);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String article_dateCreatedString = sdf.format(article_dateCreated);

				foundArticle = new Article(article_Id, article_Name, article_Category, article_dateCreatedString,
						article_creatorName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundArticle;
	}

	@Override
	public void create(Article newArticle) {
		String sqlQuery = "INSERT INTO article_master (id, name, category, dateCreated, creatorName) VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery)) {

			int article_Id = newArticle.getId();
			String article_Name = newArticle.getTitle();
			String article_Category = newArticle.getCategory();
			String article_dateCreatedString = newArticle.getDate();
			String article_creatorName = newArticle.getAuthor();

			if (article_dateCreatedString != null && !article_dateCreatedString.isEmpty()) {
				try {
					java.sql.Date article_dateCreated = java.sql.Date.valueOf(article_dateCreatedString);

					psmt.setInt(1, article_Id);
					psmt.setString(2, article_Name);
					psmt.setString(3, article_Category);
					psmt.setDate(4, article_dateCreated);
					psmt.setString(5, article_creatorName);

					// Execute the update (insert)
					int updateCount = psmt.executeUpdate();

					// Output the result
					System.out.println(updateCount + " record(s) inserted. :)");

				} catch (IllegalArgumentException e) {
					System.out.println("Error: Invalid date format provided: " + article_dateCreatedString);
					e.printStackTrace();
				}
			} else {
				System.out.println("Error: Date string is null or empty.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override

	public void update(Article modifiedArticle) {
		String sqlQuery = "UPDATE article_master SET title=?, category=?, date_created=?, author=? WHERE id=?";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery)) {

			int articleId = modifiedArticle.getId();
			String articleTitle = modifiedArticle.getTitle();
			String articleCategory = modifiedArticle.getCategory();
			String articleDateCreated = modifiedArticle.getDate();
			String articleAuthor = modifiedArticle.getAuthor();

			psmt.setString(1, articleTitle);
			psmt.setString(2, articleCategory);
			psmt.setString(3, articleDateCreated);
			psmt.setString(4, articleAuthor);
			psmt.setInt(5, articleId);

			int updateCount = psmt.executeUpdate();
			System.out.println(updateCount + " record(s) updated. :)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer id) {
		String sqlQuery = "DELETE FROM article_master WHERE id=?";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery)) {

			psmt.setInt(1, id);
			int updateCount = psmt.executeUpdate();
			System.out.println(updateCount + " record Deleted :)");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
