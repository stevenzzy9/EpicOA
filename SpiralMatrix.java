package CodingTest;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] matrix = {{'a','b','c','d','1'}, 
				{'e','f','g','h','2'}, 
				{'i','j','k','l','3'}, 
				{'m','n','o','p','4'}, 
				{'q','r','s','t','5'}};

		int stop = 5/2 +1;
		String a = "";
		getSpiral(matrix);
		
	}


	public static void getSpiral(char[][] input){
		int size = input.length;
		int level = 0;
		int levelStop;
		if(size %2 == 0){
			levelStop = size /2;
		}else{
			levelStop = size /2 +1;
		}
		while(level<=levelStop){
			int max = size - 1 - level;
			for(int i = max; i> level ; i--){
				System.out.print(input[level][i]);
			}
			for(int i = level; i< max ; i++){
				System.out.print(input[i][level]);
			}
			for(int i = level; i< max ; i++){
				System.out.print(input[max][i]);
			}
			for(int i = max; i> level ; i--){
				System.out.print(input[i][max]);
			}
			level++;
		}
	} 
}
