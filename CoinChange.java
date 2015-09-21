package CodingTest;

public class CoinChange {
	
	private static int[] coins = {1,5,10,25};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(change(54));

	}
	private static int change(int sum){
		int[] minCorns = new int[sum+1];
		minCorns[0] = 0;
		for(int i = 1; i< sum +1 ; i++){
			minCorns[i] = Integer.MAX_VALUE;
			for(int j = 0 ; j < coins.length ; j++){
				if(coins[j] <= i && minCorns[i-coins[j]] != Integer.MAX_VALUE && minCorns[i-coins[j]] < minCorns[i]){
					minCorns[i] = minCorns[i-coins[j]] +1;
				}
				
			}
		}
		
		if(minCorns[sum] == Integer.MAX_VALUE){
			System.out.println("Not exist");
			return -1;
		}else{
			return minCorns[sum];
		}
	}
	

}
