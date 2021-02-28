package com.webgenerals.jokesapp.controller;

import com.webgenerals.jokesapp.services.JokeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JokesController
 *
 * @author Florian Popa fpopa1991@gmail.com
 */
@Controller
public class JokesController {

  private final JokeService jokeService;

  public JokesController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {

    model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }

}
