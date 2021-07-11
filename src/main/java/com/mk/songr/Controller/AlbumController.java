package com.mk.songr.Controller;

import com.mk.songr.model.AlbumModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

  @GetMapping("/albums")
  public String albums(Model model) {
    AlbumModel theEminemShow = new AlbumModel("The Eminem Show", "Eminem", 20, "1 hr 17 min", "https://i.scdn.co/image/ab67616d00001e026ca5c90113b30c3c43ffb8f4");
    AlbumModel recovery = new AlbumModel("Recovery", "Eminem", 17, "1 hr 17 min", "https://i.scdn.co/image/ab67616d00001e02c08d5fa5c0f1a834acef5100");
    AlbumModel kamikaze = new AlbumModel("Kamikaze", "Eminem", 13, "45 min 55 sec", "https://i.scdn.co/image/ab67616d00001e02e4073def0c03a91e3fceaf73");
    AlbumModel[] albums = {theEminemShow, recovery, kamikaze};
    model.addAttribute("albums", albums);
    return "albums";
  }
}
