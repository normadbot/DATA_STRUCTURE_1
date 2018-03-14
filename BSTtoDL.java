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
public class BSTtoDL{
			Node head;
			public static Node root;
			public BSTtoDL(){
				this.head=null;
			}
				
			public void display(Node root){
				if(root!=null){
					display(root.left);
					System.out.print("Bef: "+root.data+" ");
					display(root.right);
					System.out.println("Aft: "+root.data);
				}
			}
			Node createDL1(Node root){
				if(root==null){
					return null;
				}
				createDL1(root.left);
				if(head==null){
					head=new Node(root.data);
				}else{
					Node x=head;
					Node p=head;
					Node newNode= new Node(root.data);
					while(x!=null){
						if(x.right==null){
							x.right=newNode;
							newNode.left=p;
							break;
						}
						p=x;
						x=x.right;
					}
				}
				createDL1(root.right);
				return head;
			}
			void printDLL(Node head){
				if(head!=null){
					System.out.print(head.data+" ");
					printDLL(head.right);
				}
			}
			
			public static void main(String [] args ){
				BSTtoDL bs= new BSTtoDL();
				bs.root= new Node(10);
				bs.root.left=new Node(12);
				bs.root.right=new Node(15);
				bs.root.left.left=new Node(25);
				bs.root.left.right=new Node(30);
				bs.root.right.left=new Node(36);
			//	bs.display(bs.root);
				System.out.println();	
				Node r=bs.createDL1(bs.root);
				bs.printDLL(r);
				
			}
}
