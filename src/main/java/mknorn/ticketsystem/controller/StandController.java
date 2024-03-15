package mknorn.ticketsystem.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.model.Stand;
import mknorn.ticketsystem.repository.StandRepository;

@Controller
public class StandController {

	@Autowired
	private StandRepository standRepository;
	
	public @ResponseBody String addNewStand(@RequestParam String name, @RequestParam Set<Area> areas) {
		
		Stand stand = new Stand();
		stand.setName(name);
		stand.setAreas(areas);
		standRepository.save(stand);
		
		return "Saved";
	}
}
