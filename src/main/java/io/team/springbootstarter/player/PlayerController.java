package io.team.springbootstarter.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	 @Autowired
	 private PlayerService playerService;
	 
	// This function shows all the players that i have with a GET request.
	 @RequestMapping("/players")
	 public List<Player> getAllPlayers() {
		 return playerService.getAllPlayers();
	}
	 
	//this function shows a specific player in the team with a GET request.
	 @RequestMapping("/players/{number}")
	 public Player getPlayer(@PathVariable String number) {
		 return playerService.getPlayer(number);
	 }
	 
	//this function adds a player to my team with a POST request.
	 @RequestMapping(method= RequestMethod.POST, value="/players")
	 public void addPlayer(@RequestBody Player player) {
		 playerService.addPlayer(player);
	 }
	 
	//this function allows me to edit any player in my team using a PUT request.
	 @RequestMapping(method= RequestMethod.PUT, value="/players/{number}")
	 public void updatePlayer(@RequestBody Player player, @PathVariable String number) {
		 playerService.updatePlayer(number, player);
	 }
	 
	//this function allows me to remove any player in my team using a DELETE request.
	 @RequestMapping(method= RequestMethod.DELETE, value="/players/{number}")
	 public void deletePlayer( @PathVariable String number) {
		 playerService.deletePlayer(number);
	 }
	 
	 
}
