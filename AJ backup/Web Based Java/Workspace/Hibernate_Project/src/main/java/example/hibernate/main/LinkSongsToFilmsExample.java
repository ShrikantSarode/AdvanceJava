package example.hibernate.main;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.entity.Song;
import example.hibernate.utils.HibernateConfig;

public class LinkSongsToFilmsExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory(); Session session = factory.openSession();) {
			// Loading the films for which songs are to be linked
			Film film1 = session.find(Film.class, "F01");
			Film film2 = session.find(Film.class, "F02");
			// Loading the songs which are to be linked with the films
			Song song1 = session.find(Song.class, "S01");
			Song song2 = session.find(Song.class, "S02");
			Song song3 = session.find(Song.class, "S03");
			Song song4 = session.find(Song.class, "S04");
			Song song5 = session.find(Song.class, "S05");
			
			Transaction tx = session.beginTransaction();
			//Adding song1,song2 and song3 to film1
			Collection<Song> songsCollection = Arrays.asList(song1,song2,song3);
			film1.setSongs(songsCollection);
			//Adding song4 and song5 to film2
			film2.addSong(song4);
			film2.addSong(song5);
			tx.commit();
			System.out.println("Songs are linked with films...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
