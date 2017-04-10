package chess;

import java.util.ArrayList;

public class Knight extends Piece implements KnightInterface{

	public Knight(char color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Square> getMoves(Board board){
		ArrayList<Square> moves = new ArrayList<Square>();
		if (up2Right1(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())+1), this.getRank()+2));
		} if (up1Right2(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())+2), this.getRank()+1));
		} if (down1Right2(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())+2), this.getRank()-1));
		} if (down2Right1(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())+1), this.getRank()-2));
		} if (down2Left1(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())-1), this.getRank()-2));
		} if (down1Left2(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())-2), this.getRank()-1));
		} if (up1Left2(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())-2), this.getRank()+1));
		} if (up2Left1(board)) {
			moves.add(board.getSquare(File.toChar(File.toInt(getFile())-1), this.getRank()+2));
		} //TODO Castle, Check
		return moves;
	}
	
	private boolean up2Right1(Board board) {
		if (File.toInt(this.getSquare().getFile()) <= 7 && this.getSquare().getRank() <= 6) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())+1), this.getRank()+2);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}
	
	private boolean up1Right2(Board board) {
		if (File.toInt(this.getSquare().getFile()) <= 6 && this.getSquare().getRank() <= 7) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())+2), this.getRank()+1);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}
	
	private boolean down1Right2(Board board) {
		if (File.toInt(this.getSquare().getFile()) <= 6 && this.getSquare().getRank() >= 2) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())+2), this.getRank()-1);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}
	
	private boolean up2Left1(Board board) {
		if (File.toInt(this.getSquare().getFile()) >= 2 && this.getSquare().getRank() <= 6) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())-1), this.getRank()+2);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}

	private boolean up1Left2(Board board) {
		if (File.toInt(this.getSquare().getFile()) >= 3 && this.getSquare().getRank() <= 7) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())-2), this.getRank()+1);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}

	private boolean down1Left2(Board board) {
		if (File.toInt(this.getSquare().getFile()) >= 3 && this.getSquare().getRank() >= 2) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())-2), this.getRank()-1);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}

	private boolean down2Left1(Board board) {
		if (File.toInt(this.getSquare().getFile()) >= 2 && this.getSquare().getRank() >= 3) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())-1), this.getRank()-2);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}

	private boolean down2Right1(Board board) {
		if (File.toInt(this.getSquare().getFile()) <= 7 && this.getSquare().getRank() >= 3) {
			Square moveToSquare = board.getSquare(File.toChar(File.toInt(getFile())+1), this.getRank()-2);
			if (moveToSquare.getPiece().equals(null)) {
				return true;
			} else {
				return this.getColor() != moveToSquare.getPiece().getColor();
			}
		} return false;
	}

	public String toString() {
		return String.valueOf(this.getColor()) + 'N';
	}

}
