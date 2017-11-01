package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.Player.Player;
import com.example.demo.Team.Team;

@RestResource(path="footballPlayer",rel="players")
public interface PlayerDao extends CrudRepository<Player,Long>{

	
	
}
