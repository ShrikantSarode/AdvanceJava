package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Song_Master")
public class Song {
	@Id
	@Column(name="song_id", length=4)
	private String songID;
	@Column(name="song_title", length=50)
	private String title;
	public Song() {
		// TODO Auto-generated constructor stub
	}
	public Song(String songID, String title) {
		super();
		this.songID = songID;
		this.title = title;
	}
	public String getSongID() {
		return songID;
	}
	public void setSongID(String songID) {
		this.songID = songID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
