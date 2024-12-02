package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordInsertionExampleWithoutXMLExample {

	 public static void main(String[] args) {
	        try (SessionFactory factory = HibernateConfig.getSessionFactory();
	             Session session = factory.openSession()) {

	            Actor actorObj = new Actor("AO2", "Nora", "Fatehi", 25);
	            Transaction tx = session.beginTransaction();
	            session.persist(actorObj);
	            tx.commit();
	            System.out.println("Record Added..!");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
