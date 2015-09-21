package CodingTest;

public class OctalAndDecimalPalindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findAllNumber(1,4000);

	}
	public static boolean isPalindrome(String s){
		int i = 0;
		int j = s.length() -1;
		while(i<j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static String changeToOctal(int n){
		String res = "";
		while(n > 0){
			int x = n % 8;
			res += x;
			n = n/8;
		}	
		return res;
	}
	
	public static void findAllNumber(int start,int end){
		for(int i = start ; i<=end ; i++){
			String tempDecimal = String.valueOf(i);
			if(isPalindrome(tempDecimal)){
				String tempOctal = changeToOctal(i);
				if(isPalindrome(tempOctal)){
					System.out.println("Decimal :" + i + " Octal :" + tempOctal);
				}
			}
		}
	}
	
	

}
