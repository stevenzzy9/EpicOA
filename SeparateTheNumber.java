package CodingTest;

public class SeparateTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4678912356012356"; 
		System.out.println(separate(str));

	}
	private static String separate(String s){
		StringBuffer sb = new StringBuffer();
		boolean flag = true;
		for(int i = 1; i< s.length() ; i++){
			if(s.charAt(i) - s.charAt(i-1) == 1){
				sb.append(s.charAt(i-1));
				flag = true;
			}else{
				if(flag){
					sb.append(s.charAt(i-1));
					sb.append(';');
				}
				flag = false;
					
			}
		}
		if(s.charAt(s.length() -1) - s.charAt(s.length() -2) == 1){
			sb.append(s.charAt(s.length()-1));
			sb.append(';');
		}
		
		return sb.toString();
	}

}
