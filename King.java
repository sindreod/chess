package chess;

public class King extends Piece implements KingInterface{
	
	public King(char color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void setMoveSquares(Board board) {
		moveSquares.clear();
		if (this.up(board)[0] > 0) {
			moveSquares.add(board.getSquare(getFile(), getRank()+1));
		} if (this.down(board)[0] > 0) {
			moveSquares.add(board.getSquare(getFile(), getRank()-1));
		} if (this.right(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()));
		} if (this.left(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()));
		} if (this.upRight(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()+1));
		} if (this.upLeft(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()+1));
		} if (this.downRight(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()-1));
		} if (this.downLeft(board)[0] > 0) {
			moveSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()-1));
		} 
	}
	
	public void setAttackSquares(Board board) {
		attackSquares.clear();
		if (this.up(board)[1] > 0) {
			attackSquares.add(board.getSquare(getFile(), getRank()+1));
		} if (this.down(board)[1] > 0) {
			attackSquares.add(board.getSquare(getFile(), getRank()-1));
		} if (this.right(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()));
		} if (this.left(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()));
		} if (this.upRight(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()+1));
		} if (this.upLeft(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()+1));
		} if (this.downRight(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()+1), getRank()-1));
		} if (this.downLeft(board)[1] > 0) {
			attackSquares.add(board.getSquare(File.toChar(getFile()-1), getRank()-1));
		} 
	}
	
	public boolean isCheck() {
		//TODO
		return true;
	}
	
	public String toString() {
		return String.valueOf(this.getColor()) + 'K';
	}

}
