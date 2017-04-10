package chess;

public class Rook extends Piece implements RookInterface{
	
	public Rook(char color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void setMoveSquares(Board board) {
		moveSquares.clear();
		for (int i = 0; i < this.up(board)[0]; i++) {
			moveSquares.add(board.getSquare(getFile(), getRank()+1));
		}for (int i = 0; i < this.right(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()));
		}for (int i = 0; i < this.down(board)[0]; i++) {
			moveSquares.add(board.getSquare(getFile(), getRank()-1));
		}for (int i = 0; i < this.left(board)[0]; i++) {
			moveSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()));
		}
	}
	
	public void setAttackSquares(Board board) {
		attackSquares.clear();
		for (int i = 0; i < this.up(board)[0]; i++) {
			attackSquares.add(board.getSquare(getFile(), getRank()+1));
		}for (int i = 0; i < this.right(board)[0]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()));
		}for (int i = 0; i < this.down(board)[0]; i++) {
			attackSquares.add(board.getSquare(getFile(), getRank()-1));
		}for (int i = 0; i < this.left(board)[0]; i++) {
			attackSquares.add(board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()));
		}
	}
	
	public String toString() {
		return String.valueOf(this.getColor()) + 'R';
	}

}
