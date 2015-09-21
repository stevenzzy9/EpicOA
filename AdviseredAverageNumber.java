package CodingTest;

import java.util.Arrays;

public class AdviseredAverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,6,12,55,289,600,534,900,172};
		int i = getAverage(a);

		System.out.println(i);
	}
	public static int getAverage(int[] input){
		Arrays.sort(input);
		int sum = 0;
		int res = 0;
		for(int i = 0 ; i< input.length -3 ;i++){
			sum +=input[i];
			System.out.println(input[i]);
		}
		res = sum/(input.length -3);
		return res;
	}

}
