package example.jdbc;

import example.jdbc.bean.Restaurent;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurentDao;

public class DeleteUsingDaoExample {
	public static void main(String[] args) {
		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		daoRef.delete(101);
		
	}
}
