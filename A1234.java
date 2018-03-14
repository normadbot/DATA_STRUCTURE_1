import java.lang.*;
import java.util.*;
public class A1234{
		public static void main(String [] args ){
			String s="0^1&0|0";
			int i,x=0;
			for( i=0;i<s.length()-2;){
				if(s.charAt(i+1)=='^'){
					int c1=Character.getNumericValue(s.charAt(i));
					int c2=Character.getNumericValue(s.charAt(i+2));
					 x=c1^c2;
					System.out.println(x);
				}
				if(s.charAt(i+1)=='&'){
					int c1=Character.getNumericValue(s.charAt(i));
					int c2=Character.getNumericValue(s.charAt(i+2));
					 x=c1&c2;
					System.out.println(x);
					
				}
				if(s.charAt(i+1)=='|'){
					int c1=Character.getNumericValue(s.charAt(i));
					int c2=Character.getNumericValue(s.charAt(i+2));
					 x=c1|c2;
					System.out.println(x);
					
				}
				
				i=i+2;
			}
			System.out.println("X:"+x);
			
		}
}