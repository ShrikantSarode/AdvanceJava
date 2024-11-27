package example.jdbc;

import example.jdbc.bean.Resturant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ResturantDao;

public class DeleteUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Resturant, Integer> daoRef = new ResturantDao();

		daoRef.delete(101);

//		System.out.println( daoRef);

	}

}
