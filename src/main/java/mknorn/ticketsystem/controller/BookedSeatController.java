package mknorn.ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mknorn.ticketsystem.model.Block;
import mknorn.ticketsystem.model.BookedSeat;
import mknorn.ticketsystem.model.Game;
import mknorn.ticketsystem.repository.BookedSeatRepository;

@Controller
public class BookedSeatController {

	@Autowired
	private BookedSeatRepository bookedSeatRepository;
		
	public @ResponseBody String addNewBookedSeat(@RequestParam int number, @RequestParam Block block, @RequestParam Game game) {
		
		BookedSeat bookedSeat = new BookedSeat();
		bookedSeat.setNumber(number);
		bookedSeat.setBlock(block);
		bookedSeat.setGame(game);
		bookedSeatRepository.save(bookedSeat);
		
		return "Saved";
	}
}
