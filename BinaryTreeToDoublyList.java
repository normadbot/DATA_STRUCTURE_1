import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinaryTreeToDoublyList{
		Node root,head;
		public BinaryTreeToDoublyList(){
			this.root=null;
			this.head=null;
		}
		static Node prev=null;
		void convert(Node root){
			if(root==null)return;
			convert(root.left);
			if(head==null){
				head=root;
			}else{
				root.left=prev;
				prev.right=root;
			}
			prev=root;
			convert(root.right);
		}
		void displayList(Node head){
			if(head==null)return;
			
			System.out.print(head.data+" ");
			displayList(head.right);
		}
		void convert2(Node root){
			if(root==null)return;
			convert2(root.right);
			
			root.right=head;
			
			if(head!=null){
				head.left=root;
			}
			
			head=root;
			convert2(root.left);
			
			
		}
		public static void main(String [] args){
			BinaryTreeToDoublyList a = new BinaryTreeToDoublyList();
			a.root= new Node(10);
			a.root.left= new Node(12);
			a.root.left.left= new Node(25);
			a.root.left.right= new Node(30);
			a.root.right= new Node(15);
			a.root.right.left= new Node(36);
		//	a.convert(a.root);
			a.convert2(a.root);
			a.displayList(a.head);
		}
}	