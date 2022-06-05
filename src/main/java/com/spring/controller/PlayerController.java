package com.spring.controller;

import com.spring.model.Player;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add-player")
    public String addPlayer(Model model) {
        model.addAttribute("player", new Player());
        return "add-player";
    }

    @PostMapping("/save-player")
    public String savePlayer(@ModelAttribute("player") Player player) {
        playerService.addPlayer(player);
        return "redirect:/players";
    }

    @GetMapping("/get-player")
    public String getPlayer(@RequestParam("playerid") int id, Model model) {
        model.addAttribute("player", playerService.getPlayer(id));
        return "add-player";
    }

    @GetMapping("/delete-player")
    public String deletePlayer(@RequestParam("playerId") int id) {
        playerService.deletePlayer(id);
        return "redirect:/players";
    }




















}
