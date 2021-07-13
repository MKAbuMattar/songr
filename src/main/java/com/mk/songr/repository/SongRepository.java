package com.mk.songr.repository;

import com.mk.songr.model.AlbumModel;
import com.mk.songr.model.SongModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<SongModel, Long> {
    public List<SongModel> findByTitleAndAlbum(String title, AlbumModel album);
}
