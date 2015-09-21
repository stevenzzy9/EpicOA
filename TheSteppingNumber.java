package CodingTest;

import java.util.ArrayList;

public class TheSteppingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFun(1,310000);

	}
	
	public static void printFun(int start, int end){
		for(int i = start; i<= end;i++){
			if(check(i)){
				System.out.println(i);
			}
		}		
		return;
	}

	private static boolean check(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		while(i/10 >=1){
			temp.add(i%10);
			i = i/10;
		}
		temp.add(i);
		
		for(int j = 0;j< temp.size()-1;j++){
			if(temp.get(j)-temp.get(j+1) == 1 || temp.get(j + 1) - temp.get(j) == 1){
				continue;
			}else{
				return false;
			}
		}
		
		return true;
	}
	
	
	

}
