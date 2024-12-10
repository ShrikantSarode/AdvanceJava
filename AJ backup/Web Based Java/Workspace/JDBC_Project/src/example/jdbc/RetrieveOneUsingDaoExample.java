package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Restaurent;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurentDao;

public class RetrieveOneUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		Restaurent obj = daoRef.retrieveOne(103);
		if(obj != null)
			System.out.println(obj);
		else
			System.out.println("Restaurent with given ID does not exist..!");
	}

}
