package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Restaurent;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.RestaurentDao;

public class RetrieveAllUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Restaurent, Integer> daoRef = new RestaurentDao();
		Collection<Restaurent> allAvailableRestaurents = daoRef.retriveAll();
		for(Restaurent currentRestaurent : allAvailableRestaurents) {
			System.out.println(currentRestaurent);
		}
		System.out.println("==================================================");
		allAvailableRestaurents.stream().forEach(rst -> System.out.println(rst));
	}
}
 