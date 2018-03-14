import java.lang.*;
import java.util.*;
public class Biggestsequence2D{
		public static void main(String [] args){
				Biggestsequence2D ab = new Biggestsequence2D();
			int a[]={50,3,10,7,40,80};
				for(int i=0;i<a.length;i++){
					int c=0;
				//	System.out.print(a[i]+" ");
					for(int j=i;j<a.length;j++){
						if(a[i]<a[j]){
							c++;
				//		System.out.print(a[j]+" ");
						}
					}
					//System.out.println("here the size is"+(c+1));
					ab.put(c+1);
				}
				ab.check();
		}
		void check(){
			int max=ar[0];
			for(int i=1;i<ar.length;i++){
				if(max<ar[i]){
					max=ar[i];
				}
			}
			System.out.print(max);
		}
	  static int p=0;
	 static int ar[]=new int[10];
		void put(int i){
			ar[p++]=i;
		}
}