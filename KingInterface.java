package chess;

import java.util.ArrayList;

public interface KingInterface {
	
	public boolean isCheck();
	
	public void setMoveSquares(Board board);
	
	public void setAttackSquares(Board board);
	
	public void setSquare(Square newSquare);
	
	public char getColor();
	
	public ArrayList<Square> getMoveSquares();
	
	public Square getSquare();
	
	public boolean isMoved();
	
	public String toString();

}
