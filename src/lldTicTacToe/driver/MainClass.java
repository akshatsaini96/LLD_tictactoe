package lldTicTacToe.driver;

import lldTicTacToe.entity.PlayingPiece;

public class MainClass {
	public static void main(String[] args) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		for (PlayingPiece[] p : ticTacToe.board.getPlayingBoard())

		{
			for (PlayingPiece p1 : p) {
				System.out.println(p1);
			}
		}
		System.out.println(ticTacToe.startGame());

	}

}
