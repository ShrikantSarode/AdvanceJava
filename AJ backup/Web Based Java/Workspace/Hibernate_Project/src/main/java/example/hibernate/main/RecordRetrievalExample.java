package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class RecordRetrievalExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {
			//Loading an entity where ActorId : A03
			Actor foundActor = session.find(Actor.class, "A02");
			if(foundActor != null) {
			System.out.println("Found Actor : "+foundActor);
			System.out.println("First Name : "+foundActor.getFirstName());
			System.out.println("Last Name : "+foundActor.getLastName());
			System.out.println("Age : "+foundActor.getAge());
			}
			else {
				System.out.println("Actor with given ID doesn't exist..!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
