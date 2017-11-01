package com.example.demo;

import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.demo.Player.Player;
import com.example.demo.Team.Team;
import com.example.demo.dao.TeamDao;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(DemoApplication.class);
				
	}
	
	@PostConstruct
	public void init()
	{
		Player player1 = new Player("Presscot","QB");
		Player player2 = new Player("Zeke","RB");
		HashSet<Player> players = new HashSet<Player>();
		players.add(player1);
		players.add(player2);
		Team team = new Team("Cowboys","Star",players);
		
		teamDao.save(team);
		
	}
	
	@Autowired
	TeamDao teamDao;
	
}
