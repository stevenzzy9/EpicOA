package CodingTest;

import java.util.HashMap;

public class CommonCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(change("aaaaaaaaaaab"));

	}
	public static String change(String input){
		if(input == null){
			return "";
		}
		
		HashMap<Character, Integer> table = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i< input.length();i++){
			if(!table.containsKey(input.charAt(i))){
				table.put(input.charAt(i), 1);
			}
			table.put(input.charAt(i),table.get(input.charAt(i)+1));
		}
		char min = input.charAt(0);
		char max = input.charAt(0);
		
		for(int i = 0 ;i<input.length();i++){
			min = table.get(min) > table.get(input.charAt(i)) ? input.charAt(i) : min;
			max = table.get(max) > table.get(input.charAt(i)) ? max : input.charAt(i);
		}
		
		String[] res = input.split("");
		
		String a = min + "";
		String b = max + "";
		
		for(int i = 0 ; i<res.length;i++){
			if(res[i] == a){
				res[i] = b;
			}
			if(res[i] == b){
				res[i] = a;
			}
		}
		StringBuffer result = new StringBuffer();
		
		for(int i = 0 ; i< res.length;i++){
			result.append(res[i]);
		}
		
		
		return result.toString();
	}

}
