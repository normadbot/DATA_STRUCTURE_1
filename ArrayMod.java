import java.lang.*;
import java.util.*;
public  class ArrayMod{
		public static void main(String [] args){
			int a[]={2,2,0,4,0,2};
			for(int i=0;i<a.length-1;i++){
				if(a[i]==a[i+1]){
					a[i]=2*a[i];
					a[i+1]=0;
				}
				if(a[i]==0)continue;
			}
			System.out.println(Arrays.toString(a));
			int j=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>0){
						int t =a[j];
						a[j]=a[i];
						a[i]=t;
						j++;
					}
			}
			System.out.println(Arrays.toString(a));
		}
}