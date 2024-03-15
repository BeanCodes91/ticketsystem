package mknorn.ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Area;
import mknorn.ticketsystem.model.Block;
import mknorn.ticketsystem.repository.BlockRepository;

@Controller
public class BlockController {

	@Autowired
	private BlockRepository blockRepository;
	
	
	public @ResponseBody String addNewBlock(@RequestParam int number, @RequestParam Area area) {
		
		Block block = new Block();
		block.setNumber(number);
		block.setArea(area);
		blockRepository.save(block);
		
		return "Saved";
	}
}
