import java.lang.*;
import java.util.*;
public class BinarySearch{
	
	
	
	public static void main(String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		 
		System.out.println("Enter the elements to Search");
		int se= s.nextInt();
		int pos=0;
		int beg=1;
		int end =n-1;
		int mid =(beg+end)/2;
		while(a[mid]!=se){
			  
				if(se<a[mid]){
					end=mid;
				}
				else if(se>=a[mid])
				{	beg=mid+1;}
			mid=(end+beg)/2;
			
		}
			
		System.out.println("Value :"+se+"Is at  position"+(mid+1)+" ");
	
	}

}