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
public class BstMirror{
	Node root;
	public BstMirror(){
		this.root=null;
	}
	void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" "+root.data);
			display(root.right);
		}
	}
	Node swap(Node root){
		if(root==null)return null;
		Node left=swap(root.left);
		Node right=swap(root.right);
		Node temp=root.left;
			root.left = root.right;
			root.right=temp;
			return root;
	}
	Node mirror(Node root){
			if(root==null) return null;
			return swap(root);
	}
	Node mirrorIterative(Node root){
		if(root==null)return null;
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node t=q.poll();
			Node temp=t.left;
			t.left=t.right;
			t.right=temp;
			if(t.left!=null){
				q.add(t.left);
			}if(t.right!=null){
				q.add(t.right);
			}
		}
		return root;
	}
	
	public static void main(String [] args){
		BstMirror bm = new BstMirror();
		bm.root = new Node(1);
		bm.root.left = new Node(3);
		bm.root.right = new Node(2);
		bm.root.right.right = new Node(4);
		bm.root.right.left = new Node(5);
		bm.display(bm.root);
		System.out.println();
		Node root1=bm.mirror(bm.root);
		System.out.println("here");
		bm.display(root1);
		System.out.println();
		Node root2=bm.mirrorIterative(bm.root);
		bm.display(root2);
		System.out.println();
		
	}
}