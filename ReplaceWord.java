package CodingTest;

public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A perwr23son can't w;a`][L=-lk in this street";
		String mStr = replace(str);
		System.out.println(mStr);

	}
	private static String replace(String input){
		
		StringBuffer sb = new StringBuffer();
		
		String[] temp = input.split(" ");
		System.out.println(input);
		
		for(String s : temp){
			if(len(s) < 4){
				sb.append(s);
				sb.append(" ");
			}else{
				if(len(s) %2 == 0){
					sb.append(s.substring(0, len(s)/2));
					sb.append(" ");
					sb.append(s.substring(len(s)/2) + " ");
				}else{
					sb.append(s + " ");
				}
			}
		}	
		return sb.toString();
	}
	private static int len(String s){
		int length = s.length();
		int count = 0;
		
		for(char c : s.toCharArray()){
			if(!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				count++;
			}
		}
		
		return length - count;
	}

}
