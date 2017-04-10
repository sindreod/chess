package chess;

public class Square {
	
	private int rank;
	private char file;
	private Piece piece;
	private char color;
	
	public Square(int rank, int file) {
		if (rank < 9 && rank > 0) {
			this.rank = rank;
		}
		switch (file) {
		case 1:
			this.file = 'A';
			if(rank % 2 == 0) {
				this.color = 'l';
			} else {
				this.color = 'd';
			} break;
		case 2:
			this.file = 'B';
			if(rank % 2 == 0) {
				this.color = 'd';
			} else {
				this.color = 'l';
			} break;
		case 3:
			this.file = 'C';
			if(rank % 2 == 0) {
				this.color = 'l';
			} else {
				this.color = 'd';
			} break;
		case 4:
			this.file = 'D';
			if(rank % 2 == 0) {
				this.color = 'd';
			} else {
				this.color = 'l';
			} break;
		case 5:
			this.file = 'E';
			if(rank % 2 == 0) {
				this.color = 'l';
			} else {
				this.color = 'd';
			} break;
		case 6:
			this.file = 'F';
			if(rank % 2 == 0) {
				this.color = 'd';
			} else {
				this.color = 'l';
			} break;
		case 7:
			this.file = 'G';
			if(rank % 2 == 0) {
				this.color = 'l';
			} else {
				this.color = 'd';
			} break;
		case 8:
			this.file = 'H';
			if(rank % 2 == 0) {
				this.color = 'd';
			} else {
				this.color = 'l';
			} break;
		}
	}
	
	public void setPiece(Piece newPiece) {
		// Sjekk om kobling er rett
		if(this.piece == newPiece) {
			return;
		}
		// Husk den gamle og sett ny
		Piece oldPiece = this.piece;
		this.piece = newPiece;
		// Hvis det fantes kobling for --> koble den andre fra
		if (oldPiece != null && oldPiece.getSquare() == this) {
			oldPiece.setSquare(null);
		}
		// Hvis ny kobling, koble den andre til
		if (this.piece != null) {
			this.piece.setSquare(this);
		}
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	public char getColor() {
		return color;
	}
	
	
	
	public char getFile() {
		return file;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String toString() {
		return file + " " + rank;
	}
	
}
