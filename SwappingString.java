package CodingTest;

import java.util.Arrays;

public class SwappingString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swap("eoksb","sboek");

	}
	private static void swap(String s1, String s2){
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int i = 0;
		while(i < b.length){
			if(a[i] == b[i]){
				i++;
				continue;
			}else{
				for(int j = i ; j < b.length-1;j++){
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("S1 :" + Arrays.toString(a));
		System.out.println("S2 :" + Arrays.toString(b));
		
	}

}
