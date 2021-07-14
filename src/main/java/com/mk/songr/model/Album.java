package com.mk.songr.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "album")
public class Album {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private String artist;
  private int songCount;
  private String length;
  private String imageUrl;

  @OneToMany(mappedBy = "album")
  private List<Song> songs;

  public Album(){

  }

  public Album(String title, String artist, int songCount, String length, String imageUrl) {
    this.title = title;
    this.artist = artist;
    this.songCount = songCount;
    this.length = length;
    this.imageUrl = imageUrl;
  }

  public Album(String title, String artist, int songCount, int length, String imageUrl) {
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public int getSongCount() {
    return songCount;
  }

  public void setSongCount(int songCount) {
    this.songCount = songCount;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }
}