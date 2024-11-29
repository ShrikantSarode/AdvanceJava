package example.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.jdbc.bean.Resturant;
import example.jdbc.utils.JdbcUtils;

public class ResturantDao implements DaoInterface<Resturant, Integer> {

	@Override
	public Collection<Resturant> retrieveAll() {
		// This method connects to DB, fetches all records, converts them
		// into java objects of Restaurant class, puts those objects into some
		// Collection and returns the Collection
		//
		// creating
		Collection<Resturant> allResturants = new ArrayList<>();
		String sqlQuery = "select * from restaurant_master";
		try (Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);) {
			while (rs.next()) {
				// fetch records from the resultset
				int resturantId = rs.getInt(1);
				String resturantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String resturantCuisine = rs.getString(3);
				// Building Java Object(Restaurant) based upon these values
				Resturant rst = new Resturant(resturantId, resturantName, resturantCuisine, branchCount);
				// Adding this object (Restaurant) based upon these values
				allResturants.add(rst);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return allResturants;
	}

	@Override
	public Resturant retrieveOne(Integer id) {
		Resturant foundResturant = null;
		String sqlQuery = "select * from restaurant_master where rest_id=?";
		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery);

		) {
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {

				int resturantId = rs.getInt(1);
				String resturantName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String resturantCuisine = rs.getString(3);
				foundResturant = new Resturant(resturantId, resturantName, resturantCuisine, branchCount);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundResturant;
	}

	// use to insert the records
	@Override
	public void create(Resturant newRestaurant) {

		// This method accepts a 'Restaurant' object: newRestaurant and stores it as a
		// record in the db table.

		String sqlQuery = "insert into restaurant_master values(?,?,?,?)";// parameterized query passed by
																			// PreparedStatement
		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlQuery);

		) {
			// Extracting the values from Restaurant object:newRestaurant using getter
			// methods
			int restaurantId = newRestaurant.getResturantId();
			String restauratName = newRestaurant.getName();
			String restauratCuisine = newRestaurant.getCuisine();
			int restauratCount = newRestaurant.getBranchCount();
			// substituting these values in place of '?' using PreparedStatement
			psmt.setInt(1, restaurantId);
			psmt.setString(2, restauratName);
			psmt.setString(3, restauratCuisine);
			psmt.setInt(4, restauratCount);
			int updateCount = psmt.executeUpdate();
			System.out.println(updateCount + "record Inserted. :)");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	// to update record
	@Override
	public void update(Resturant modifiedRestaurant) {
		// This method receives the modifed state of the Restaurant object:
		// modifiedRestaurant and reflects that state into DB.
		String sqlOuery = "update restaurant_master set rest_name=?,rest_cuisine=?,rest_branch_count=? where rest_id=?";

		try (Connection conn = JdbcUtils.getConnection(); PreparedStatement psmt = conn.prepareStatement(sqlOuery);

		) {
			// Capturing the modified state of Restaurant objext:modifiedRestaurant using
			// getter methods
			int restaurantId = modifiedRestaurant.getResturantId();
			String restauratName = modifiedRestaurant.getName();
			String restauratCuisine = modifiedRestaurant.getCuisine();
			int restauratCount = modifiedRestaurant.getBranchCount();
			// substituting these values in place of '?' using PreparedStatement
			psmt.setInt(4, restaurantId);
			psmt.setString(1, restauratName);
			psmt.setString(2, restauratCuisine);
			psmt.setInt(3, restauratCount);
			int updateCount = psmt.executeUpdate();
			System.out.println(updateCount + "record Updated. :)");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	// use to delete record
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
