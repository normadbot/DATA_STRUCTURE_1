import java.lang.*;
import java.util.*;
public class ArrayMan2{
		public static void main(String [] args ){
			int a[][]={{1,2,3,11},{4,5,12},{7,8,9,10}};
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length+1;j++){
						System.out.print(a[i][j]+" ");
						
				}
				System.out.println();
				
			}
			
		}


}