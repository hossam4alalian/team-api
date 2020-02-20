package io.team.springbootstarter.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;
	

	// This function shows all the players that i have with a GET request.
	public List<Player> getAllPlayers() {
		List<Player> players=new ArrayList<>();
		playerRepository.findAll().forEach(players::add);
		return players;
	}
	
	//this function shows a specific player in the team with a GET request.
	public Player getPlayer(String number) {
		return playerRepository.findById(number).orElse(null);
	}

	//this function adds a player to my team with a POST request.
	public void addPlayer(Player player) {
		playerRepository.save(player);
	}

	//this function allows me to edit any player in my team using a PUT request.
	public void updatePlayer(String number, Player player) {
		playerRepository.save(player);
	}

	//this function allows me to remove any player in my team using a DELETE request.
	public void deletePlayer(String number) {
		
		playerRepository.deleteById(number);
	}
}
