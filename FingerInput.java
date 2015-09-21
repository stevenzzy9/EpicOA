package CodingTest;

import java.util.ArrayList;
import java.util.HashMap;

public class FingerInput {
	
	private static HashMap<String,Integer> table;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		table =new HashMap<String,Integer>();
		table.put("a", 1);
		table.put("b", 2);
		table.put("c", 3);
		table.put("d", 4);
		table.put("e", 5);
		
		printLetter("aab");
		
		for(String s: printLetter("aab")){
			System.out.println(s);
		}


	}
	public static ArrayList<String> printLetter(String input){
		ArrayList<String> res = new ArrayList<String>();
		res.add("");
		if(input == null){
			return res;
		}
		
		for(int i = 0; i < input.length();i++){
			res = combin(res,table.get(input.charAt(i)+""));
		}
		return res;
	}
	
	public static ArrayList<String> combin(ArrayList<String> list, int num){
		String[] temp = {"","abc","def","ghi","jklm","nopqr"};
		ArrayList<String> res = new ArrayList<String>();
		for(String s:list){
			for(int i = 0 ; i< temp[num].length();i++){
				res.add(s+temp[num].charAt(i));
			}
		}
		return res;
	}

}
