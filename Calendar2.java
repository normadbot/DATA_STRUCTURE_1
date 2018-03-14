import java.util.*;

public class Calendar2 {
		public static void main(String []  args ) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.HOUR,-4);
		System.out.println(c.getTime());
		c.add(Calendar.YEAR,2);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_WEEK,2);
		System.out.println(c.getTime());
		
			
		
		}

}