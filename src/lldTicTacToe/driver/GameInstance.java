package lldTicTacToe.driver;

import java.util.ArrayList;
import java.util.List;

import lldTicTacToe.entity.Player;

public class GameInstance {

	private static GameInstance gameInstance;
	private final List<Player> players = new ArrayList<Player>();

	private GameInstance() {

	}

	public static GameInstance getInstance() {

		if (gameInstance == null) {
			gameInstance = new GameInstance();
		}
		return gameInstance;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public void deletePlayer(Player player) {
		players.remove(player);
	}
}
