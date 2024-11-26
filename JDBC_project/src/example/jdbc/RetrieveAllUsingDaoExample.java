package example.jdbc;

import java.util.Collection;

import example.jdbc.bean.Resturant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ResturantDao;

public class RetrieveAllUsingDaoExample {

	public static void main(String[] args) {
		DaoInterface<Resturant, Integer> daoRef = new ResturantDao();
		Collection<Resturant> allAvailableRestaurents = daoRef.retrieveAll();

		for (Resturant currentResturant : allAvailableRestaurents)
			System.out.println(currentResturant);
		System.out.println("==================================");

		// FOR EACH LOOP
		allAvailableRestaurents.stream().forEach(rst -> {
			System.out.println(rst);
			System.out.println("==================================");
		});

	}

}
