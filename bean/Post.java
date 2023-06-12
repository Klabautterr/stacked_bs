package stacked_bs.bean;

import java.io.Serializable;

public class Post implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String username;
	private String nachricht;
	private String link;
	private String loeschen;
	private String bildname;
	private Integer anzahl_likes;
	private byte[] bild;
	
	
	public Integer getAnzahl_likes() {
		return anzahl_likes;
	}
	public void setAnzahl_likes(Integer anzahl_likes) {
		this.anzahl_likes = anzahl_likes;
	}
	public String isLoeschen() {
		return loeschen;
	}
	public void setLoeschen(String string) {
		this.loeschen = string;
	}
	public Long getId() {
		return id;
	}
	public String getLoeschen() {
		return loeschen;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNachricht() {
		return nachricht;
	}
	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getBildname() {
		return bildname;
	}
	public void setBildname(String bildname) {
		this.bildname = bildname;
	}
	public byte[] getBild() {
		return bild;
	}
	public void setBild(byte[] bild) {
		this.bild = bild;
	}
	
}
