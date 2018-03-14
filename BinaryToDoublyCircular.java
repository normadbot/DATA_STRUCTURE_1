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
public class BinaryToDoublyCircular{
		Node head,root;
		public BinaryToDoublyCircular(){
			this.head=null;
			this.root=null;
		}
		static Node prev;
		void convertToDoublyCircular(Node root){
			if(root==null)return;
			convertToDoublyCircular(root.left);
			if(head==null){
				head=root;
			}else{
				root.left=prev;
				prev.right=root;
			}
			prev=root;
			convertToDoublyCircular(root.right);
			
		}
		void intoCircular(Node head){
			
			Node h= head;
		
			while(h!=null){
				if(h.right==null){	
					h.right=head;
					head.left=h;
					break;
				}
				h=h.right;
			}
		}
		void displayCircular(Node head){
			if(head==null)return;
				Node h=head;
				//System.out.println(head.data);
			do{
				System.out.print(h.data+" ");
				h=h.right;
			}while(h!=head);
		}
		public static void main(String [] args){
			BinaryToDoublyCircular a = new BinaryToDoublyCircular();
			a.root= new Node(10);
			a.root.left= new Node(12);
			a.root.left.left= new Node(25);
			a.root.left.right= new Node(30);
			a.root.right= new Node(15);
			a.root.right.left= new Node(36);
			a.convertToDoublyCircular(a.root);
			a.intoCircular(a.head);
			a.displayCircular(a.head);
		}
}