package com.demo.spring.jenkins.services;

import com.demo.spring.jenkins.entities.Player;

import java.util.List;

public interface PlayerService
{
    // create Player
    Player create(Player player);



    // get all Players
    List<Player> getAllPlayers();



    // get single Player
    Player getPlayer(int playerId);

}
