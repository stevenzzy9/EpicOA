package CodingTest;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "164";
		String s2 = "1644";
		
		System.out.println(check(s2,s1));

	}
	public static boolean check(String expected, String input){
		
		char broken =  'a';
		int j = 0;
		if(input.length() > expected.length()){
			return false;
		}
		for(int i = 0; i< expected.length() ; i++){
			if(j >= input.length()){
				if(expected.charAt(i) != broken){
					return false;
				}else{
					continue;
				}
			}
			
			if(expected.charAt(i) != input.charAt(j)){
				if(broken == 'a' ){
					broken = expected.charAt(i);
				}else if(broken == expected.charAt(i)){
					continue;
				}else{
					return false;
				}
			}else{
				j++;
			}
		}
		
		return true;
		
	}

}
