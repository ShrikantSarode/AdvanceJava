package example.jdbc;

import example.jdbc.bean.Resturant;
import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.ResturantDao;

public class RetrieveOneUsingDaoExample {

	public static void main(String[] args) {
		
		DaoInterface<Resturant, Integer>daoRef= new ResturantDao();
		Resturant resturantObj = daoRef.retrieveOne(104);
		
		if(resturantObj !=null)
		{
			System.out.println(resturantObj);
		}else {
			System.out.println("Given id does not exist");
		}
	}
}
