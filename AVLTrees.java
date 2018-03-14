import java.lang.*;
import java.util.*;
import java.util.LinkedList;

class Node {
	int data;
	int height;
	Node right,left;
	Node(int data){
		this.data=data;
		this.height=1;
		this.right=null;
		this.left=null;
	}
}

public class AVLTrees{
	
		Node root;
	public 	AVLTrees(){
			this.root=null;
		}
		int heightofTree(Node root){
		if(root==null){
			return 0;
		}else{
			int l= heightofTree(root.left);
			int r= heightofTree(root.right);
			if(l>r){
				return (l+1);
			}else return (r+1);
		}
	}
		void insert(int data){
			root=inserttree(data,root);
		}
		int	 getHeight(Node n){
			if(n!=null){
				return n.height;
			}
			return 0;
		}
		int getBalance(Node n){
			if(n!=null){
				return (getHeight(n.left)-getHeight(n.right));
			}
			return 0;
		}
		Node leftRotate(Node n){
			Node a =n.right;
			Node t= a.left;
			
			a.left=n;
			n.right=t;
			a.height=Math.max(getHeight(a.left),getHeight(a.right))+1;
			n.height=Math.max(getHeight(n.left),getHeight(n.right))+1;
			
			return a;
		}
		Node rightRotate(Node n){
			Node a=n.left;
			Node t=a.right;
			
			a.right=n;
			n.left=t;
			
			a.height=Math.max(getHeight(a.left),getHeight(a.right))+1;
			n.height=Math.max(getHeight(n.left),getHeight(n.right))+1;
			
			return a;
		}
		Node inserttree(int data,Node root){	
		
			if(root==null){
				root=new Node(data);
				return root;
			}
			
				if(root.data>data){
				
				root.left=inserttree(data,root.left);
			
				}
				else {
				
				root.right= inserttree(data,root.right);
			
				}
				root.height=heightofTree(root);
				int bf=getBalance(root);
			
			if(bf>1 && data<root.left.data){
				return rightRotate(root);
			}
			if(bf<-1 && data>root.right.data){
				return leftRotate(root);
			}
			if(bf>1 && data>root.left.data){
				root.left=leftRotate(root.left);
				return rightRotate(root);
			}
			if(bf<-1 && data<root.right.data){
				root.right=rightRotate(root.right);
				return leftRotate(root);
			}
			return root;	
		}
		void inorder(Node root){
			if(root!=null){
				System.out.println(root.data+" ");
				inorder(root.left);
				inorder(root.right);
			}
		}
		public static void main(String [] args){
			AVLTrees a = new AVLTrees();
			
			a.insert(45);
			a.insert(36);
			a.insert(63);
			a.insert(27);
			a.insert(39);
			a.insert(40);
			a.insert(72);
			a.insert(18);
		
		
		a.inorder(a.root);
		}
}