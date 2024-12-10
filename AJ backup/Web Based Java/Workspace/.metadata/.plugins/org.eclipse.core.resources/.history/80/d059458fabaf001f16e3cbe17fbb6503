package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class AddSongsExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory(); 
				Session session = factory.openSession();) {
			Song s1 = new Song("S01","Behroopia");
			Song s2 = new Song("S02","Fifi");
			Song s3 = new Song("S03","Mohabaat Buri Bimari");
			Song s4 = new Song("S04","Bhagwan Hai Kaha");
			Song s5 = new Song("S05","Love is waste of time");
			Transaction tx = session.beginTransaction();
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			session.persist(s4);
			session.persist(s5);
			tx.commit();
			System.out.println("Songs added...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
