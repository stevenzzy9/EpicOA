package CodingTest;

import java.util.Arrays;

public class RGBCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFun("123456");
		checkFun("111111");
		checkFun("121412");
		checkFun("121112");

	}
	public static void checkFun(String s){
		if(s.length() != 6){
			System.out.println("Please input a valid RGB string");
			return ;
		}
		
		int R = Integer.parseInt(s.substring(0,2), 16);
		int G = Integer.parseInt(s.substring(2,4), 16);
		int B = Integer.parseInt(s.substring(4), 16);
		System.out.println("R: "+ R  + " G: "+ G + " B: "+ B);
		
		int[] temp = {R,G,B};
		Arrays.sort(temp);
		
		if(temp[2] == temp[0]){
			System.out.println("All of them are equal!");
		}else if(temp[2] == temp[1] ){
			System.out.println("Two Biggest!");
		}else{
			System.out.println("One Biggest!");
		}
		
	}

}
