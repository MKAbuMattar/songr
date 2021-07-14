package com.mk.songr.Controller;

import com.mk.songr.model.Album;
import com.mk.songr.model.Song;
import com.mk.songr.repository.AlbumRepository;
import com.mk.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumsRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/song/{id}")
    public String album(@PathVariable String id, Model model) {
        Album album = albumsRepository.getById(Long.parseLong(id));
        model.addAttribute("album", album);
        return "song";
    }

    @PostMapping("/song/addSong")
    public RedirectView addSongToAlbum(String album, String title, int length, int trackNumber) {
        List<Album> songAlbum = albumsRepository.findByTitle(album);
        Song newSong = new Song(title, length, trackNumber, songAlbum.get(0));
        songRepository.save(newSong);
        List<Song> song = songRepository.findByTitleAndAlbum(
                newSong.getTitle(),
                newSong.getAlbum()
        );
        return new RedirectView("/song/" + song.get(0).getAlbum().getId());
    }
}
