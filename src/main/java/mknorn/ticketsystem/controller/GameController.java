package mknorn.ticketsystem.controller;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Game;
import mknorn.ticketsystem.model.Team;
import mknorn.ticketsystem.repository.GameRepository;

@Controller
public class GameController {

	@Autowired
	private GameRepository gameRepository;
	
	
	public @ResponseBody String addNewGame(Date gameDate, Set<Team> teams) {
		
		Game game = new Game();
		game.setGameDate(gameDate);
		game.setTeams(teams);
		gameRepository.save(game);
		
		return "Saved";
	}
}
