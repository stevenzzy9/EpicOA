package CodingTest;

public class ReplaceAEIOU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aei";
		String ans1 = replace(s1);
		System.out.println(ans1);
		String s2 = "dkafhskjiowerqpeturdlhvlasdfast";
		String ans2 = replace(s2);
		System.out.println(ans2);
		String s3 = "aeiu";
		String ans3 = replace(s3);
		System.out.println(ans3);

	}
	private static String replace(String input){
		if(input.length() < 4){
			return input;
		}
		int count = 0;
		char[] array = input.toCharArray();
		int i;
		for(i = 0; i<input.length();i++){
			if(array[i] == 'a' ||array[i] == 'e'||array[i] == 'i'||array[i] == 'o'||array[i] == 'u'){
				count++;
			}
			if(count == 3){
				break;
			}
		}
		
		if(i< input.length()){
			count = 0;
			for(int j = input.length()-1;j>i;j--){
				if(array[j] == 'a' || array[j] == 'e'|| array[j] == 'i'|| array[j] == 'o'|| array[j] == 'u'){
					count++;
					array[j] = (char)(array[j] - 'a' + 'A');
				}
				if(count == 4){
					break;
				}
			}
		}
		
		String res = "";
		for(Character c: array ){
			res +=c;
		}
		
		return res;
	}

}
