package example.jdbc;

import example.jdbc.bean.Restaurent;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurentDao;

public class CreateUsingDaoExample {
	public static void main(String[] args) {
		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		Restaurent rst = new Restaurent(106, "Mainland China", "Chinese", 5);
		daoRef.create(rst);
	}
}
