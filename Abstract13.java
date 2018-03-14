import java.lang.*;
import java.util.*;

abstract class Abstract12 {
		 void printmessage(){
			System.out.println("hi this is sarabjeet singh using abstract class");
		}
		abstract void print();
}

public class Abstract13 extends Abstract12 {
		void print(){
			System.out.println("This is another message from the class That extends Abstract class");
		}
		public static void  main(String []  args ) {
			Abstract13 a = new Abstract13();
			a.printmessage();
			a.print();
			
		}

}