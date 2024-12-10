package example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.bean.Restaurent;
import example.utils.JdbcUtils;

public class RestaurentDao implements DaoInterface<Restaurent, Integer>{
	@Override
	public Collection<Restaurent> retriveAll() {
		/*This method connects to DB, fetches all records, convert them into
		 * Java Objects of Restaurent class, puts those objects into some
		 * collection and returns the collection
		 */
		Collection<Restaurent> allRestaurents = new ArrayList<Restaurent>();
		String sqlQuery = "select * from restaurent_master";
		try(
				Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				){ 
			while(rs.next()) {
				int restaurentId = rs.getInt(1);
				String restaurentName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restCuisine = rs.getString(3);
				Restaurent rst = new Restaurent(restaurentId,restaurentName,restCuisine,branchCount);
				allRestaurents.add(rst);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return allRestaurents;
	}

	@Override
	public Restaurent retrieveOne(Integer id) {
		Restaurent foundRestaurent = null;
		String sqlQuery = "select * from restaurent_master where rest_id =?";
		try(
				Connection conn = JdbcUtils.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int restaurentId = rs.getInt(1);
				String restaurentName = rs.getString(2);
				int branchCount = rs.getInt(4);
				String restCuisine = rs.getString(3);
				foundRestaurent = new Restaurent(restaurentId,restaurentName,restCuisine,branchCount);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return foundRestaurent;
	}

	@Override
	public void create(Restaurent newRestaurent) {
		/*This method accepts a 'Restaurent' object: newRestaurent and stores it
		 * as a record in the DB table.
		 */
		String sqlQuery = "insert into restaurent_master values(?,?,?,?)";
		try(
				Connection conn = JdbcUtils.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			//Extracting the values from Restaurent object: newRestaurent using getter methods
			int restaurentId = newRestaurent.getRestaurentId();
			String restaurentName = newRestaurent.getName();
			String restaurentCuisine = newRestaurent.getCuisine();
			int restaurentBranchCount = newRestaurent.getBranchCount();
			//Susbtituting theses values in place of '?' using PreparedStatement
			pstmt.setInt(1,restaurentId);
			pstmt.setString(2,restaurentName);
			pstmt.setString(3, restaurentCuisine);
			pstmt.setInt(4, restaurentBranchCount);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record inserted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurent modifiedRestaurent) {
		/*This method receives the modified state of the Restaurent
		 *object: modifiedRestaurent and reflects that state into DB.
		 */
		String sqlQuery = "update restaurent_master set rest_name = ?, rest_cuisine = ?, rest_branch_count = ? where rest_id = ?";
		try(
				Connection conn = JdbcUtils.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			//Capturing the modified state of Restaurent object: modifiedRestaurent using getter methods
			int restaurentId = modifiedRestaurent.getRestaurentId();
			String restaurentName = modifiedRestaurent.getName();
			String restaurentCuisine = modifiedRestaurent.getCuisine();
			int restaurentBranchCount = modifiedRestaurent.getBranchCount();
			//Susbtituting theses values in place of '?' using PreparedStatement
			pstmt.setInt(4,restaurentId);
			pstmt.setString(1,restaurentName);
			pstmt.setString(2, restaurentCuisine);
			pstmt.setInt(3, restaurentBranchCount);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record updated...");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void delete(Integer id) {
		/*
		 * This method performs record deletion against identity.
		 */
		String sqlQuery = "delete from restaurent_master where rest_id = ?";
		try(
				Connection conn = JdbcUtils.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record deleted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
