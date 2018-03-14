import java.lang.*;
import java.util.*;
public class BinarySearchTree1{
		public static Node root;
		public BinarySearchTree1(){
			this.root=null;
		}
		public boolean find(int id){
				Node current = root;
			while(current!=null){
				if(current.data==id){
						return true;
				}else if(current.data>id){
					current=current.left;
				}else{
						current=current.right;
				}
				
			}
			return false;
		}
		
		public void insert(int id){
			Node newNode= new Node(id);
			if(root==null){
				root=newNode;
				return;
			}
			Node current=root;
			Node parent = null;
			while (true){
				parent=current;
				if(id<current.data){
					current=current.left;
					if(current==null){
						parent.left=newNode;
						return;
					}
				}else{
					current=current.right;
					if(current==null){
						parent.right=newNode;
						return;
					}
				}
			}
		}
		public void display(Node root){
			if(root!=null){
				display(root.left);
				System.out.print(" "+root.data);
				display(root.right);
			}
		}	
	
		public static void main(String [] args ){
				BinarySearchTree1 b =new BinarySearchTree1();
				b.insert(1);
				b.insert(2);
				b.insert(3);
				b.insert(4);
				b.insert(5);
				b.insert(6);
				b.insert(7);
				
				System.out.println("Original Tree : ");
				b.display(b.root);		
				System.out.println("");
			
		}
}
class Node {
		int data;
		Node right;
		Node left;
		public Node(int data){
			this.data=data;
			left=right=null;
		}
}
