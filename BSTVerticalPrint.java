import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
class Node {
	int data;
	Node right,left;
	Node (int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BSTVerticalPrint{
		Node root;
		public BSTVerticalPrint(){
			this.root=null;
		}
		int mindist(Node root){
			int c=0;
			while(root.left!=null){
				c++;
				root=root.left;
			}
			return c;
		}
		int maxdist(Node root){
			int c=0;
			while(root.right!=null){
				root=root.right;
				 c++;
			}
			return c;
		}
		void printVertical(Node root){
			if(root.left!=null){
				printVertical(root.left);
			}
			System.out.println(root.data+" ");
			System.out.println();
			if(root.right!=null){
				printVertical(root.right);
			}
		}
		void printver(Node root,int d,int hd){
			if(root==null)return;
			if(hd==d){
				System.out.print(root.data+ " ");
			}
			else{
				printver(root.left,d,hd-1);
				printver(root.right,d,hd+1);
			}
		}
		void print(Node root){
			for(int i=mindist(root);i<=maxdist(root);i++){
				printver(root,i,0);
				System.out.print(" ");
			}
		}
		public static void main(String [] args ){
			BSTVerticalPrint v = new BSTVerticalPrint();
			v.root = new Node(1);
			v.root.left = new Node(2);
			v.root.right = new Node(3);
			v.root.right.right = new Node(7);
			v.root.right.right.right = new Node(9);
			v.root.right.left = new Node(6);
			v.root.right.left.right = new Node(8);
			v.root.left.left = new Node(4);
			v.root.left.right = new Node(5);
		//	v.printVertical(v.root);
			v.print(v.root);
		}
}

