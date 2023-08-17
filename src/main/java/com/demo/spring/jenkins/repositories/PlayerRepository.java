package com.demo.spring.jenkins.repositories;

import com.demo.spring.jenkins.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepository extends JpaRepository<Player,Integer>
{


}
