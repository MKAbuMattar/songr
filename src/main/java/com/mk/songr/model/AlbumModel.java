package com.mk.songr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AlbumModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private String artist;
  private int songCount;
  private String length;
  private String imageUrl;

  public AlbumModel(){

  }

  public AlbumModel(String title, String artist, int songCount, String length, String imageUrl) {
    this.title = title;
    this.artist = artist;
    this.songCount = songCount;
    this.length = length;
    this.imageUrl = imageUrl;
  }

  public AlbumModel(String title, String artist, int songCount, int length, String imageUrl) {
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public int getSongCount() {
    return songCount;
  }

  public String getLength() {
    return length;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setSongCount(int songCount) {
    this.songCount = songCount;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
}
