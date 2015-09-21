package CodingTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPrint {
	
	public static void main(String[] args){
		calendar("02/30/2000");
	}
	
	private static void calendar(String input){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat newDateFormat = new SimpleDateFormat("EEE MM/dd/yyyy");
		
		try{
			Date date = dateFormat.parse(input);
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(date);
			int i = cal.get(Calendar.DAY_OF_WEEK);
			
			while(i>0){
				cal.add(Calendar.DATE, -1);
				i--;
			}
			while(i<7){
				cal.add(Calendar.DATE, 1);
				System.out.println(newDateFormat.format(cal.getTime()));
				i++;
			}
			
			
			
		}catch(Exception e){
			System.out.println("error");
		}
		
		
		return;
	}

}
