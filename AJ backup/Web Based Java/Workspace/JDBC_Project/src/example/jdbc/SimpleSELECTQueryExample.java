package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSELECTQueryExample {
	//This program  fires a simple select query and shows data loaded
	public static void main(String[] args){
	//1. Load the driver
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/zomato";
		String uid = "root";
		String pwd = "password";
		Connection dbConnection=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded...");
			
			//2. Establish connection with DB
			dbConnection = DriverManager.getConnection(url, uid, pwd);
			System.out.println("Connected with database...");
			
			//3. Obtain some statement
			stmt = dbConnection.createStatement();
			System.out.println("Obtained the statement...");
			
			//4. Execute SQL Query
			String sqlQuery = "select rest_name,rest_branch_count,rest_cuisine from restaurent_master";
			rs = stmt.executeQuery(sqlQuery);
			System.out.println("Executed SQL SELECT query and obtained ResultSet...");
			
			//5. In case of SELECT query, obtain ResultSet and perform navigation
			while(rs.next()) {
				String restaurentName = rs.getString(1);
				int branchCount = rs.getInt(2);
				String restCuisine = rs.getString(3);
				System.out.println(restaurentName +" : "+ branchCount +" : "+ restCuisine);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Unable to proceed..!");
		}
		finally {
			//closing all the resources : ResultSet, Statement, Connection
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
