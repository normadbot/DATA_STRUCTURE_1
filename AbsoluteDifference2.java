import java.lang.*;
import java.util.*;
public class AbsoluteDifference2 {
		public static void main(String [] args ){
				int a[]={1,8,9,15,16};
				int b=0;
				for(int i=a.length-1;i>=0;i--){
					b+=i*a[i]-(a.length-1-i)*a[i];
				}
				System.out.println("The value is :"+b);
		
		
		}
}