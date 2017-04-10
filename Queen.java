package chess;

public class Queen extends Piece implements QueenInterface{

	public Queen(char color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void setMoveSquares(Board board) {
		moveSquares.clear();
		for (int i = 0; i < this.up(board)[0]; i++) {
			moveSquares.add(board.getSquare(getFile(), getRank()+i));
		} for (int i = 0; i < this.down(board)[0]; i++) {
			moveSquares.add(board.getSquare(getFile(), getRank()-i));
		} for (int i = 0; i < this.right(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()));
		} for (int i = 0; i < this.left(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()));
		} for (int i = 0; i < this.upRight(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()+i));
		} for (int i = 0; i < this.upLeft(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()+i));
		} for (int i = 0; i < this.downRight(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()-i));
		} for (int i = 0; i < this.downLeft(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()-i)); 
		}
	}
	
	public void setAttackSquares(Board board) {
		attackSquares.clear();
		for (int i = 0; i < this.up(board)[1]; i++) {
			attackSquares.add(board.getSquare(getFile(), getRank()+i));
		} for (int i = 0; i < this.down(board)[1]; i++) {
			attackSquares.add(board.getSquare(getFile(), getRank()-i));
		} for (int i = 0; i < this.right(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()));
		} for (int i = 0; i < this.left(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()));
		} for (int i = 0; i < this.upRight(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()+i));
		} for (int i = 0; i < this.upLeft(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()+i));
		} for (int i = 0; i < this.downRight(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+i), getRank()-i));
		} for (int i = 0; i < this.downLeft(board)[1]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-i), getRank()-i)); 
		}
	}
	
	public String toString() {
		return String.valueOf(this.getColor()) + 'Q';
	}
}
