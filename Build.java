import java.lang.*;

public class Build {
 public static void main(String [] args ) {
  StringBuilder sb = new StringBuilder("abc");
  sb.append("def").insert(3,"---HELLO---").reverse();
  System.out.println(sb);
 
 }

}