package CodingTest;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A boy playing in a garden";
		System.out.println(s);
		String r = replace(s);
		System.out.println(r);

	}
	
	private static String replace(String input){
		
		String[] array = input.split(" ");
		StringBuffer res = new StringBuffer();
		
		for(int i = 0 ; i< array.length;i++){
			if(array[i].equals("a")){
				res.append("one ");
				continue;
			}
			if(array[i].equals("A")){
				res.append("ONE ");
				continue;
			}
			
			res.append(array[i]);
			res.append(" ");
		}
		
		return res.toString();
	}

}
