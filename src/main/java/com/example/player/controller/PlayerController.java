package com.example.player.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PlayerController {
    @Autowired
    private PlayerH2Service service;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return service.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int id) {
        return service.getPlayerById(id);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return service.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerById(@RequestBody Player player, @PathVariable("playerId") int id) {
        return service.updatePlayerById(player, id);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayerById(@PathVariable("playerId") int id) {
        service.deletePlayerById(id);
    }
}
