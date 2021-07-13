package com.mk.songr.repository;

import com.mk.songr.model.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumModel, Long> {
    public List<AlbumModel> findByTitle(String album);
}
