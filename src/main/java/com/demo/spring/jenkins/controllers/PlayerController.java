package com.demo.spring.jenkins.controllers;


import com.demo.spring.jenkins.entities.Player;
import com.demo.spring.jenkins.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/players")
public class PlayerController
{

    @Autowired
    private PlayerService playerService;


    @PostMapping("/create")
    public Player addPlayer(@RequestBody Player player)
    {
        return this.playerService.create(player);
    }


    @GetMapping
    public List<Player> getAllPlayers()
    {
        return this.playerService.getAllPlayers();
    }



    @GetMapping("/{playerId}")
    public Player getPlayer(@PathVariable int playerId)
    {
        return this.playerService.getPlayer(playerId);
    }


}


