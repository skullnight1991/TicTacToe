package evaluation;

public class Minimax {
	public int miniMax(char[][] gameBoard, boolean player, int depth) {
		WinLoseStatus checkWinSide = new WinLoseStatus();
		CheckMove isMoveLeft = new CheckMove();
		
		//Assign the Win Value to score
		int score = checkWinSide.checkWinner(gameBoard);
		
		//If it's the maximizer's score
		if (score == 10)
			return score;
		
		if (score == -10)
			return score;
		
		if (isMoveLeft.isMoveLeft(gameBoard) == false)
			return 0;
		
		
		if (player) {
			//If maximizer, best = -1000, if minimizer, best = 1000
			int best = -1000;
			
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col <3; col++) {
					if (gameBoard[row][col] == '_') {
						//Pick the firstmost empty cell
						gameBoard[row][col] = Main.player;
						
						//Choose the maximum value
						best = Math.max(best, miniMax(gameBoard, !player, depth + 1));
						
						//Undo the move
						gameBoard[row][col] = '_';
					}
				}
			}
			
			return best;
		}
		//Minimizer's move
		else {
			int best = 1000;
			
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col <3; col++) {
					if (gameBoard[row][col] == '_') {
						//Pick the firstmost empty cell
						gameBoard[row][col] = Main.opponent;
						
						//Choose the maximum value
						best = Math.min(best, miniMax(gameBoard, !player, depth + 1));
						
						//Undo the move
						gameBoard[row][col] = '_';
					}
				}
			}
			
			return best;
		}
	}
}