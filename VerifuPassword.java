package CodingTest;

import java.util.HashMap;

public class VerifuPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "123e123z123";
		System.out.println(check(s));

	}
	private static boolean check(String s){
		if(s.length() < 5 || s.length() > 12){
			System.out.println("The password must be 5-12 characters long");
			return false;
		}
		System.out.println("The length is valid");
		
		boolean number =false;
		boolean lowCase = false;
		
		for(int i = 0 ; i< s.length(); i++){
			
			if(!number && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				number = true;
			}
			if(!lowCase && s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ){
				lowCase = true;
			}
		}
		if(number && lowCase){
			System.out.println("Password contain number and lowercase");
		}else{
			System.out.println("The password is valid, it needs number and lowercase");
			return false;
		}
		
		if(!checkSequence(s)){
			return false;
		}
		
		
		
		return true;
	}
	private static boolean checkSequence(String s){
		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		for(int i =1 ; i < s.length() ; i++){
			for(int j = 0 ; j +i <= s.length() ; j++){
				String sub = s.substring(j,j+i);
				if(temp.get(sub) == null){
					temp.put(sub, j+i -1);
				}else{
					int pre = temp.get(sub);
					if(pre == j-1){
						return false;
					}else{
						temp.put(sub, j +i-1);
					}
				}
			}
		}
		return true;
	}
	
	

}
