import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	int height;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
		this.height=1;
	}
}
public class AVLFullImplementation1{
	Node root;
	public AVLFullImplementation1(){
		this.root=null;
	}
	int heightofTree(Node root){
		if(root==null) return 0;
		else{
			int l= heightofTree(root.left);
			int r= heightofTree(root.right);
			if(l>r){
				return (l+1);
			}else return (r+1);
		}
	}
	int	 getHeight(Node n){
			if(n!=null){
				return n.height;
			}
			return 0;
	}
	Node rightRotation(Node a){
		Node x=a.left;
		Node t=x.right;
		x.right=a;
		a.left=t;
		a.height=Math.max(getHeight(a.left),getHeight(a.right))+1;
		x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
		return x;
	}
	Node leftRotation(Node a){
		Node x=a.right;
		Node t=x.left;
		x.left=a;
		a.right=t;
		a.height=Math.max(getHeight(a.left),getHeight(a.right))+1;
		x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
		return x;
	}
	int getBalance(Node root){
		if(root!=null){
			return (getHeight(root.left)-getHeight(root.right));
		}
		return 0;
	}
	Node insert(int data){
		root=insertIN(root,data);
		return root;
	}
	
	Node insertIN(Node root,int data){
		if(root==null){
			root=new Node(data);
			return root;
		}
		if(root.data>data){
			root.left=insertIN(root.left,data);
		}
		else {
			root.right=insertIN(root.right,data);
		}
		root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
		int balance=getBalance(root);
		if(balance>1 && data<root.left.data){
			return rightRotation(root);
		}
		if(balance<-1 && data>root.right.data){
			return leftRotation(root);
		}
		if(balance>1 && data>root.left.data){
			root.left=leftRotation(root.left);
			return rightRotation(root);
		}
		if(balance<-1 && data<root.right.data){
			root.right=rightRotation(root.right);
			return leftRotation(root);
		}
		return root;
	}
	
	Node delete(int data){
		root=deleteIN(root,data);
		return root;
	}
	Node deleteIN(Node root,int data){
		if(root==null)return root;
		if(data<root.data){
			root.left=deleteIN(root.left,data);
		}else if(data>root.data){
			root.right=deleteIN(root.right,data);
		}else{
			
			if(root.right!=null && root.left!=null){
				
				Node t= root;
				
				Node minfromleft=min(t.right);
				
				root.data=minfromleft.data;
				
				deleteIN(root.right,minfromleft.data);
			}
			else if(root.right!=null){
				 root=root.right;
			}else if(root.left!=null){
				root=root.left;
			}else{
				root=null;
			}
		}	
			if(root==null){
				return root;
			}
			root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
			int balance=getBalance(root);
			if(balance>1 && getBalance(root.left)>=0){
				return rightRotation(root);
			}
			
			if(balance>1 && getBalance(root.left)<0){
				root.left=leftRotation(root.left);
				return rightRotation(root);
			}
			
			if(balance<-1 && getBalance(root.right)<=0){
				return leftRotation(root);
			}
			
			if(balance<-1 && getBalance(root.right)>0){
				root.right=rightRotation(root.right);
				return leftRotation(root);
			}
	
		return root;
	}
	
	Node min(Node t){
		if(t==null)return t;
		else{
			return min(t.left);
		}
	}
	void preorder(Node root){
		if(root!=null){
			System.out.print(root.data+"  ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
		public static void main(String [] args){
			AVLFullImplementation1 a= new AVLFullImplementation1();
			a.insert(9);
			a.insert(5);
			a.insert(10);
			a.insert(0);
			a.insert(6);
			a.insert(11);
			a.insert(-1);
			a.insert(1);
			a.insert(2);
			a.preorder(a.root);
			a.delete(10);
			System.out.println();
			a.preorder(a.root);
			
		}
}