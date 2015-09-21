package CodingTest;

public class MountainPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,3,4,7,9},{53,86,23,15,57},{31,46,76,98,71}, {54,57,12,76,19}};
		montanCheck(matrix);

	}
	private static void montanCheck(int[][] grid){
		int row = grid.length;
		int col = grid[0].length;
		for(int i = 1 ; i < row -1 ; i++){
			for(int j = 1 ; j < col -1 ; j++){
				if(grid[i][j] < grid[i-1][j-1]){
					continue;
				}
				if(grid[i][j] < grid[i-1][j]){
					continue;
				}
				if(grid[i][j] < grid[i-1][j+1]){
					continue;
				}
				if(grid[i][j] < grid[i][j-1]){
					continue;
				}if(grid[i][j] < grid[i][j+1]){
					continue;
				}
				if(grid[i][j] < grid[i+1][j-1]){
					continue;
				}
				if(grid[i][j] < grid[i+1][j]){
					continue;
				}
				if(grid[i][j] < grid[i+1][j+1]){
					continue;
				}
				System.out.println("the mountain point is : " + grid[i][j]);
			}
		}
	}

}
