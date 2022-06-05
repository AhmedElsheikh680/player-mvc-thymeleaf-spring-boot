package com.spring.controller;

import com.spring.model.Player;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public String players(Model model) {
        model.addAttribute("players", playerService.players());
        return "home";
    }
}
