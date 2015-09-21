package CodingTest;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = {3,4,5,6,7,8,9,2,34,45,36,457,3452,346,11111};
		findNumber(res);

	}
	private static void findNumber(int[] input){
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0;i< input.length ; i++){
			if(checkOdd(input[i])){
				max = max > input[i] ? max : input[i];  
			}else{
				min = min < input[i] ? min : input[i];
			}
		}
		
		System.out.println("The maximum of the odd numbers is " + max);
		System.out.println("The minimum of the even numbers is " + min);
		
	}
	private static boolean checkOdd(int i){
		if(i%2 == 0){
			return false;
		}
		return true;
	}

}
