import java.lang.*;
import java.util.*;
public class BinaryConv{
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number in binary form ");
			int n= s.nextInt();
			int c=0;
			int a[]=new int[5];
			while(n>0){
				int bit =  n%2;
					a[c]=bit;
					c++;
					n=n/2;		
			}
			for(int j =4;j>=0;j--){
				System.out.print(a[j]);
			}
		}
}