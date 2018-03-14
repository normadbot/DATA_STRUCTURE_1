import java.io.*;



public class Comp{
	public static void main(String [] args ){
		

Float a= new Float(12.3f);
Float b = new Float(56.22f);
int v = b.compareTo(a);

if(v==0){System.out.println("equ");}
else if (v>0){System.out.println("b greater");}
else {System.out.println("b is smallers");}
    }

}