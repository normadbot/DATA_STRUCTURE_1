import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class BinaryHeap_MinHeap_Operations{		
	ArrayList<Integer> a;
	public BinaryHeap_MinHeap_Operations(ArrayList<Integer> a){
		this.a=a;
	}
	void minHeap(ArrayList<Integer> a){
		int n=a.size();
		for(int i=n/2;i>=0;i--){
			minHeapify(a,i,n);
		}	
	}				
	void minHeapify(ArrayList<Integer> a,int i,int n){
		int l=2*i;
		int r=2*i+1;
		int smallest=i;
		if(l<n && a.get(i)>a.get(l)){
			smallest=l;
		}
		if(r<n && a.get(smallest)>a.get(r)){
			smallest=r;
		}
		if(smallest!=i){
			Collections.swap(a,smallest,i);
			minHeapify(a,smallest,n);
		}
	}
	Integer getMin(ArrayList<Integer> a){
		return a.get(0);
	}
	void extractMin(ArrayList<Integer> a){
		a.remove(0);
		minHeap(a);
	}
	void insert(int data){
		a.add(data);
		minHeap(a);
	}
	void deleteKey(int data){
		for (Integer x:a) {
			if(x==data){
				a.remove(x);
				break;
			}
		}
		minHeap(a);

	}
	public static void main(String [] args){
		ArrayList<Integer> a= new ArrayList<Integer>();
		BinaryHeap_MinHeap_Operations b= new BinaryHeap_MinHeap_Operations(a);
		a.add(5);
		a.add(3);
		a.add(17);
		a.add(10);
		a.add(84);
		a.add(19);
		a.add(6);
		a.add(22);
		a.add(9);
		b.minHeap(a);
		System.out.println(a);
		Integer minElement=b.getMin(a);
		System.out.println(minElement);
		b.extractMin(a);
		System.out.println(a);
		b.insert(92);
		System.out.println(a);
		b.deleteKey(92);
		System.out.println(a);
	}
}
