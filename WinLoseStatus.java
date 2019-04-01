package evaluation;

public class WinLoseStatus {
	public int checkWinner(char[][] gameBoard) {
		//Check rows
		for (int row = 0; row < 3; row++) {
			if (gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] == gameBoard[row][2]) {
				if (gameBoard[row][0] == Main.player)
					return 10;
				if (gameBoard[row][0] == Main.opponent)
					return -10;
			}
		}
		
		//Check columns
		for (int col = 0; col < 3; col++) {
			if (gameBoard[0][col] == gameBoard[1][col] && gameBoard[1][col] == gameBoard[2][col]) {
				if (gameBoard[0][col] == Main.player)
					return 10;
				if (gameBoard[0][col] == Main.opponent)
					return -10;
			}
		}
		
		
		//Check diagonal
		if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
			if (gameBoard[0][0] == Main.player)
				return 10;
			if (gameBoard[0][0] == Main.opponent)
				return -10;
		}
		if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) {
			if (gameBoard[0][2] == Main.player)
				return 10;
			if (gameBoard[0][2] == Main.opponent)
				return -10;
		}
		
		return 0;
	}
}
