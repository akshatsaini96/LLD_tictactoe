package lldTicTacToe.driver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import lldTicTacToe.constant.PieceType;
import lldTicTacToe.entity.Board;
import lldTicTacToe.entity.Player;
import lldTicTacToe.entity.PlayingPiece;

public class TicTacToeGame {
	Deque<Player> deque;
	Board board;

	public TicTacToeGame() {
		initialize();
	}

	public void initialize() {

		deque = new LinkedList<Player>();
		PlayingPiece pieceO = new PlayingPiece(PieceType.O);
		Player playerO = new Player("aksh", pieceO);
		deque.add(playerO);
		PlayingPiece pieceX = new PlayingPiece(PieceType.X);
		Player playerX = new Player("sh", pieceX);
		deque.add(playerX);
		board = new Board(3);

	}

	public String startGame() {
		System.out.println("in startGame");
		boolean noWinner = true;

		while (noWinner) {

			if (board.isBoardFull())
				return "tie";

			board.printBoard();
			Player curPlayer = deque.removeLast();
			System.out.print(curPlayer.getName() + "--" + "enter row,col");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] values = input.split(",");

			int inputRow = Integer.valueOf(values[0]);
			int inputCol = Integer.valueOf(values[1]);
			boolean isSuccessfullyAdded = board.addPiece(inputRow, inputCol, curPlayer.getPlayingPiece());
			if (!isSuccessfullyAdded) {
				System.out.println("incorrect position add again");
				deque.addLast(curPlayer);
				continue;
			}
			boolean winner = isThereAWinner(inputRow, inputCol, curPlayer.getPlayingPiece());
			if (winner)
				return "Winner is -" + curPlayer.getName();
			deque.addFirst(curPlayer);
		}
		return "tie";
	}

	public boolean isThereAWinner(int inputRow, int inputCol, PlayingPiece curPiece) {
		PlayingPiece[][] curBoard = board.getPlayingBoard();
		boolean isWinner = true;
		// row
		for (int i = 0; i < 3; i++) {
			if (curBoard[inputRow][i] != curPiece) {
				isWinner = false;
				break;
			}

		}
		if (isWinner)
			return true;

		isWinner = true;
		// col
		for (int i = 0; i < 3; i++) {
			if (curBoard[i][inputCol] != curPiece) {
				isWinner = false;
				break;
			}
		}
		if (isWinner)
			return true;
		isWinner = true;
		// diagonal
		if (inputRow == inputCol) {
			int j = 0;

			for (int i = 0; i < 3; i++) {
				if (curBoard[i][j++] != curPiece) {
					isWinner = false;
					break;
				}
			}
			if (isWinner)
				return true;
		}

		isWinner = true;
		if (inputRow + inputCol == 2) {
			int j = 2;

			for (int i = 0; i < 3; i++) {
				if (curBoard[i][j--] != curPiece) {
					isWinner = false;
					break;
				}
			}
			if (isWinner)
				return true;
		}

		return false;

	}

}
