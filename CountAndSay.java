package CodingTest;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countAndSay(4));

	}
	public static String countAndSay(int n){
		if(n <= 0){
			return "";
		}
		String res = "1";
		
		for(int i = 2; i<=n ; i++){
			StringBuffer cur = new StringBuffer();
			int count = 1;
			for(int j = 1;j<res.length();j++){
				if(res.charAt(j) == res.charAt(j-1)){
					count++;
				}else{
					cur.append(count);
					cur.append(res.charAt(j-1));
					count = 1;
				}
			}
			cur.append(count);
			cur.append(res.charAt(res.length() -1));
			res = cur.toString();
		}
		
		return res;
	}

}
