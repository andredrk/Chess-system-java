package chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

<<<<<<< HEAD
	public boolean[][] possibleMoves() {
		return null;
	}	
	
=======
>>>>>>> f827a40a0033358ac9a88f77a33a5dbf4ae2f0ef
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> f827a40a0033358ac9a88f77a33a5dbf4ae2f0ef
