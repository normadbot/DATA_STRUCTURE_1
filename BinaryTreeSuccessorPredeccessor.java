import java.lang.*;
import java.util.*;	
class Node {
	public Node(char data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	char data;
	Node left;
	Node right;
}
public class BinaryTreeSuccessorPredeccessor{
		Node root;
		public BinaryTreeSuccessorPredeccessor(){
			this.root=null;
		}
		
	
		public static void main(String [] args){
			BinaryTreeSuccessorPredeccessor a = new BinaryTreeSuccessorPredeccessor();
			a.root = new Node('a');
			a.root.left = new Node('b');
			a.root.right = new Node('c');
			a.root.left.left = new Node('d');
			a.root.left.right = new Node('e');
			Node x = new Node('x');
			a.root.left.right.left = new Node('i');
			a.root.left.right.left.right = new Node('j');
			a.root.left.right.left.right.right = x;
			a.root.right.left = new Node('f');
			Node y = new Node('g');
			a.root.right.right = y;
				
			a.inorder(a.root);
		}
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
}