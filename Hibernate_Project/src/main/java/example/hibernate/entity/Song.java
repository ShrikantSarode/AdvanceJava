package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "Song_Master")
	public class Song {
	@Id
	@Column(name = "song_id", length = 4)
	private String songId;
	@Column(name = "song_title", length = 50)
	private String title;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(String songId, String title) {
		super();
		this.songId = songId;
		this.title = title;
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + "]";
	}
}
