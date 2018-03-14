import java.lang.*;
import java.util.*;
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
public class BTLowestCommmonAncestor{
		Node root;
		public BTLowestCommmonAncestor(){
			this.root=null;
		}
		Node LCA(int n1,int n2){
			return findLCA(root,n1,n2);
		}
		Node findLCA(Node root,int n1,int n2){
			if(root==null){
				return null;
			}
			if(root.data==n1 || root.data==n2){
				return root;
			}
			Node l= findLCA(root.left,n1,n2);
			Node r= findLCA(root.right,n1,n2);
		//	System.out.println(l.data);
		//	System.out.println(r.data);
			if(l!=null && r!=null){
				return root;
			}
			return (l!=null)?l:r;
		}
		public static void main(String [] arsg){
			BTLowestCommmonAncestor a = new BTLowestCommmonAncestor();
			a.root= new Node(14);
			a.root.left= new Node(16);
			a.root.right= new Node(18);
			a.root.left.right= new Node (10);
			a.root.left.left= new Node(11);
			a.root.right.left= new Node(17);
			a.root.right.right= new Node(19);
			a.inorder(a.root);
			System.out.println();
			System.out.println(a.LCA(16,17).data);
		}
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
}
