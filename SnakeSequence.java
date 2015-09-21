package CodingTest;

import java.util.ArrayList;

public class SnakeSequence {
	
	private static final int[][] board = new int[][] { 
		{ 1, 3, 2, 6, 8 },
		{ -9, 7, 1, -1, 2 }, 
		{ 1, 5, 0, 1, 9 } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		snakeSearch(board);
		

	}
	public static void snakeSearch(int[][] grid){

		int n = grid.length;
		int m = grid[0].length;
		int row = 0,col = 0;
		int maxLength = 0 ;
		int[][] dp = new int[n][m];
		for(int i = 0; i< n ; i++){
			for(int j = 0; j< m ; j++){
				dp[i][j] = 1;
			}
		}
		
		for(int i = 0; i < n ; i++){
			for(int j = 0 ; j < m; j++){
				if(i==0 && j == 0){
					continue;
				}
				if(i>0 && Math.abs(grid[i-1][j]-grid[i][j]) == 1){
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j] +1);
					if(maxLength < dp[i][j]){
						maxLength = dp[i][j];
						row = i;
						col = j;
					}
					
				}
				if(j>0 && Math.abs(grid[i][j-1]-grid[i][j]) == 1){
					dp[i][j] = Math.max(dp[i][j], dp[i][j-1] +1);
					if(maxLength < dp[i][j]){
						maxLength = dp[i][j];
						row = i;
						col = j;
					}
					
				}
				
			}
		}
		System.out.println("The Length of Snake Sequence is " + maxLength +" " + row + " " +col);
		printSnake(dp,row,col);
	}
	
	public static void printSnake(int[][] dp, int i , int j){
		ArrayList<Integer> snake = new ArrayList<Integer>();
		snake.add(board[i][j]);
		while(dp[i][j] !=1 ){
			if(i > 0 && j >0){
				if(dp[i][j] == dp[i-1][j] + 1){
					snake.add(board[i-1][j]);
					i--;
				}
				if(dp[i][j] == dp[i][j-1] + 1){
					snake.add(board[i][j-1]);
					j--;
				}
			}else if(j==0){
				if(dp[i][j] == dp[i-1][j] + 1){
					snake.add(board[i-1][j]);
					i--;
				}
			}else if(i==0){
				if(dp[i][j] == dp[i][j-1] + 1){
					snake.add(board[i][j-1]);
					j--;
				}
			}
			
		}
		
		System.out.println(snake.toString());
	}
	

	
	
}
