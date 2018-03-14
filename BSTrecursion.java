import java.lang.*;
import java.util.*;	
class Node {
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	int data;
	Node left;
	Node right;
}
public class BSTrecursion{
	Node root;
	public BSTrecursion(){
		this.root=null;
	}
	Node insertIN(int data){
		root=insert(data,root);
		return root;
	}
	Node insert(int data, Node root){
		if(root==null){
			root= new Node(data);
			return root;
		}
		if(root.data>data){
			root.left=insert(data,root.left);
		}else{
			root.right=insert(data,root.right);
		}
		return root;
	}
	void inorderDisplay(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			inorderDisplay(root.left);
			inorderDisplay(root.right);
		}
	}
	Node deleteIN(int data){
		root=delete(data,root);
		return root;
	}
	Node delete(int data,Node root){
		if(root==null){
			return root;
		}
		if(data<root.data){
			root.left=delete(data,root.left);
		}else if(data>root.data){
			root.right=delete(data,root.right);
		}
		else{
			if(root.left==null){
				return root.right;
			}else if(root.right==null){                     
				return root.left;
			}
			root.data=minValue(root.right);
			root.right=delete(data,root.right);
		}
		
		return root;
	}
	int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
	Node del(int d){
		return delIN(root,d);
	}
	Node delIN(Node root,int data){
		if(root==null){
			return root;
		}
		if(data<root.data){
			root.left=delIN(root.left,data);
		}else if (data>root.data){
			root.right=delIN(root.right,data);
		}else{
			if(root.left!=null && root.right!=null){
				Node temp=root;
				Node minel=MINELEMENT(temp.right);
				root.data=minel.data;
				delIN(root.right,minel.data);
			}else if(root.left!=null){
				root=root.left;
			}else if(root.right!=null){
				root=root.right;
			}else{
				root=null;	
			}
		}
		return root;
	}
	Node MINELEMENT(Node root){
		if(root==null){
			return root;
		}
		else{
		return MINELEMENT(root.left);
		}
	}
	void printpath(Node root){
		int path[]= new int [10];
		printpathIN(root,path,0);
	}
	void printpathIN(Node root,int path[],int index){
		if(root==null)return;
		path[index++]=root.data;
		if(root.left==null && root.right==null){
			System.out.println(Arrays.toString(path));
		}else{
			printpathIN(root.left,path,index);
			printpathIN(root.right,path,index);
		}
	}
	public static void main(String [] args){
		BSTrecursion a = new BSTrecursion();		
			a.insertIN(45);
			a.insertIN(36);
			a.insertIN(63);
			a.insertIN(27);
			a.insertIN(39);
			a.insertIN(40);
			a.insertIN(72);
			a.insertIN(18);
	//	a.inorderDisplay(a.root);
		System.out.println();
	//	a.deleteIN(13);
	//	a.del(13);
	//	a.inorderDisplay(a.root);
		a.printpath(a.root);
	}
}