import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class BinarySearchTreeUsngNode{
			public static Node root;
			public static boolean isLeft;
			public void addNode(int datas){
				Node newNode= new Node(datas);
				if(root==null){
					root=newNode;
					return;
				}
				Node Current=root;
				while(Current!=null){
					if(Current.data>datas){
						if(Current.left!=null){
							Current.left=newNode;
							return;
						}
						 else{
							Current=Current.left;
							continue;
						 }
					}
					if(Current.data<datas){
						if(Current.right==null){
							Current.right=newNode;
							return;
						}
						else{
						Current=Current.right;
							continue;
						}
					}
				}
				
			}
	public Node find(int id){
		Node current = root;
		Node parent = root;
	    isLeft=false;
		while(current!=null){
				parent=current;
			if(current.data==id){
				return parent;
			}else if(current.data>id){
				isLeft=true;
				current = current.left;
			}else{
				isLeft=false;
				current = current.right;
			}
		}
		return null;
    }
		public void delete(int datas){
			if(root==null){
				System.out.println("The value of  Tree is Null");
				return;
			}
			Node Current;
			Current=find(datas);
			if(Current.left==null && Current.right==null){
				if(isLeft==true){
					Current.left=null;
					return;
				}
				if(isLeft==false){
					Current.right=null;
					return;
				}
			}
		}		
			public void display(Node root){
				if(root!=null){
					System.out.print(" "+root.data);
					display(root.left);
					display(root.right);
				}
			}
			public static void main(String [] args ){
				BinarySearchTreeUsngNode bs= new BinarySearchTreeUsngNode();
				bs.addNode(1);
				bs.addNode(2);
				bs.addNode(3);
				bs.addNode(4);
				bs.addNode(5);
				bs.display(bs.root);
				System.out.println();
				bs.delete(5);
				bs.display(bs.root);
			
			}
}
