package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordUpdationExample {

	public static void main(String[] args) {
		new HibernateConfig(); // Ensure Hibernate configuration is initialized
		try (SessionFactory factory = HibernateConfig.getSessionFactory(); Session session = factory.openSession()) {

			// Loading an entity of type Actor against an Id "A01"
			Actor foundActor = session.find(Actor.class, "Ao1");

			if (foundActor != null) {
				// Begin transaction and update the actor details
				Transaction tx = session.beginTransaction();
				foundActor.setFirstName("Deepika");
				foundActor.setLastName("Rathi");

				// Commit the transaction
				tx.commit();
				System.out.println("Record Updated");
			} else {
				System.out.println("Actor with the given ID does not exist");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	java.lang.NullPointerException: Cannot invoke "example.hibernate.entity.Actor.setFirstName(String)" because "foundActor" is null
//	at example.hibernate.main.RecordUpdationExample.main(RecordUpdationExample.java:21)

}
