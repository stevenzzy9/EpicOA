package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class BasketballHitRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			BufferedReader hits = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input the number of hits");
			float hitsNum = Float.parseFloat(hits.readLine()); 
			
			BufferedReader chances = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input the number of chances");
			float chancesNum = Float.parseFloat(chances.readLine()); 
			
			
			BufferedReader remaining = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input the number of remaining game");
			float remainingNum = Float.parseFloat(remaining.readLine()); 
			
			operation(hitsNum,chancesNum,remainingNum);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}
	public static void operation(float hits, float chances, float remaining){
		float a, b ;
		a = hits;
		b = chances;
		float rate = a / b ;
		
		DecimalFormat df = new DecimalFormat("#.###"); 
		
		System.out.println("hits : " + hits + " chances : " + chances + " remaining games :" + remaining);
		System.out.println("Rate of hiting : " + df.format(rate));
		
		float remainingRate = (float) 0.45;
		float futurehits = remaining * remainingRate;
		
		System.out.println("Future hits : " + df.format(futurehits));

	}

}
