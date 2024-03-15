package mknorn.ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Team;
import mknorn.ticketsystem.repository.TeamRepository;

@Controller
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	public @ResponseBody String addNewTeam(@RequestParam String name) {
		
		Team team = new Team();
		team.setName(name);
		teamRepository.save(team);
		
		return "Saved";
	}
}
