package CodingTest;

public class WellorderedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wellOrdered(4);

	}
	public static void wellOrdered(int length){
		if (length == 0)	
			return; 
		wellOrdered(length, 0, "");
	}
	public static void wellOrdered(int length, int start, String sb){
		if (length == 0){
			System.out.print(sb + ",");
			System.out.println();
			return;
		}
		for (int i = start; i < 26; i++){
			wellOrdered(length - 1, i + 1, sb + (char)('a' + i));
			wellOrdered(length - 1, i + 1, sb + (char)('A' + i));
		}
	}

}
