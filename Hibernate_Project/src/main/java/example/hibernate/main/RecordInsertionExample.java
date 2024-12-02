package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Movie;

public class RecordInsertionExample {

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf = conf.configure();
		// obtain a sessionFactory using 'Configuration' class
		SessionFactory factory = conf.buildSessionFactory();
		// obtain a session using session factory
		Session currentSession = factory.openSession();
		// create a entity class object
		Movie movieObject = new Movie("Mo2", "Heybaby", "Comedy", 2008);
		// obtain a transaction and start the same
		Transaction tx = currentSession.beginTransaction();
		// Store the entity class object using Session
		currentSession.persist(movieObject);
		// commit the transaction
		tx.commit();
		// Class the Session
		currentSession.close();
		// close the SessionFactory
		factory.close();
		System.out.println("Record Added...!!");

	}

}
