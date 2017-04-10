package chess;

public class Pawn extends Piece implements PawnInterface{
	
	private boolean enPassant;
	
	public Pawn(char color) {
		super(color);
		this.enPassant = false;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setMoveSquares(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttackSquares(Board board) {
		// TODO Auto-generated method stub
		
	}
	
	/*public ArrayList<Square> getMoves(Board board) {
		ArrayList<Square> moves = new ArrayList<Square>();
		if(this.getColor() == 'w'){
			if(this.up(board) >= 1) {
				moves.add(board.getSquare(getFile(), getRank()+1));
				this.enPassant = false;
			} if (this.up(board) >= 2 && !this.isMoved()) {
				moves.add(board.getSquare(getFile(), getRank()+1));
				this.enPassant = true;
			} //EnPassant
			  //Take
		} else if(this.getColor() == 'b'){
			if(this.down(board) >= 1) {
				moves.add(board.getSquare(getFile(), getRank()-1));
				this.enPassant = false;
			} if (this.down(board) >= 2 && !this.isMoved()) {
				moves.add(board.getSquare(getFile(), getRank()-1));
				this.enPassant = true;
			}
		}
		return moves;
	}*/
	/*
	private ArrayList<Square> enPassant(Board board) {
		ArrayList<Square> moves = new ArrayList<Square>();
		if (this.getColor() == 'w' && this.getFile() == 5) {
			Square upLeft = board.getSquare(this.toFileChar(getFileInt()-1), this.getRank());
			Square upRight = board.getSquare(this.toFileChar(getFileInt()+1), this.getRank());
			if (upLeft.getPiece() instanceof Pawn && upLeft.getPiece().getColor() == 'd') {
				if (((Pawn) upLeft.getPiece()).getEnPassant()){
					moves.add(upLeft);
				}
			} if (upRight.getPiece() instanceof Pawn && upRight.getPiece().getColor() == 'd') {
				if (((Pawn) upRight.getPiece()).getEnPassant()){
					moves.add(upRight);
				}
			}
		} else if (this.getColor() == 'd' && this.getFile() == 4) {
			Square upLeft = board.getSquare(this.toFileChar(getFileInt()-1), this.getRank());
			Square upRight = board.getSquare(this.toFileChar(getFileInt()+1), this.getRank());
			if (upLeft.getPiece() instanceof Pawn && upLeft.getPiece().getColor() == 'd') {
				if (((Pawn) upLeft.getPiece()).getEnPassant()){
					moves.add(upLeft);
				}
			} if (upRight.getPiece() instanceof Pawn && upRight.getPiece().getColor() == 'd') {
				if (((Pawn) upRight.getPiece()).getEnPassant()){
					moves.add(upRight);
				}
			}
	}*/
	
	public boolean getEnPassant() {
		return enPassant;
	}
	
	public String toString() {
		return String.valueOf(this.getColor()) + 'P';
	}

}
