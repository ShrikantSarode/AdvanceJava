package example.hibernate.main;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class LinkSongsToFlimsExample {

	public static void main(String[] args) {

		try (SessionFactory factory = HibernateConfig.getSessionFactory(); Session session = factory.openSession();) {
			// Loading the flims for which songs are to linked

			Film film1 = session.find(Film.class, "F01");
			Film film2 = session.find(Film.class, "F02");

			// Loading the songs which are to be linked with the flims

			Song song1 = session.find(Song.class, "S01");
			Song song2 = session.find(Song.class, "S02");
			Song song3 = session.find(Song.class, "S03");

			Transaction tx = session.beginTransaction();
			// Adding song1 and song2 to the film : film1
			Collection<Song> songsCollection = Arrays.asList(song1, song2);
			film1.setSongs(songsCollection);
			// Adding song3 and song4 to the film:film2
			film2.addSong(song3);

			tx.commit();

			System.out.println("Linked Successfully...!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not Linked!!");
		}

	}

}
