import java.lang.*;
import java.util.*;
public class ArrayNotZeroMerge{
			public static void main(String [] args ){
					int a[]={1,2,5,9,0,6,81,100,0,40};
					int b[]={0,50,54,141};
					int l=0;
					for(int i=0;i<a.length;i++){
						if(a[i]==0){
							continue;	
						}
						l++;
					}
					for(int j=0;j<b.length;j++){
						if(b[j]==0){
							continue;
						}
						l++;
					}
					System.out.println(l);
					int c[]=new int[l];
					int k=0;
					while(k!=l){
						l1:	for(int y:a){
								if(y==0){
									continue l1;
								}
								c[k]=y;
								k++;
							}
						l2:	for(int z=0;z<b.length;z++){
								if(b[z]==0){
									continue l2;
								}
								c[l-k]=b[z];
								k++;
							}
							
					}
					for(int v=0;v<c.length;v++){
						System.out.print(" "+c[v]);
					}
			}
}