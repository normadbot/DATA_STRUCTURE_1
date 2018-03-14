import java.lang.*;

public class Bad {
 public void printing(String x)
 {
 System.out.print(x);
 }
 
 public static void main(String [] args ){
 Bad a = new Bad();
 System.out.print("Putting the string to print " ); 
 a.printing("Sarabjeet");
 }

}