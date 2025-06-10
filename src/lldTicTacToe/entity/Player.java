package lldTicTacToe.entity;

public class Player {
	private String name;
	private PlayingPiece playingPiece;

	public Player(String name, PlayingPiece playingPiece) {
		super();
		this.name = name;
		this.playingPiece = playingPiece;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayingPiece getPlayingPiece() {
		return playingPiece;
	}

	public void setPlayingPiece(PlayingPiece playingPiece) {
		this.playingPiece = playingPiece;
	}

}
