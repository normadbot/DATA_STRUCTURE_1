import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	Node right;
	Node left;
	int data;
   public Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
	}
}
public class BSTmirrorCheck{
	Node root1,root2;
	public BSTmirrorCheck(){
		this.root1=null;
		this.root2=null;
	}
	boolean check1(Node root1,Node root2){
		if(root1==null || root2==null) return false;
			if( root1==null && root2==null  ){
				return true;
			}
			
			 return( root1.data==root2.data && check1(root1.left,root2.right)&& check1(root1.right,root2.left));
			
	}
	
	static void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		static void RevInorder(Node root){
			if(root!=null){
				RevInorder(root.right);
				System.out.print(root.data+" ");
				RevInorder(root.left);
			}
		}
	public static void main(String []  args){
		BSTmirrorCheck bst = new BSTmirrorCheck();
		bst.root1 =new Node(1);
		bst.root1.left =new Node(3);
		bst.root1.right =new Node(2);
		bst.root1.right.right =new Node(4);
		bst.root1.right.left =new Node(5);
		
		bst.root2 = new Node(1);
		bst.root2.right = new Node(3);
		bst.root2.left = new Node(2);
		bst.root2.left.left = new Node(4);
		bst.root2.left.right = new Node(5);
		
		boolean s1= bst.check1(bst.root1,bst.root2);
		//System.out.println(s1);
		bst.inorder(bst.root1);
		System.out.println();
		bst.RevInorder(bst.root1);
		System.out.println();
		bst.inorder(bst.root2);
		System.out.println();
		bst.RevInorder(bst.root2);
		
		
	}
}