package CodingTest;

import java.util.ArrayList;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };
        int called[] = {1, 2, 3, 4, 73, 82, 91, 5, 6, 7, 8, 9, 10};
        
        checkMingo(matrix,called);

	}
	private static ArrayList<Integer> getRow(int[][] Matrix,int index){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i< Matrix[index].length; i++){
			res.add(Matrix[index][i]);
		}
		return res;	
	}
	private static ArrayList<Integer> getColumn(int[][] Matrix,int index){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i< Matrix.length; i++){
			res.add(Matrix[i][index]);
		}
		return res;	
	}
	private static ArrayList<Integer> getFirstDiagonal(int[][] Matrix){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i< Matrix.length; i++){
			res.add(Matrix[i][i]);
		}
		return res;	
	}
	private static ArrayList<Integer> getSecondDiagonal(int[][] Matrix){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i< Matrix.length; i++){
			res.add(Matrix[i][Matrix.length-1-i]);
		}
		return res;	
	}
	public static void checkMingo(int[][] Matrix, int[] called){
		ArrayList<ArrayList<Integer>> total = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < Matrix.length; i++){
			total.add(getRow(Matrix,i));
			total.add(getColumn(Matrix,i));
		}
		total.add(getFirstDiagonal(Matrix));
		total.add(getSecondDiagonal(Matrix));
		
		for(int i =0; i< called.length ; i++){
			for(ArrayList<Integer> l : total){
				if(l.contains(called[i])){
					l.remove(new Integer(called[i]));
					if(l.isEmpty()){
						System.out.println("Mingo!!!"  +  " the times of called is "+i);
						return;
					}
				}
			}
		}
		
		System.out.println("Sorry! No Mingo!!");
		
 	}
	

}
