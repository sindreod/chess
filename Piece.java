package chess;

import java.util.ArrayList;

public class Piece implements PieceInterface {
	
	private Square square;
	private char color;
	private boolean moved;
	protected ArrayList<Square> moveSquares;
	protected ArrayList<Square> attackSquares;
	
	public Piece(char color) {
		if (color == 'w' || color == 'b') {
			this.color = color;
		}
		this.moved = false;
	}
	
	protected int getRank() {
		return square.getRank();
	}
	
	protected char getFile() {
		return square.getFile();
	}
	
	public Square getSquare(){
		return square;
	}
	
	public void setSquare(Square newSquare) {
		// Sjekk om kobling er rett
		if(this.square == newSquare) {
			return;
		}
		// Husk den gamle og sett ny
		Square oldSquare = this.square;
		this.square = newSquare;
		// Hvis det fantes kobling for --> koble den andre fra
		if (oldSquare != null && oldSquare.getPiece() == this) {
			oldSquare.setPiece(null);
		}
		// Hvis ny kobling, koble den andre til
		if (this.square != null) {
			this.square.setPiece(this);
		}
	}
	
	public boolean isMoved() {
		return moved;
	}
	
	public void setMoved(boolean moved) {
		this.moved = moved;
	}
	
	public char getColor() {
		return color;
	}
	
	public ArrayList<Square> getMoveSquares() {
		return moveSquares;
	}
	
	public String toString() {
		return " ";
	}
	
