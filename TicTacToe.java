package CodingTest;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] matrix = {{true, true, true, true, false}, 
				 {false, true, false, true, false}, 
				 {false, true, true, false, false}, 
				 {false, true, false, false, false}, 
				 {false, true, true, true, false}};
		
		int[] res = ticTacToe(matrix);
		System.out.println("The point of red is : "+ res[0]);
		System.out.println("The point of black is : "+ res[1]);
		
		if(res[0] == res[1]){
			System.out.println("No Winner");
		}else{
			String output = res[0] > res[1] ? "red":"black";
			System.out.println(output);
		}
		


	}
	public static int[] ticTacToe(boolean[][] board){
		int red = 0;
		int black = 0;
		int row = board.length;
		int col = board[0].length;
		
		
		for(int i = 0 ; i< row;i++){
			for(int j = 0; j < col ; j++){
				if(board[i][j]){
					if(i+2< row && board[i+1][j]&& board[i+2][j]){
						red++;
					}
					if(j+2<col && board[i][j+1] && board[i][j+2]){
						red++;
					}
					if(i+2<row && j+2<col && board[i+1][j+1] && board[i+2][j+2]){
						red++;
					}
				}else{
					
					if(i+2< row && !board[i+1][j] && !board[i+2][j]){
						black++;
					}
					if(j+2<col && !board[i][j+1] && !board[i][j+2]){
						black++;
					}
					if(i+2<row && j+2<col && !board[i+1][j+1] && !board[i+2][j+2]){
						black++;
					}
					
				}
			}
		}
		
		for(int i = row-1 ; i>= 0; i--){
			for(int j = col-1; j>=0;j--){
				if(board[i][j]){
					if(i-2>=0 && j-2>=0 && board[i-1][j-1] && board[i-2][j-2]){
						red++;
					}
				}else{
					if(i-2>=0 && j-2>=0 && !board[i-1][j-1] && !board[i-2][j-2]){
						black++;
					}
				}
			}
		} 
		
		int[] res = new int[2];
		res[0] = red;
		res[1] = black;
		
		return res;
	}

}
