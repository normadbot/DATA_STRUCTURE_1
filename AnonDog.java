import java.lang.*;
 
class Dog {
	public void dog(){
	System.out.println("Classic dog");
	}

} 
 
public class AnonDog {
	public static void main (String [] args ) {
		Dog d = new Dog() {
			public void dog(){
				System.out.println("This is Anonymous Dog ");
			
			}
		
		
		};
	d.dog();
	}


}