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
}
