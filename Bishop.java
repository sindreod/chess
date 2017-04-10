package chess;

public class Bishop extends Piece implements BishopInterface{
	
	public Bishop(char color) {
		super(color);
		// TODO Auto-generated constructor stub
		// Set squares on initialization
	}
	
	public void setMoveSquares(Board board) {
		moveSquares.clear();
		for (int i = 0; i < this.upRight(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+i), getRank()+i));
		} for (int i = 0; i < this.upLeft(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-i), getRank()+i));
		} for (int i = 0; i < this.downRight(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+i), getRank()-i));
		} for (int i = 0; i < this.downLeft(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-i), getRank()-i));
		} 
	}
	
	public void setAttackSquares(Board board) {
		attackSquares.clear();
		for (int i = 0; i < this.upRight(board)[1]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+i), getRank()+i));
		} for (int i = 0; i < this.upLeft(board)[1]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-i), getRank()+i));
		} for (int i = 0; i < this.downRight(board)[1]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+i), getRank()-i));
		} for (int i = 0; i < this.downLeft(board)[1]; i++) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-i), getRank()-i));
		} 
	}
	
	public String toString() {
		return String.valueOf(this.getColor()) + "B";
	}
}
