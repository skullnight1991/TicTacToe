package evaluation;

public class FindBestMove {	
	protected int row = -1;
	protected int col = -1;
	
	public int findBestMove(char[][] gameBoard) {
		/*Player = true  -> 'x'
		 *Player = false -> 'o'*/
		Minimax miniMaxObj = new Minimax();
		
		int bestVal = -1000;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameBoard[i][j] == '_') {
					
					//Make the move
					gameBoard[i][j] = Main.player;
					
					//Compute the WinLoseStatus for this move
					int moveVal = miniMaxObj.miniMax(gameBoard, false, 0);
					
					//Undo the move
					gameBoard[i][j] = '_';
					
					//Check if the value of moveVal is > bestVal or not, if it is, update bestVal
					if (moveVal > bestVal) {
						this.row = i;
						this.col = j;
						bestVal = moveVal;
					}
				}
			}
		}
		
		return 0;
	}
}
