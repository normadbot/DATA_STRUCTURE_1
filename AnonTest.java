import java.lang.*;
import java.util.*;
interface printing {
	public void print();
}
class printed {
	public void prints(printing p){
		p.print();
	}
}

public class AnonTest{
		public static void main(String [] args ){
			
			printed pi = new printed();
			pi.prints(new printing()
			{
					public void print(){
						System.out.print("hey This is print Methods");
					}
			});
			
		}
	
}