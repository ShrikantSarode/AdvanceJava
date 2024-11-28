package example.jdbc;

import example.jdbc.bean.Resturant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ResturantDao;

public class UpdateUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Resturant, Integer> daoRef = new ResturantDao();
		// Obtaining a Restaurant on which update is to be performed.
//		Resturant rst = daoRef.retrieveOne(106);
		Resturant rst = daoRef.retrieveOne(105);

		// changing the name and branch count using setters
		rst.setName("New Russian court");
//		rst.setBranchCount(20);
		rst.setCuisine("Orienta");
		// Reflecting this changed state back to DB
		daoRef.update(rst);
		System.out.println(" Record Updated :) ");

	}

}
