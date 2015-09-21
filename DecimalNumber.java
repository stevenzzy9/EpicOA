package CodingTest;

public class DecimalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(chage(0.123));
		System.out.println(chage(0.53));
		System.out.println(chage(0.6457));
		System.out.println(chage(0.0000));
		System.out.println(chage(0.4562));
		System.out.println(chage(0.345));
		System.out.println(chage(0.4563));
		System.out.println(chage(0.222));
		

	}
	public static String chage(double input){
		int n = (int) (input * 10000);
		int d = 10000;
		
		int gcd = getGCD(n,d);
		
		return (n/gcd) + "/" + (d/gcd);
	}
	
	private static int getGCD(int a, int b){
		if(a == 0){
			return b;
		}
		while(a != b){
			if(a > b){
				a = a-b;
			}else if(b > a){
				b = b-a;
			}else{
				return a;
			}
		}
		
		return a;
	}

}
