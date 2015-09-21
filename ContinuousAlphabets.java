package CodingTest;

import java.util.ArrayList;

public class ContinuousAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcdefljdflsjflmnopflsjflasjftuvwxyz";
		
		printContiAlpha(s);
//		ArrayList<String> result = getAlphabets(s);
//		for(String i : result){
//			System.out.println(i);
//		}

	}
	public static void printContiAlpha(String input){
		input = input.toLowerCase();
		char pre = 'a';
		char current = 'a';
		int i = 1;
		boolean contiguous = false;
		while(i<input.length()){
			pre = input.charAt(i-1);
			current = input.charAt(i);
			if(current == pre +1){
				System.out.print(pre);
				contiguous = true;
			}else{
				if(contiguous){
					System.out.print(pre);
					System.out.print(";");
				}
				contiguous = false;
				
			}
			i++;
		}
		if(current == pre +1){
			System.out.print(current);
		}
	}
	public static ArrayList<String> getAlphabets(String input){
		ArrayList<String> res = new ArrayList<String>();
		if(input == null || input.length() == 0){
			return res; 
		}
		input = input.toLowerCase();
		int i =0;
		int j =1;
		while(i < input.length() || j < input.length()){
			int temp = input.charAt(j) - input.charAt(j-1);
			if(temp == 1){
				j++;
			}else{
				if(j -i >=2){
					res.add(input.substring(i,j));
				}else{
					j++;
					i++;
				}
			}
		}
		
		return res;
	}

}
