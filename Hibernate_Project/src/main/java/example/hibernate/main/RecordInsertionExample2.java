package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Movie;
import example.hibernate.utils.HibernateUtils;

public class RecordInsertionExample2 {

	// This program makes use of standard practicles
	public static void main(String[] args) {

		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.getCurrentSession();

		) {
			Movie movieObj = new Movie("Mo3", "Dangal", "Inspirational", 2015);
			Transaction tx = session.beginTransaction();
			session.persist(movieObj);
			tx.commit();
			System.out.println("Record Inserted...!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
