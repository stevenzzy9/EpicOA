package CodingTest;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,3,3,3,5,5,5,9,9,9, 9,10,10,10,10,10,32,43,43,43,43,43,53};
		getArray(a);

	}
	public static void getArray(int[] input){
		
		int i= 0;
		int j = 1;
		
		while(j< input.length){
			if(input[i] != input[j]){
				input[i+1] = input[j];
				i++;
			}
			j++;
		}
		for(int q = 0; q< i+1;q++){
			System.out.println(input[q]);
		}
	}

}
