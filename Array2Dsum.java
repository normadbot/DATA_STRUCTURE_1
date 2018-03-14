import java.lang.*;
import java.util.*;
public class Array2Dsum{
		public static void main(String [] args){
				int [][]a={{1,2,3},{4,5,6},{7,8,9}};
			
			for(int x=0;x<a.length;x++){
				for(int y=0;y<a.length;y++){
					System.out.print(a[x][y]+" ");
				}
				System.out.println();
			}
					
					
					int sum=0;
					
					for(int x=0;x<a.length;x++){
				for(int y=0;y<a.length;y++){
					
					sum+=a[x][y];
				}
					
			}
			System.out.println("Sum is: "+sum);
		
		}
}