package example.jdbc;

import example.jdbc.bean.Resturant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ResturantDao;

public class CreateUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Resturant, Integer> daoRef = new ResturantDao();

		Resturant rst = new Resturant(107, "Mainland China", "Chinese", 5);

		daoRef.create(rst);

	}

}
