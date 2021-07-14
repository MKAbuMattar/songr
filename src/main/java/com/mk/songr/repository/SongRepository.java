package com.mk.songr.repository;

import com.mk.songr.model.Album;
import com.mk.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    public List<Song> findByTitleAndAlbum(String title, Album album);
}
