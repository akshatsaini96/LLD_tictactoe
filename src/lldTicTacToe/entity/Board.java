package lldTicTacToe.entity;

public class Board {
	@SuppressWarnings("unused")
	private final Integer size;
	private final PlayingPiece[][] playingBoard;

	public Board(Integer size) {
		this.size = size;
		playingBoard = new PlayingPiece[size][size];
	}

	public PlayingPiece[][] getPlayingBoard() {
		return playingBoard;
	}

	public Boolean isSlotAvailable(int row, int col) {
		if (playingBoard[row][col] == null)
			return true;
		else
			return false;

	}

	public Boolean addPiece(int row, int col, PlayingPiece playingPiece) {
		if (isSlotAvailable(row, col)) {
			playingBoard[row][col] = playingPiece;
			return true;
		}
		return false;

	}

	public Boolean isBoardFull() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (playingBoard[i][j] == null)
					return false;
			}
		}
		return true;
	}

	public void printBoard() {
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				System.out.print(playingBoard[i][j] + " | ");
			}
			System.out.println("");
			System.out.println("");
		}

	}

}
