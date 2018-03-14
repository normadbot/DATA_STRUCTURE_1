import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class BTtoDLLSimplest{
		Node root;
		Node head;
		static Node prev=null;
		public BTtoDLLSimplest(){
			this.head=null;
			this.root=null;
		}
		void displayList(Node root){
			if(root!=null){
				System.out.print(root.data+" ");
				displayList(root.right);
			}
		}
		Node createDLL(Node root){
			if(root==null){
				return null;
			}
			createDLL(root.left);
			if(prev==null){
				head=root;
			}else{
				prev.right=root;
				root.left=prev;
			}
			prev=root;
			createDLL(root.right);
			return head;
		}
		public static void main(String ars[]){
				BTtoDLLSimplest bs = new BTtoDLLSimplest();
				bs.root= new Node(10);
				bs.root.left=new Node(12);
				bs.root.right=new Node(15);
				bs.root.left.left=new Node(25);
				bs.root.left.right=new Node(30);
				bs.root.right.left=new Node(36);
				Node r=bs.createDLL(bs.root);
				bs.displayList(r);
		}	
}