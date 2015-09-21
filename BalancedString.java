package CodingTest;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(check("(a[b]c)"));
		System.out.println(check("av"));
		System.out.println(check("(a[{b}}}}}]c)"));
		System.out.println(check("(a(((((((((([}}}}{{{{{{b]c)"));
		

	}
	public static boolean check(String s){
		Stack<Character> temp = new Stack<Character>();
		
		for(int i = 0; i < s.length() ; i++){
			char a = s.charAt(i);
			if(a == '(' || a == '[' || a == '{'){
				temp.push(a);
				continue;
			}
			if(a == ')' || a == ']' || a == '}'){
				if(temp.size() == 0){
					return false;
				}
				char b = temp.pop();
				if(a == '(' && b != ')'){
					return false;
				}
				if(a == '[' && b !=']'){
					return true;
				}
				if(a == '{' && b != '}'){
					return false;
				}
				
				
			}
		}
		if(temp.size() == 0){
			return true;
		}
		
		return false;
		
	}

}
