import java.util.*;

public class ArrayList1 {
	public static void main(String [] args ) {
			List<String> test = new ArrayList<String>();
			String s= "hi";
			test.add("String");
			test.add(s);
			test.add(s+s);
			System.out.println(test.size());
			System.out.println(test.contains(42));
			System.out.println(test.contains("hihi"));
			test.remove("hi");
			System.out.println(test.size());
			
	}
}