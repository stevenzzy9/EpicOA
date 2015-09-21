package CodingTest;

public class SubstringAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 5, 9, 11, 2, 4, 9};
		int [] arr2 = {1, 5, 9, 11, 2, 4};
		check(arr1,27);
		check(arr2,6);

	}
	public static void check(int[] input, int sum){
		int temp ;
		
		for(int i = 0 ; i < input.length; i++){
			temp = 0;
			for(int j = i; j<input.length;j++ ){
				temp += input[j];
				if(temp == sum){
					System.out.println("From: " + i + " To: " + j);
				}
			}
		}
		
	
	}

}
