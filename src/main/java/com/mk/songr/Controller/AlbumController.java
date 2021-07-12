package com.mk.songr.Controller;

import com.mk.songr.model.AlbumModel;
import com.mk.songr.model.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

  @Autowired
  AlbumRepository albumsRepository;

  @GetMapping("/albums")
  public String albums(Model model) {
    List<AlbumModel> albums = albumsRepository.findAll();
    model.addAttribute("albums", albums);
    return "albums";
  }

  @PostMapping("/albums")
  public RedirectView postAlbum(String title, String artist, int songCount, String length, String imageUrl) {
    AlbumModel album = new AlbumModel(title, artist, songCount, length, imageUrl);
    albumsRepository.save(album);
    return new RedirectView("/albums");
  }

//  @DeleteMapping("/albums/{id}")
//  public String deleteAlbum(@PathVariable String id, Model model) {
//    AlbumModel albums = albumsRepository.delete(Long.parseLong(id));
//    model.addAttribute("albums", albums);
//    return "albums";
//  }

//  @PostMapping("/albums")
//  public String addAlbum(@ModelAttribute AlbumModel album, Model model) {
//    AlbumModel albums = albumsRepository.save(album);
//    albumsRepository.save(albums);
//    model.addAttribute("albums", albums);
//    return "result";
//  }
}
