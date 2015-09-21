package CodingTest;

public class ClockAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(process("12:15"));
		System.out.println(process("12:30"));
		System.out.println(process("2:30"));
		System.out.println(process("13:15"));
		System.out.println(process("1:15"));
		System.out.println(process("6:14"));
		

	}
	public static double process(String time){
		if(time == null || time.length() == 0 ){
			return 0;
		}
		String[] timeNum = time.split(":");
		
		double res = getDegree(Integer.parseInt(timeNum[0]) , Integer.parseInt(timeNum[1]));
		
		return res;
	}
	public static double getDegree(int h, int m){
		double degree = Math.abs(h* 30 + m * 0.5 - m * 6);
		if(degree > 180){
			return 360 - degree;
		}
		
		return degree;
	}

}
