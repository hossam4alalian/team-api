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

	public List<Player> getAllPlayers() {
		return players;
	}
	
	public Player getPlayer(String number) {
		return players.stream().filter(e -> e.getNumber().equals(number)).findFirst().get();
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	
}
