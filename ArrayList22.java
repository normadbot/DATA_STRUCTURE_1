import java.util.*;
import java.lang.*;
public class ArrayList22{
		public static void main(String args[]){
			ArrayList<String> list=new ArrayList<String>();
			list.add("Item 0");
			list.add("Item 2");
			list.add("Item 3");
			list.add("Item 4");
			list.add("Item 5");
			list.add("Item 6");
			list.add(1,"Item 1");
			System.out.println("\n Using the Add method");
			System.out.println(list);
			list.remove("Item 5");
			System.out.println(list);
			System.out.println("\n Using the Iterator Interface");
			
			String  s;
			Iterator e =list.iterator();
			while(e.hasNext()){
				s=(String)e.next();
				System.out.println(s);
			}
			
		}
}