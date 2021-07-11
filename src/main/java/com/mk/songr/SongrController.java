package com.mk.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongrController {

  @GetMapping("/")
  public String root() {
    return "index";
  }

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/capitalize/{text}")
  public String capitalize(@PathVariable String text, Model model) {
    model.addAttribute("text", text.toUpperCase());
    return "capitalize";
  }
}
