package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordInsertionWithoutXMLExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {
			Actor actorObj = new Actor("A02", "Kiara", "Advani", 28);
			Transaction tx = session.beginTransaction();
			session.persist(actorObj);
			tx.commit();
			System.out.println("Record Added...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
