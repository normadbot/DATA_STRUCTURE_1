import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class CheckBstOrNot{
	Node root;
	public CheckBstOrNot(){
		this.root=null;
	}
	void checkBST1(Node root){
		fillarray(root);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<index-1;i++){
				if(a[i]>=a[i+1]){
					System.out.println("Its Not BST");
					return;
				}
		}
		System.out.println("ITS BST");
	}
		int a[]=new int[10];
		int index=0;
	void fillarray(Node root){
		if(root!=null){
			fillarray(root.left);
			a[index++]=root.data;
			System.out.println(root.data+" ");
			fillarray(root.right);
		}
	}
	void checkBST2(Node root){
		Node rootleft=null;
		Node rootright=null;
		boolean b= recurse(root,rootleft,rootright);
		System.out.println("B Values is :"+b);
		
	}
	boolean recurse(Node root,Node rootLeft,Node rootRight){
		if(root==null)return true;
		rootLeft=root.left;
		rootRight=root.right;
		if( rootLeft!=null&&root.data<rootLeft.data)return false;
		if(rootRight!=null&& root.data>root.right.data)return false;
		boolean a= recurse(root.left,rootLeft,rootRight);
		boolean b=recurse(root.right,rootLeft,rootRight);
		return (a&&b);
		
		
	}
		public static void main(String [] args){
			CheckBstOrNot a = new CheckBstOrNot();
			a.root = new Node(15);
			a.root.left = new Node(11);
			a.root.left.right = new Node(14);
			a.root.left.left = new Node(10);
			a.root.right = new Node(19);
			a.root.right.left = new Node(17);
			a.root.right.right = new Node(20);
			
		//	a.checkBST1(a.root);
			a.checkBST2(a.root);
		}
}
