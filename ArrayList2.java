import java.util.*;

public class ArrayList2 {
	public static void main(String [] args ) {
			List<String> test = new ArrayList<String>();
				test.add("Denver");
				test.add("sarabjeet");
				test.add("Arushi");
				System.out.println("Unsorted"+test);
				Collections.sort(test);
				System.out.println("sorted"+test);
			}
}