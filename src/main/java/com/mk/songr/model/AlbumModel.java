package com.mk.songr.model;

public class AlbumModel {
  private String title;
  private String artist;
  private int songCount;
  private String length;
  private String imageUrl;

  public AlbumModel(String title, String artist, int songCount, String length, String imageUrl) {
    this.title = title;
    this.artist = artist;
    this.songCount = songCount;
    this.length = length;
    this.imageUrl = imageUrl;
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
}
