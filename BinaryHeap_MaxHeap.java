import java.lang.*;
import java.util.*;
public class BinaryHeap_MaxHeap{
	public static void main(String[] args){
	//	int a[]={5,3,17,10,84,19,6,22,9};
		int a[]={3,5,9,6,17,19,10,22,84};
		int n=a.length;
		for(int i=n/2;i>=0;i--){
			maxHeapify(a,i,n);
		}
		System.out.println(Arrays.toString(a));
	}
	static void swap(int a[],int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static void maxHeapify(int a[],int i,int n){
		int l=2*i;
		int r=2*i+1;
		int largest=i;
		if(l<n && a[i]<a[l]){
			largest=l;
		}
		if(r<n && a[largest]<a[r]){
			largest=r;
		}
		if(largest!=i){
			swap(a,i,largest);
			maxHeapify(a,largest,n);
		}
	}
}