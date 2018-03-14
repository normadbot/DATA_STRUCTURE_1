import java.lang.*;
import java.util.*;
public class BinarySearch2 {
		public static void main(String []  args ){
			Scanner s  = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int n = s.nextInt();
			int [] a = new int[n];
			System.out.println("Enter Elememts of Array in SORTED ORDER");
			for(int i =0;i<n;i++){
				a[i]=s.nextInt();
			}
			System.out.println("Enter the Elements you want to search");
			int se=s.nextInt();
			int beg=0,end=n-1,mid=(beg+end)/2;
			while(beg<=end){
				 mid=(beg+end)/2;
				if(se<mid){
					end=mid;
				}
				else{
					beg=mid+1;
				}
				
				
			}
			System.out.println("Elememt "+se+"at pos"+mid);
		}
}
