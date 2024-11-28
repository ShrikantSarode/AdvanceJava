package example.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQuery {

	public static void main(String[] args) {

		// load drive
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/zomato";
		String uid = "root";
		String pwd = "password";

		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded :)");
			// establish connection
			dbConnection = DriverManager.getConnection(url, uid, pwd);
			System.out.println("Connected to DB :) ");

			// obtain some statement
			stmt = dbConnection.createStatement();
			System.out.println("Obtained the statement");

			// execute sql query
			String sqlQuery = "select rest_name,rest_branch_Count,rest_cuisine from restaurant_master";
			rs = stmt.executeQuery(sqlQuery);
			System.out.println("Execute sql SELECT query and obtained ResultSet");

			// in case of SELECT query, obtain ResultSet and perform navigation
			while (rs.next()) {
				String resturantName = rs.getString(1);
				int branchCount = rs.getInt(2);
				String resturantCuisine = rs.getString(3);
				System.out.println(resturantName + ":" + branchCount + ":" + resturantCuisine);

			}

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Unable to load the Driver ......!");
			System.out.println("Unable to Connect to DB ......!");

		} finally {
			// closing all the resources
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
