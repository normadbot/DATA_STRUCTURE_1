import java.lang.*;

 interface Manageble {
    public void manage();
 
 }
 
 public class AnonManageble {
	public static void main(String [] args) {
	 Manageble m = new Manageble() {
		public void manage(){
			System.out.println("It is manageble");
		} 
	 };
	 m.manage();
 }
 }