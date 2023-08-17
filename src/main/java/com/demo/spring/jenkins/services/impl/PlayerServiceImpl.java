package com.demo.spring.jenkins.services.impl;


import com.demo.spring.jenkins.entities.Player;
import com.demo.spring.jenkins.repositories.PlayerRepository;
import com.demo.spring.jenkins.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerServiceImpl implements PlayerService
{

    @Autowired
    private PlayerRepository playerRepository;


    @Override
    public Player create(Player player)
    {
        return this.playerRepository.save(player);
    }



    @Override
    public List<Player> getAllPlayers()
    {
        return this.playerRepository.findAll();
    }



    @Override
    public Player getPlayer(int playerId)
    {
        return this.playerRepository.findById(playerId).orElseThrow(()-> new RuntimeException("Player you are looking for not found on the server !!"));
    }
}

