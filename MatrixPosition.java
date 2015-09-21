package CodingTest;

public class MatrixPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3},
	              {4,5,6},
	              {7,8,9}};
		
		findThePosition(arr);

	}
	private static void findThePosition(int[][] grid){
		int n = grid.length;
		int i,j,k;
		for(i=0;i< n; i++){
			int min;
			int max = grid[i][0];
			int index =0;
			for(j=0;j<n;j++){
				if(grid[i][j] > max){
					max = grid[i][j];
					index = j;
				}
			}
			min = max;
			for(k =0;k<n;k++){
				if(grid[k][index] < min){
					min = grid[k][index];
				}
			}
			
			if(max == min){
				System.out.println("The number is "+max);
				System.out.println("The position is" + i +" row " + index + " col ");
			}
			
		}
	}

}
