package evaluation;

import java.util.*;

public class Main {
	public static char player = 'x', opponent = 'o';
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckMove checkMove = new CheckMove();
		WinLoseStatus winLose = new WinLoseStatus();
		Minimax miniMaxObj = new Minimax();
		FindBestMove findBestMove = new FindBestMove();
		
		char[][] gameBoard = 
		    { 
		        { '_', '_', '_' }, 
		        { '_', '_', '_' }, 
		        { '_', '_', '_' } 
		    };
		boolean gameState = checkMove.isMoveLeft(gameBoard);
		
		while (gameState) {
			System.out.println("Enter row: ");
			int i = sc.nextInt();
			System.out.println("Enter col: ");
			int j = sc.nextInt();
			
			gameBoard[i][j] = opponent;
			
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					System.out.print(gameBoard[row][col]);
				}
				System.out.println();
			}
			
			findBestMove.findBestMove(gameBoard);
			gameBoard[findBestMove.row][findBestMove.col] = player;
			
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					System.out.print(gameBoard[row][col]);
				}
				System.out.println();
			}
		} 
		
	}
}
