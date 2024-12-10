package example.jdbc;

import example.jdbc.bean.Restaurent;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurentDao;

public class UpdateUsingDaoExample {
	public static void main(String[] args) {
		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		Restaurent rst = new Restaurent(104, "New Little Italy", "Italian", 20);
		daoRef.update(rst);
	}
}
