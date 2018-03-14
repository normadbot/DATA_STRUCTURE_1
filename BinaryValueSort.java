import java.lang.*;
import java.util.*;
public class BinaryValueSort{
		public static void main(String [] args){
				int a[]={1,0,1,1,0,0,1,1,0,1,0,1,0};
				int j=0;
				for(int i=0;i<a.length;i++){
					if(a[i]<1){
						int t =a[i];
						a[i]=a[j];
						a[j]=t;
						j++;
					}
				}
				System.out.println(Arrays.toString(a));
		}
}
