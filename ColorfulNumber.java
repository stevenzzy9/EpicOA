package CodingTest;

import java.util.HashSet;

public class ColorfulNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	private static boolean isColourNumber(int num){
		HashSet<Integer> hp = new HashSet<Integer>();
		
		int n = num;
		int i = 10;
		while(i< num){
			while( n >=(i/10)){
				int temp = n %i;
				int product = getProduct(temp);
				if(hp.contains(product)){
					return false;
				}else{
					hp.add(product);
					n = n/10;
				}
			}
			n = num;
			i = i * 10;
		}
		
		return true;
		
	}
	private static int getProduct(int i){
		if(i<10){
			return i;
		}
		int a = 1;
		while(i > 0){
			a = a * (i%10);
			i = i/10;
		}
		
		return a;
	}

}
