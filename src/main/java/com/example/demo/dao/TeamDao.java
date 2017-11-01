package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.Team.Team;

@RestResource(path="football",rel="teams")
public interface TeamDao extends CrudRepository<Team,Long>{

	List<Team> findAll();
	
	Team findByName(String name);

	
	
}
