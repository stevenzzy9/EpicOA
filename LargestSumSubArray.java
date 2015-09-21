package CodingTest;

public class LargestSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,3 , -2 , 4 , -8 , 8, 9, -2, 10};
		int res = getArray(num);
		System.out.println(res);
	}
	public static int getArray(int[] input){
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i =0;i<input.length;i++){
			sum += input[i];
			max = Math.max(sum, max);
			sum = Math.max(0, sum);
		}
		
		return max;
	}

}
