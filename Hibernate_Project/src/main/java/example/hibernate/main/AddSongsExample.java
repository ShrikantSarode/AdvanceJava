package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class AddSongsExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory(); Session session = factory.openSession();) {
			Song s1 = new Song("S01", "Kehna hi kya");

			Song s2 = new Song("S02", "Tu hi re");

			Song s3 = new Song("S03", "Love is waste of time");

			Transaction tx = session.beginTransaction();
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
			tx.commit();
			System.out.println("Songs Added!!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Songs Not Added!!");
		}

	}
}
