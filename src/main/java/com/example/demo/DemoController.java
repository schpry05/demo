
package com.example.demo;

import java.util.HashSet;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Player.Player;
import com.example.demo.Team.Team;
import com.example.demo.dao.TeamDao;

@Controller
public class DemoController {
	
	@Autowired
	private TeamDao teamDao;
	
	@Value("${lucky-word}")
	private String myWord;
	
	
	@RequestMapping("/hi/{name}")
	public String landing(Map model, @PathVariable String name)
	{
		model.put("name", name);
		return "hello";
	}
	
	@RequestMapping("/sports/{name}")
	public @ResponseBody Team printTeam(@PathVariable String name)
	{
		return teamDao.findByName(name);
		
	}
	
	@RequestMapping("/config")
	public @ResponseBody String printEnvVar()
	{
		return "Env Var Value is " + myWord;
		
	}

}