	protected int[] up(Board board){
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 0;
		int rankLoop = this.getRank() + 1;
		while (rankLoop <= 8) {
			if (board.getSquare(this.getFile(), rankLoop).getPiece() == null) {
				res[0] += 1;
				res[1] += 1;
				rankLoop += 1;
			}else if (board.getSquare(getFile(), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(getFile(), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		} return res;
	}
	
	protected int[] down(Board board) {
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 0;
		int rankLoop = this.getRank() - 1;
		while (rankLoop >= 1) {
			if (board.getSquare(this.getFile(), rankLoop).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				rankLoop -= 1;
			} else if (board.getSquare(getFile(), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(getFile(), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}
		return res;
	}
	
	protected int[] right(Board board) {
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 0;
		int fileLoop = File.toInt(getFile()) + 1;
		while (fileLoop <= 8) {
			if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop += 1;
			} else if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}
		return res;
	}
	
	protected int[] left(Board board) {
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 0;
		int fileLoop = File.toInt(getFile()) - 1;
		while (fileLoop >= 1) {
			if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop -= 1;
			} else if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), this.getRank()).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}
		return res;
	}
	
	protected int[] upLeft(Board board) {
		int[] res = new int[2];
		int fileLoop = File.toInt(this.getFile()) - 1;
		int rankLoop = this.getRank() + 1;
		while (fileLoop >= 1 && rankLoop <= 8) {
			if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop -= 1;
				rankLoop += 1;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}return res;
	}
	
	protected int[] upRight(Board board) {
		int[] res = new int[2];
		int fileLoop = File.toInt(this.getFile()) + 1;
		int rankLoop = this.getRank() + 1;
		while (fileLoop >= 1 && rankLoop <= 8) {
			if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop += 1;
				rankLoop += 1;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}return res;
	}
	
	protected int[] downLeft(Board board) {
		int[] res = new int[2];
		int fileLoop = File.toInt(this.getFile()) - 1;
		int rankLoop = this.getRank() - 1;
		while (fileLoop >= 1 && rankLoop <= 8) {
			if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop -= 1;
				rankLoop -= 1;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}return res;
	}
	
	protected int[] downRight(Board board) {
		int[] res = new int[2];
		int fileLoop = File.toInt(this.getFile()) + 1;
		int rankLoop = this.getRank() - 1;
		while (fileLoop >= 1 && rankLoop <= 8) {
			if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().equals(null)) {
				res[0] += 1;
				res[1] += 1;
				fileLoop += 1;
				rankLoop -= 1;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() != this.getColor()) {
				res[0] += 1;
				res[1] += 1;
				return res;
			} else if (board.getSquare(File.toChar(fileLoop), rankLoop).getPiece().getColor() == this.getColor()) {
				res[1] += 1;
				return res;
			}
		}return res;
	}
	
	protected ArrayList<Piece> getPieces(Board board) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		int rank = this.getRank() - 1;
		while (rank >= 0) {
			if (board.getSquare(getFile(), rank).getPiece() == null) {
				rank -= 1;
			} else {
				pieces.add(board.getSquare(getFile(), rank).getPiece());
				break;
			}
		} rank = this.getRank() + 1;
		while (rank <= 8) {
			if (board.getSquare(getFile(), rank).getPiece() == null) {
				rank += 1;
			} else {
				pieces.add(board.getSquare(getFile(), rank).getPiece());
				break;
			}
		}
		int file = File.toInt(getFile()) - 1;
		while (file >= 0 ) {
			if (board.getSquare(File.toChar(file), getRank()).getPiece() == null) {
				file -= 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), getRank()).getPiece());
				break;
			}
		} file = File.toInt(getFile()) + 1;
		while (file <= 8) {
			if (board.getSquare(File.toChar(file), getRank()).getPiece() == null) {
				file += 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), getRank()).getPiece());
				break;
			} 
		} rank = this.getRank() + 1;
		file = File.toInt(getFile()) + 1;
		while (file <= 8 && rank <= 8) {
			if (board.getSquare(File.toChar(file), rank).getPiece() == null) {
				file += 1;
				rank += 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), rank).getPiece());
				break;
			}
		} rank = this.getRank() - 1;
		file = File.toInt(getFile()) - 1;
		while (file >= 0 && rank >= 0) {
			if (board.getSquare(File.toChar(file), rank).getPiece() == null) {
				file -= 1;
				rank -= 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), rank).getPiece());
				break;
			}
		} rank = this.getRank() - 1;
		file = File.toInt(getFile()) + 1;
		while (file <= 8 && rank >= 0) {
			if (board.getSquare(File.toChar(file), rank).getPiece() == null) {
				rank -= 1;
				file += 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), rank).getPiece());
				break;
			}
		} rank = this.getRank() + 1;
		file = File.toInt(getFile()) - 1;
		while (file >= 0 && rank <= 8) {
			if (board.getSquare(File.toChar(file), rank).getPiece() == null) {
				rank += 1;
				file -= 1;
			} else {
				pieces.add(board.getSquare(File.toChar(file), rank).getPiece());
				break;
			}
		} if (File.toInt(getFile()) <= 7 && getRank() <= 6) {
			if (board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()+2).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()+2).getPiece());
			}
		} if (File.toInt(getFile()) <= 7 && getRank() >= 3) {
			if (board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()-2).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())+1), getRank()-2).getPiece());
			}
		} if (File.toInt(getFile()) <= 6 && getRank() <= 7) {
			if (board.getSquare(File.toChar(File.toInt(getFile())+2), getRank()+1).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())+2), getRank()+1).getPiece());
			}
		} if (File.toInt(getFile()) <= 6 && getRank() >= 2) {
			if (board.getSquare(File.toChar(File.toInt(getFile())+2), getRank()-1).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())+2), getRank()-1).getPiece());
			}
		} if (File.toInt(getFile()) >= 2 && getRank() <= 6) {
			if (board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()+2).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()+2).getPiece());
			}
		} if (File.toInt(getFile()) >= 2 && getRank() >= 3) {
			if (board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()-2).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())-1), getRank()-2).getPiece());
			} 
		} if (File.toInt(getFile()) >= 3 && getRank() <= 7) {
			if (board.getSquare(File.toChar(File.toInt(getFile())-2), getRank()+1).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())-2), getRank()+1).getPiece());
			}
		} if (File.toInt(getFile()) >= 3 && getRank() >= 3) {
			if (board.getSquare(File.toChar(File.toInt(getFile())-2), getRank()-1).getPiece().getColor() == this.getColor()) {
				pieces.add(board.getSquare(File.toChar(File.toInt(getFile())-2), getRank()-1).getPiece());
			} 
		} return pieces;
	}

	
	/*
	protected int vertical(Board board, int way) {
		int res = 0;
		int limitStart = 0;
		int rankLoop = this.getRank() + way;
		if (way == 1) {
			limitStart = 8;
		}else if (way == -1) {
			limitStart = 0;
		}
		while (way*(board.getSquare(getFile(), rankLoop).getRank()) <= limitStart && board.getSquare(this.getFile(), rankLoop).getPiece().equals(null)) {
			res += 1;
			rankLoop += way;
		}
		if (board.getSquare(file, rankLoop).getPiece().getColor() != this.getColor()) {
			res += 1;
		}
		return res;
	}*/
}
