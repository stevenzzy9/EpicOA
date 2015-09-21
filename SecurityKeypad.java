package CodingTest;

public class SecurityKeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check("1478","1178");
		check("14781","11789");
		check("14578","11178");
		check("14578","11278");
		check("1478","1178345");
		

	}
	private static boolean check(String input, String target){
		if(input.length() != target.length()){
			System.out.println("Failed!");
			return false;
		}
		String[] a = input.split("");
		String[] b = target.split("");
		for(int i = 0 ; i < a.length;i++){
			int inputChar = Integer.parseInt(a[i]);
			int targetChar = Integer.parseInt(b[i]);
			if(Math.abs(inputChar - targetChar) != 3 && Math.abs(inputChar - targetChar) != 1 && Math.abs(inputChar - targetChar) != 0){
				System.out.println("Failed!");
				return false;
				
			}
		}
		
		System.out.println("Authorized!");
		return true;
	}

}
