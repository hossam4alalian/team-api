package io.team.springbootstarter.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class PlayerService {
	private List<Player> players= new ArrayList<>(Arrays.asList(new Player("10","blah", "Striker"),
			new Player("9","baaaaa", "Midfield"),
			new Player("5","Gustav", "Goal Keeper"),
			new Player("8","sssssssss", "Defence")
			));

	// This function shows all the players that i have with a GET request.
	public List<Player> getAllPlayers() {
		return players;
	}
	
	//this function shows a specific player in the team with a GET request.
	public Player getPlayer(String number) {
		return players.stream().filter(e -> e.getNumber().equals(number)).findFirst().get();
	}

	//this function adds a player to my team with a POST request.
	public void addPlayer(Player player) {
		players.add(player);
	}

	//this function allows me to edit any player in my team using a PUT request.
	public void updatePlayer(String number, Player player) {
		for(int i=0; i<players.size(); i++) {
			Player p=players.get(i);
			if(p.getNumber().equals(number)) {
				players.set(i, player);
				return;
			}
		}
	}

	//this function allows me to remove any player in my team using a DELETE request.
	public void deletePlayer(String number) {
		players.removeIf(e -> e.getNumber().equals(number));
		
	}
}
