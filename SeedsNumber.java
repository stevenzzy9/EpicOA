package CodingTest;

import java.util.ArrayList;

public class SeedsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findNumber(1716);

	}
	public static void findNumber(int number){
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i = 1; i< number/2 ; i++){
			if( number % i == 0){
				res.add(i);
			}
			for(int n : res){
				int result = n;
				int temp = n;
				int sum = n;
				while(temp > 0){
					sum *= temp%10;
					temp = temp/10;
				}
				if(sum == number){
					System.out.println("the seed number of " + number + " is: " + result);
					return;
				}
			}
		}
		
		System.out.println("Sorry, Not Found!");
	}

}
