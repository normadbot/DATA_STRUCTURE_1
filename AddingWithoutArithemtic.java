import java.lang.*;
import java.util.*;
public class AddingWithoutArithemtic{
		public static void main(String [] args ){
			int a=3;
			int b=5;
			int x=10;
			while(b!=0){
			int carry=a&b;				
			System.out.println(a);															///0011,0101
			a=a^b;
			System.out.println(carry);
			b=carry<<1;
			System.out.println(b);
			x--;
			}
		}
}	