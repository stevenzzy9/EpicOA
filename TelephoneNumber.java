package CodingTest;

public class TelephoneNumber {
	
	private static String digits = "0134568";
	private static int phoneLen;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(8);
	}
	
	public static void printNum(int lenth){
		phoneLen = lenth;
		pinrtPhone("");
	}
	
	public static void pinrtPhone(String prefix){
		if(prefix.length() == phoneLen ){
			System.out.println(prefix);
			return;
		}
		
		for(int i = 0; i < digits.length();i++){
			if(prefix.length() > 0){
				if(prefix.charAt(prefix.length() - 1) == digits.charAt(i)){
					continue;
				}
				if(prefix.length() > 0 && digits.charAt(i) == '4' && prefix.charAt(0) != '4'  ){
					continue;
				}
			}
			pinrtPhone(prefix + digits.charAt(i));	
		}	
	}

}
