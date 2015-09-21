package CodingTest;

import java.util.ArrayList;

public class SubtractionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A={1,2,3,4,5};
		int[] B = {4,5,3,5,5,5,5};
		
		for(int i : subtraction(A,B)){
			System.out.println(i);
		}
		

	}
	private static ArrayList<Integer> subtraction(int[] a, int[] b){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(a == null || b == null){
			System.out.println("Please input two vaild array");
			return res;
		}
		
		int first = a.length -1;
		int second = b.length -1;
		
		int carry = 0;
		int diff = 0;
		
		if(first<second){
			System.out.println("Please input two vaild array");
			return res;
		}
		
		while(first >=0 || second >=0){
			if(second>=0){
				diff = 10 + a[first]  - b[second] - carry;
				carry = (diff/10 == 1 ? 0 : 1);
				res.add(0, diff%10);
				first--;
				second--;
				
			}else if(first >= 0){
				if(first == 0 && carry == 1 && a[first] == 1){
					first--;
					continue;
				}
				
				diff = 10 + a[first] -carry ;
				carry = (diff/10 ==1 ? 0:1);
				res.add(0, diff%10);
				first--;
			}	
		}
		
		return res;
	}

}
