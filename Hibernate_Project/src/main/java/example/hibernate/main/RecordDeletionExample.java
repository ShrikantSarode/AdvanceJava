package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordDeletionExample {

	public static void main(String[] args) {
		new HibernateConfig();
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {

			Actor foundActor = session.find(Actor.class, "Ao2");
			Transaction tx = session.beginTransaction();
			session.remove(foundActor);
			tx.commit();
			System.out.println("Record Deleted");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No Record Found");
		}
	}

}
