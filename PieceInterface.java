package chess;

import java.util.ArrayList;

public interface PieceInterface {
	
	public Square getSquare();
	
	public void setSquare(Square square);
	
	public boolean isMoved();
	
	public void setMoved(boolean moved);
	
	public char getColor();
	
	public ArrayList<Square> getMoveSquares();
	
	public String toString();
	
}
