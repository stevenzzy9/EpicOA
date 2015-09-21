package CodingTest;

import java.util.ArrayList;

public class PlusEqualNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		equalNumber("1141");
		equalNumber("11413");
		equalNumber("14113");
		equalNumber("12315");
		equalNumber("123");
		equalNumber("31518");
		equalNumber("1234567");
		equalNumber("17512");
		equalNumber("25631");

	}
	public static void equalNumber(String input){
		
		if(input.length() <=1 || input.length() % 2 == 0){
			System.out.println("Please input another number");
			return;
		}
		int limit = input.length()/2;
		
		for(int i = 0;i<limit;i++){
			for(int j = i+1; j< limit + i+1;j++){
				int num1 = Integer.parseInt(input.substring(0,i+1));
				int num2 = Integer.parseInt(input.substring(i+1, j+1));
				int num3 = Integer.parseInt(input.substring(j+1));
				ArrayList<String> list1 = getPermutations(num1+"");
				ArrayList<String> list2 = getPermutations(num2+"");
				ArrayList<String> list3 = getPermutations(num3+"");
				
				for(int o = 0; o< list1.size();o++){
					for(int p = 0;p<list2.size();p++){
						for(int q = 0;q<list3.size();q++){
							int n1 = Integer.parseInt(list1.get(o));
							int n2 = Integer.parseInt(list2.get(p));
							int n3 = Integer.parseInt(list3.get(q));
							if(check(n1,n2,n3)){
								return;
							}
						}
					}
				}
			}
		}
	}
	
	private static boolean check(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		if(n1+n2 == n3){
			System.out.println(n1 +" + " + n2 +" = " + n3);
			return true;
		}else if(n1 + n3 == n2){
			System.out.println(n1 +" + " + n3 +" = " + n2);
			return true;
		}else if(n2+n3 == n1){
			System.out.println(n2 +" + " + n3 +" = " + n1);
			return true;
		}
		return false;
		
	}
	public static ArrayList<String> getPermutations(String target){
		ArrayList<String> res = new ArrayList<String>();
		if(target == null){
			return null;
		}else if(target.length() == 0){
			res.add("");
			return res;
		}else{
			char first = target.charAt(0);
			String rest = target.substring(1, target.length());
			ArrayList<String> perms = getPermutations(rest);
			for(String s : perms){
				for(int i = 0; i<= s.length();i++){
					res.add(combin(first,s,i));
				}
			}
			return res;
		}
		
	}
	private static String combin(char c, String word, int position) {
		// TODO Auto-generated method stub
		String start = word.substring(0, position);
		String end = word.substring(position);
		return start + c + end;
	}

}
