package CodingTest;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum(1,9999);

	}
	public static void printNum(int start, int end){
		for(int i = start ; i<=end ; i++){
			
			if(checkNum(String.valueOf(i))){
				System.out.println(i);
			}
			
		}
	}
	public static boolean checkNum(String num){
		for(int i = 1; i< num.length() ; i++){
			int n1 = Integer.parseInt(num.substring(0,i));
			for(int j = i+1 ; j< num.length(); j++){
				int temp = n1;
				int k = j;
				int n2 = Integer.parseInt(num.substring(i, j));
				int rest = Integer.parseInt(num.substring(j));
				while(temp + n2 <= rest ){
					int n3 = temp + n2;
					String newNum = (new Integer(n3)).toString();
					int length = newNum.length();
					if(k + length > num.length()){
						break;
					}
					if(num.subSequence(k, k+length).equals(newNum)){
						k +=length;
						if(k == num.length()){
							return true;
						}
						temp = n2;
						n2 = n3;
						rest = Integer.parseInt(num.substring(k));
					}else{
						break;
					}
				}
			}
		}
		
		
		
		return false;
	}
	

}
