package chess;

public final class File {
	/*
	private static char file;
	
	File(char file) {
		if (file == 'A' || file == 'B' || file == 'C' || file == 'D' || 
			file == 'E' || file == 'F' || file == 'G' || file == 'H'){
			File.file = file;
		}
	}
	
	File(int file) {
		File.file = toChar(file);
	}
	*/
	static char toChar(int file) {
		switch (file) {
		case 1:
			return 'A';
		case 2:
			return 'B';
		case 3:
			return 'C';
		case 4:
			return 'D';
		case 5:
			return 'E';
		case 6:
			return 'F';
		case 7:
			return 'G';
		case 8:
			return 'H';
		default:
			return '1';
		}
	}
	
	static int toInt(char file){
		switch (Character.toUpperCase(file)) {
		case 'A':
			return 1;
		case 'B':
			return 2;
		case 'C':
			return 3;
		case 'D':
			return 4;
		case 'E':
			return 5;
		case 'F':
			return 6;
		case 'G':
			return 7;
		case 'H':
			return 8;
		default:
			return -1;
		}
	}
	
}
