package chess;

import java.util.Scanner;

public class Chess {
	
	public static final Scanner scan = new Scanner(System.in);
	private Board board;
	@SuppressWarnings("unused")
	private Player white;
	@SuppressWarnings("unused")
	private Player black;
	
	private Chess() {
		board = new Board();
		white = new Player(board, 'w');
		black = new Player(board, 'b');
	}
	
	private void turn() {
		Piece piece = pickPiece();
		setPiece(piece);
	}
	
	
	
	private Piece pickPiece() {
		System.out.println("Chess notation for piece to move: ");
		String input = scan.nextLine();
		Square square = board.getSquare(input.charAt(0), Integer.parseInt(String.valueOf(input.charAt(1))));
		return square.getPiece();
	}
	
	private void setPiece(Piece piece) {
		System.out.println("Chess notation for square to move to: ");
		String input = scan.nextLine();
		Square square = board.getSquare(input.charAt(0), Integer.parseInt(String.valueOf(input.charAt(1))));
		piece.setSquare(square);
	}
	
	@SuppressWarnings("unused")
	private void gamePlay() {
		//TODO
	}
	
	public static void main(String[] args) {
		Chess chess = new Chess();
		System.out.println(chess.board);
		for (int i = 0; i < 10; i++) {
			chess.turn();
			System.out.println(chess.board);
		}
	}
}
