import java.lang.*;
import java.util.*;
public class BubbleSort{
	public static void main(String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		int j =0;
		do{
				int k=0;
				do{
					if(a[k]>a[k+1]){
					int t=a[k];
					a[k]=a[k+1];
					a[k+1]=t;
				  
				}
					k++;	
				}while(k<n-1);
			j++;
		}while(j<n);
	    int q=0;
		while(q<n){
			System.out.print("  "+a[q]);
			q++;
		}
		
	}
		
}