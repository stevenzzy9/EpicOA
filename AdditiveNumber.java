package CodingTest;
public class AdditiveNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(1,99999);
	}
	public static void printNum(int start, int end){
		if(start > end){
			return ;
		}
		for(int i = start; i<=end; i++){
			if(checkNum(String.valueOf(i))){
				System.out.println(i);
			}
		}
	}
	public static boolean checkNum(String num){
		for(int i =1 ; i < num.length() ; i++){
			int n1 = Integer.parseInt(num.substring(0, i));
			if(2* i < num.length()){
				int n2 = Integer.parseInt(num.substring(i, 2*i));
				if(n1 != n2){
					continue;
				}
				int j = 2 * i;int temp = n1;
				int rest = Integer.parseInt(num.substring(j));;
				while(temp + n2 <= rest){
					int n3 = temp + n2;
					String newNum = (new Integer(n3)).toString();
					int length = newNum.length();
					if( j + length > num.length()){
						break;
					}
					if(num.substring(j, j+length).equals(newNum)){
						j += length;
						if(j == num.length()){
							return true;
						}
						temp = n2; n2 = n3;
						rest = Integer.parseInt(num.substring(j));
					}
					else{
						break;
					}
				}	
			}	
		}
		return false;
	}
}
