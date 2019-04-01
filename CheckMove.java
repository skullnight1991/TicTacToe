package evaluation;

public class CheckMove {
	public boolean isMoveLeft(char[][] gameBoard) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameBoard[i][j] == '_')
					return true;
			}
		}
		return false;
	}
}
