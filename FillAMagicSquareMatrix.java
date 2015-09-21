package CodingTest;

public class FillAMagicSquareMatrix { 
	
	public static void main(String[] arge){
		
		int[][] a = getMatrix(3);
		
		for(int i = 0 ; i< a.length;i++){
			for(int j = 0; j < a[0].length ; j++){
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}
	public static int[][] getMatrix(int n){
		int[][] res = new int[n][n];
		if(n % 2 ==0){
			System.out.println("Please input a vaild number");
			return null;
		}
		int x = 0;
		int y = n/2;
		res[x][y] = 1;
		
		for(int i =2; i<= n*n;i++){
			int newX = (x-1+n)%n;
			int newY = (y+1)%n;
			if(res[newX][newY] == 0){
				res[newX][newY] = i;
			}else{
				newX = (x+1)%n;
				newY = y;
				
				if(res[newX][newY] !=0){
					System.out.println("error");
					return null;
				}
				
				res[newX][newY] = i;
				
			}
			
			x=newX;
			y=newY;
		}
		
		return res;
	}
	

}
