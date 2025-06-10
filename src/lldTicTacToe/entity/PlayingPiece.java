package lldTicTacToe.entity;

import lldTicTacToe.constant.PieceType;

public class PlayingPiece {
	private final PieceType pieceType;

	public PlayingPiece(PieceType pieceType) {
		this.pieceType = pieceType;
	}

	public PieceType getPieceType() {
		return pieceType;
	}

	@Override
	public String toString() {
		return pieceType.toString();
	}

}
