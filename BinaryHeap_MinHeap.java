import java.lang.*;
import java.util.*;
public class BinaryHeap_MinHeap{
		public static void main(String [] args){
			int a[]={5,3,17,10,84,19,6,22,9};
			int n=a.length;
		//	System.out.println(n);
			for(int i=n/2-1;i>=0;i--){
				minHeapify(a,i,n);
			}	
			System.out.println(Arrays.toString(a));
		}
		static void minHeapify(int a[],int i,int n){
			int l=2*i;
			int r=2*i+1;
			int smallest=i;
			if(l<n && a[l]<a[i]){
				smallest=l;
			}
			if(r<n && a[smallest]>a[r]){
				smallest=r;
			}
			if(smallest!=i){
				int t=a[smallest];
				a[smallest]=a[i];
				a[i]=t;
				minHeapify(a,smallest,n);
			}
		}
		
}