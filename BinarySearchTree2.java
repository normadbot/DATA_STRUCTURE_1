import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node right;
	Node left;
	Node(int data){
		this.data=data;
		right=null;
		left=null;
	}
}
public class BinarySearchTree2{
	public static Node root;
	public BinarySearchTree2(){
		this.root=null;
	}
	public boolean delete (int data){
		Node current=root;
		Node parent=root;
		boolean isLeftChild=false;
		while(current.data!=data){
			parent=current;
			if(current.data>data){
				isLeftChild=true;
				current=current.left;
			}else{
				isLeftChild=false;
				current=current.right;
			}
			if(current==null){
				return false;
			}
			//case1 for .... when it doesnt have any children//
			if(current.left==null && current.right==null){
				if(current==root){
					root=null;
				}
				if(isLeftChild==true){
					parent.left=null;
				}else{
					parent.right=null;
				}
			}
			//case 2 ,, first we consider that the right side is not having any children//
			else if(current.right==null){
				if(current==root){
					root=null;
				}
				else if(isLeftChild){
					parent.left=current.left;
				}else{
					parent.right=current.left;
				}
			}
			else if(current.left==null){
				if(current==root){
					root=null;
				}
				else if(isLeftChild){
					parent.left=current.right;
				}else {
					parent.right=current.right;
				}
			}
			else if(current.right!=null && current.left!=null){
					Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
			
		}
	}
	public boolean find(int data){
		Node current=root;
		while(current!=null){
			if(current==data){
				return true;
			}
			else if(data<current.data){
				current=current.left;
				
			}else{
				current=current.right;	
			}
		}
		return false;
	}
	public void insert (int data){
		Node newNode= new Node(data);
		if(root==null){
			root=newNode;
			return;
		}
		Node current= root;
		Node parent=null;
		while(true){
			parent=current;
			if(data<current.data){
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
			System.out.println(" "+root.data);
			display(root.right);
		}
	}
		
		
	public static void main(String [] args){
		BinarySearchTree2 b = new BinarySearchTree2();
				b.insert(1);
				b.insert(2);
				b.insert(3);
				b.insert(4);
				b.insert(5);
		System.out.println("Original Tree : ");
		b.display(b.root);
	}
}