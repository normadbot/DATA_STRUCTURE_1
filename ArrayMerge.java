import java.lang.*;
import java.util.*;
public class ArrayMerge{
		public static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number of elements of 1st array: ");
			int n1= s.nextInt();
				System.out.println("Enter the Elements of 1st array ");
			int a[]=new int[n1];
			for(int i=0;i<n1;i++){
				a[i]=s.nextInt();
			}
			System.out.println("Enter the number of elements of 2nd array: ");
			int n2= s.nextInt();
			System.out.println("Enter the Elements of 2nd array ");
			int b[]=new int[n2];
			for(int j=0;j<n2;j++){
				b[j]=s.nextInt();
			}
			
		System.out.println("Merged Array is : ");
	
		int c[]=new int[a.length+b.length];
		int k=0;
		while(k<(a.length+b.length)){
				while(k<a.length)
				{c[k]=a[k];
					k++;
				}
				c[k]=b[k-a.length];
					k++;
		}
		for(int l=0;l<c.length;l++){
			System.out.print(c[l]);
		}
	}

}