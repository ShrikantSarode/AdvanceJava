package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordUpdationExample {

	public static void main(String[] args) {
		try (
				SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session= factory.openSession();
				){
			Actor foundActor= session.find(Actor.class,"A05");
			Transaction tx = session.beginTransaction();
			foundActor.setFirstName("Salman");
			foundActor.setLastName("Khan");
			foundActor.setAge(52);
			tx.commit();
			System.out.println("Record Updated..!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
