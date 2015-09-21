package CodingTest;

public class EdgeDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = 5;
		int image[] = {
				1,1,1,1,1,
				1,9,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,};
		
		int[] output =  processDetection(image, width,3);
		
		
		for (int i = 0; i < output.length; i++) {
			if (i % width == 0) {
				System.out.println();
			}
			
			System.out.print(" " + output[i]);
		}
		

	}
	
	public static int[] processDetection(int[] image , int width, int threshold){
		if(image == null){
			System.out.println("Please input an vaild argument");
			throw new NullPointerException();
		}
		if(width < 1){
			System.out.println("Please input an vaild argument");
			throw new IllegalArgumentException();
		}
		if(image.length < width || image.length % width > 0){
			System.out.println("Please input an vaild argument");
			throw new IllegalArgumentException();
		}
		int[] output = new int[image.length];
		final int numRows = image.length / width;
		int xLeft, xRight, yUp, yDown,pixel;
		
		for(int row = 0 ; row < numRows ; row++){
			for(int col = 0 ; col< width ; col++){
				pixel = image[row * width + col];
				xLeft = (col == 0) ? 0 : col -1;
				xRight = (col == width-1) ? col : col +1;
				yUp = (row == 0) ? 0 : row -1;
				yDown = (row == numRows -1) ? row : row +1;
				if(meetThreshold(xLeft, xRight, yUp, yDown,width,image,pixel,threshold)){
					output[row*width +col] = pixel;
				}
				
			}
		}
		
		
		
		return output;
	}
	
	public static boolean meetThreshold(int xLeft,int xRight,int yUp,int yDown,int width, int[] image, int value, int threshold){
		int temp;
		for(int row = yUp; row<= yDown ; row++){
			for(int col = xLeft ; col <= xRight ; col++ ){
				temp = Math.abs(value - image[row* width + col]);
				if(temp >= threshold){
					return true;
				}
			}
		}
		
		return false;
	}

}
