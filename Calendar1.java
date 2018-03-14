import java.util.*;

public class Calendar1 {
	public static void main(String [] args ){
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date is :"+d1.toString());			
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		
		if(c.SUNDAY==c.getFirstDayOfWeek());
		 System.out.println("Trillionth milli day of week is "+c.get(c.DAY_OF_WEEK));
		 
		 c.add(Calendar.MONTH,1);
		 Date d2 = c.getTime();
		 System.out.println("new date"+d2.toString());
		

    }
}