package chess;

import java.util.ArrayList;

public class Board {
	
	private ArrayList<ArrayList<Square>> board;
	
	public Board() {
		board = new ArrayList<ArrayList<Square>>();
		for (int row = 0; row < 8; row++) {
			board.add(new ArrayList<Square>());
			for (int col = 0; col < 8; col++) {
				board.get(row).add(new Square(row+1,col+1));
			}
		}
		this.getSquare('A', 1).setPiece(new Rook('w'));
		this.getSquare('B', 1).setPiece(new Knight('w'));
		this.getSquare('C', 1).setPiece(new Bishop('w'));
		this.getSquare('D', 1).setPiece(new Queen('w'));
		this.getSquare('E', 1).setPiece(new King('w'));
		this.getSquare('F', 1).setPiece(new Bishop('w'));
		this.getSquare('G', 1).setPiece(new Knight('w'));
		this.getSquare('H', 1).setPiece(new Rook('w'));
		this.getSquare('A', 8).setPiece(new Rook('b'));
		this.getSquare('B', 8).setPiece(new Knight('b'));
		this.getSquare('C', 8).setPiece(new Bishop('b'));
		this.getSquare('D', 8).setPiece(new Queen('b'));
		this.getSquare('E', 8).setPiece(new King('b'));
		this.getSquare('F', 8).setPiece(new Bishop('b'));
		this.getSquare('G', 8).setPiece(new Knight('b'));
		this.getSquare('H', 8).setPiece(new Rook('b'));
		for (int i = 1; i <= 8; i++) {
			char c = 'w';
			this.getSquare(File.toChar(i), 2).setPiece(new Pawn(c));
			c = 'b';
			this.getSquare(File.toChar(i), 7).setPiece(new Pawn(c));
		}
	}
	
	public ArrayList<ArrayList<Square>>getBoard() {
		return board;
	}
	
	public Square getSquare(char file, int rank){
		return board.get(rank-1).get(File.toInt(file)-1);
	}
	
	public boolean isMate() {
		//TODO
		return false;
	}
	
	public String toString() {
		String res = new String();
		for (int i = 7; i >= 0; i--) {
			res += "\n\t----------------------------------------------------------------\n" + (i+1) + "\t|";
			for (int j = 0; j < 8; j++) {
				if( board.get(i).get(j).getPiece() != null) {
					res += board.get(i).get(j).getPiece();
				}
				res +=  "\t|";	
			} 
		}
		res += "\n\t----------------------------------------------------------------\n";
		res += "\t   A\t   B\t   C\t   D\t   E\t   F\t   G\t   H";
		return res;
	}
}
