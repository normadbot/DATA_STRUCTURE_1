import java.util.*;
import java.lang.*;

public class ArraytoList {
		public static void main(String [] args ){
			String [] sa = {"one","two","three","Four"};
			List sList= Arrays.asList(sa);
			System.out.println("size"+sList.size());
			System.out.println("indx2"+sList.get(2));
		
		}
}