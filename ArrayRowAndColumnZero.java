import java.lang.*;
import java.util.*;
public class ArrayRowAndColumnZero{
	static void display(int a[][]){
		for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}
	}
	static void zeroRowCol(int a[][],int i,int j,int l){
		for(int k=0;k<l;k++){
			a[i][k]=0;
			a[k][j]=0;
		}
	}
	static void convert(int a[][]){
		int t=0;
		int row[] = new int[4*a.length];
		int col[] = new int[4*a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]==0){
					row[t]=i;
					col[t]=j;
					t++;
				}
			}
		}
	//	System.out.println(Arrays.toString(row));
	//	System.out.println(Arrays.toString(col));
		System.out.println();
		for(int i=0;(row[i]!=0 || col[i]!=0);i++){
			zeroRowCol(a,row[i],col[i],a.length);
		}
	}
	public static void main(String [] args){
			int a[][]={{1,2,3,0},{5,6,7,8},{9,10,11,12},{0,14,15,16}};
			display(a);
			System.out.println();
			convert(a);
			display(a);
	}
}
