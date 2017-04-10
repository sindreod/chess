package chess;

import java.util.ArrayList;

public class Player{
	
	private String name;
	private char color;
	private ArrayList<Square> pieceSquares;
	
	public Player(Board board, char color) {
		this.color = color;
		System.out.println("Enter name: ");
		String name = Chess.scan.nextLine();
		this.name = name;
		this.pieceSquares = startSquares(color, board);
	}
	
	public String getName() {
		return name;
	}
	
	public char getColor() {
		return color;
	}
	
	public ArrayList<Square> getPieceSquares() {
		return pieceSquares;
	}
	
	public void setPieceSquares(Square oldSquare, Square newSquare) {
		pieceSquares.remove(oldSquare);
		pieceSquares.add(newSquare);
	}
	
	private ArrayList<Square> startSquares(char color, Board board) {
		ArrayList<Square> squares = new ArrayList<Square>();
		int rank = 0;
		int endRank = 0;
		if (color == 'w') {
			rank = 1;
			endRank = 2;
		} else if (color == 'b') {
			rank = 7;
			endRank = 8;
		} for (;rank <= endRank; rank++) {
			for(int file = 1; file <= 8; file++) {
				squares.add(board.getSquare(File.toChar(file), rank));
			}
		}return squares;
	}
	
	
}
