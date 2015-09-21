package CodingTest;


import java.util.HashSet;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abababba";
		for(String s: dp(str)){
			System.out.println(s);
		}

	}
	public static HashSet<String> dp(String input){
		HashSet<String> res = new HashSet<String>();
		if(input.length() < 3){
			return res;
		}
		
		boolean[][] dp = new boolean[input.length()][input.length()];
		
		for(int i = input.length()-1; i>=0 ;i--){
			for(int j = i ; j< input.length() ; j++){
				if(input.charAt(i) == input.charAt(j) && (i-j <=1 || dp[i+1][j-1])){
					dp[i][j] = true;
				}else{
					dp[i][j] = false;
				}
				
				if(j -i >= 2 && dp[i][j]){
					res.add(input.substring(i,j+1));
				}
			}
		}
		
		
		return res;
	}

}
