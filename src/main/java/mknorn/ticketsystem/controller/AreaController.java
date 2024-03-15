package mknorn.ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.model.Stand;
import mknorn.ticketsystem.repository.AreaRepository;

@Controller
public class AreaController {

	@Autowired
	private AreaRepository areaRepository;
	
	public @ResponseBody String addNewArea(@RequestParam String name, @RequestParam boolean seated, @RequestParam double price, @RequestParam Stand stand) {
		
		Area area = new Area();
		area.setName(name);
		area.setSeated(seated);
		area.setPrice(price);
		area.setStand(stand);
		areaRepository.save(area);
		
		return "Saved";
	}
}
