import java.lang.*;
import java.util.*;
public class Array2dColumnSortRows{
		public static void main(String [] args){
			int a[][]={{10,14,11,15},{9,6,7,9},{1,4,2,2},{14,5,6,91}};
			int col=3;
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
			for(int i=0;i<a.length-1;i++){
				for(int j=0;j<a.length-i-1;j++){
					if(a[j][col]>a[j+1][col]){
						int s=j;
						int r=j;
						for(int x=col;x>=0;x--){
							int t=a[s][x];
							a[s][x]=a[s+1][x];
							a[s+1][x]=t;
						}
						
					}
				}				
			}
			
			
			System.out.println();
			System.out.println();
			System.out.println();
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
}
