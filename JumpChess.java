package CodingTest;

public class JumpChess {
	
	private static int N = 5;
	private static int[][] board;
	private static int[][] len;
	private static boolean[][] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		
		System.out.println(getLength(2,3));
		

	}
	private static void init(){
		len = new int[N][N];
		for(int i = 0 ; i < len.length ; i++){
			for(int j = 0 ; j < len[0].length ; j++){
				len[i][j] = -1;
			}
		}
		visited = new boolean[N][N];
		
		board = new int[N][N];
		for(int i = 0 ; i < len.length ; i++){
			for(int j = 0 ; j < len[0].length ; j++){
				board[i][j] = 0;
			}
		}
		board[2][2] = 2; 
		board[3][1] = 2;
 		
	}
	private static int getLength(int row, int col){
	
		if(len[row][col] >= 0){
			return len[row][col];
		}
		int leftLen, rightLen, upLen, downLen;
		leftLen = 0;
		rightLen = 0;
		upLen = 0;
		downLen = 0;
		
		if(col -2 >= 0 && board[row][col-2] == 0 && board[row][col-1] == 2 && !visited[row][col-1]){
			visited[row][col-1] = true;
			leftLen = getLength(row,col-2) + 1;
			visited[row][col-1] = false;
		}
		
		if(col + 2 <= N-1  && board[row][col+2] == 0 && board[row][col+1] == 2 && !visited[row][col+1]){
			visited[row][col+1] = true;
			rightLen = getLength(row,col+2) + 1;
			visited[row][col+1] = false;
		}
		
		if(row -2 >= 0 && board[row-2][col] == 0 && board[row-1][col] == 2 && !visited[row-1][col]){
			visited[row-1][col] = true;
			upLen = getLength(row-2,col) + 1;
			visited[row-1][col] = false;
		}
		if(row +2 <= N-1  && board[row+2][col] == 0 && board[row+1][col] == 2 && !visited[row+1][col]){
			visited[row+1][col] = true;
			downLen = getLength(row+2,col) + 1;
			visited[row+1][col] = false;
		}
		
		len[row][col] = max(leftLen, rightLen, upLen, downLen);
		
		
		return len[row][col];
	}
	private static int max(int leftLen, int rightLen, int upLen, int downLen) {
		// TODO Auto-generated method stub
		int a = Math.max(leftLen, rightLen);
		int b = Math.max(upLen, downLen);
		return Math.max(a, b);
	} 

}
