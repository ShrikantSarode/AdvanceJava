package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordRetrevalExample {

	public static void main(String[] args) {
	    new HibernateConfig();
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
	         Session session = factory.openSession()) {
	        
	        // loading an entity of type Actor against an Id "A01"
	        Actor foundActor = session.find(Actor.class, "Ao1");
	        
	        if (foundActor != null) {
	            System.out.println("Found Actor: " + foundActor);
	            System.out.println("First name: " + foundActor.getFirstName());
	        } else {
	            System.out.println("Actor with the given Id does not exist");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
