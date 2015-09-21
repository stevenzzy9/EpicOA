package CodingTest;

public class TwoPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int check = 4; check <=500 ; check+=2){
			for(int half = 2; half <= check/2; half++){
				if(checkPrime(half) && checkPrime(check - half)){
					System.out.println("True");
				}
				
			}
		}

	}
	public static boolean checkPrime(int i){
		if(i == 2){
			return true;
		}
		for(int n = 3 ; n <= Math.sqrt(i);n++){
			if(i% n == 0 ){
				return false;
			}
		}
		return true;
	}

}
