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
	 
	 @RequestMapping("/players")
	 public List<Player> getAllPlayers() {
		 return playerService.getAllPlayers();
	}
	 
	 @RequestMapping("/players/{number}")
	 public Player getPlayer(@PathVariable String number) {
		 return playerService.getPlayer(number);
	 }
	 
	 @RequestMapping(method= RequestMethod.POST, value="/players")
	 public void addPlayer(@RequestBody Player player) {
		 playerService.addPlayer(player);
	 }
	 
	 @RequestMapping(method= RequestMethod.PUT, value="/players/{number}")
	 public void updatePlayer(@RequestBody Player player, @PathVariable String number) {
		 playerService.updatePlayer(number, player);
	 }
	 
	 @RequestMapping(method= RequestMethod.DELETE, value="/players/{number}")
	 public void deletePlayer( @PathVariable String number) {
		 playerService.deletePlayer(number);
	 }
	 
	 
}
