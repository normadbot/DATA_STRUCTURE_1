import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class BTtoDL{
	Node root;
	Node head;
	static Node prev =null;
	public BTtoDL(){
		this.root=null;
		this.head=null;
	}
	void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" "+root.data);
			convertToDl(root);
			display(root.right);
		}
	}
	void convertToDl(Node root){
		if(root==null){
			return;
		}
		if(prev==null){
			head=root;
		}else{
			root.left=prev;
			prev.right=root;
		}
		prev=root;
	}
	void printlist(Node node){
			while(node!=null){
				System.out.println(node.data+" ");
				node = node.right;
			}
	}
	public static void main(String [] args ){
		BTtoDL bdl = new BTtoDL();
		bdl.root = new Node(10);
		bdl.root.left = new Node(12);
		bdl.root.right = new Node(15);
		bdl.root.left.left = new Node(25);
		bdl.root.left.right = new Node(30);
		bdl.root.right.left = new Node(36);
		bdl.display(bdl.root);
	//	bdl.convertToDl(bdl.root);
		bdl.printlist(bdl.head);
 	}
}