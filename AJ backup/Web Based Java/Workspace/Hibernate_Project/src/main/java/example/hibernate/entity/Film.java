package example.hibernate.entity;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Film_Master")
public class Film {
	@Id
	@Column(name = "film_id")
	private String filmId;
	@Column(name = "film_title")
	private String title;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "film_id")
	private Collection<Song> songs;

	public Film() {
		songs = new ArrayList<Song>();
	}

	public Film(String filmId, String title, Collection<Song> songs) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.songs = songs;
	}

	public String getFilmId() {
		return filmId;
	}

	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public void setSongs(Collection<Song> songs) {
		this.songs = songs;
	}

	public void addSong(Song songObject) {
		songs.add(songObject);
	}
}
