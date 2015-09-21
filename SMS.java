package CodingTest;

public class SMS {
	
	private static String[] key = {"", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", "0", "#"} ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String digit = "27#777444555*2555#5553366";
		String sms = translate(digit);
		System.out.println(sms);

	}
	private static String translate(String input){
		
		StringBuffer sb = new StringBuffer();
		for(int i =0 ;i <input.length() ; i++){
		
			if(input.charAt(i) == '*'){
				sb.append(" ");
				continue;
			}
			if(input.charAt(i) == '#' || input.charAt(i) == '1'){
				continue;
			}
			
			else{
				int count = 1;
				int keyIndex = input.charAt(i) - '1';
				String keySelected = key[keyIndex];
				while(i + 1 < input.length() && input.charAt(i+1) == input.charAt(i)){
					count++;
					i++;
				}
				int index = (count -1) % keySelected.length();
				sb.append(keySelected.charAt(index));
			}
			
		}
		
		return sb.toString();
		
	}

}
