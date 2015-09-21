package CodingTest;

import java.util.HashMap;

public class BullAndCowsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <2; i++){
			System.out.println(bullAndCows("foum","four")[i]);
		}

	}
	public static int[] bullAndCows(String a, String b){
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 0;
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for(int i = 0;i< a.length() ; i++){
			table.put(a.charAt(i), i);
		}
		
		for(int j = 0 ; j< b.length();j++){
			if(table.containsKey(b.charAt(j))){
				if(j == table.get(b.charAt(j))){
					res[0]++;
				}else{
					res[1]++;
				}
			}
		}
		
		return res;
	}

}
