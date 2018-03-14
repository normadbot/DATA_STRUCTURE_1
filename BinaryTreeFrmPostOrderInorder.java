import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class BinaryTreeFrmPostOrderInorder{
		static int postIndex;
		public BinaryTreeFrmPostOrderInorder(int l){
			this.postIndex=l;
		}
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		Node formTree(int endIN,int startIN,int []in,int []post){
			if(endIN<startIN){
				System.out.println(postIndex);
				return null;
			}
			int postElement=post[postIndex];
			postIndex--;
			Node newNode= new Node(postElement);
			if(endIN==startIN){
				return newNode;
			}
			int postElIn=0;
			for(int i=endIN; i>=startIN; i--){
				if(postElement==post[i]){
					postElIn=i;
					break;
				}
			}
			newNode.right=formTree(endIN,postElIn+1,in,post);
			newNode.left=formTree(postElIn-1,startIN,in,post);
			
			return newNode;
		}
		
		public static void main(String []args){
			int in[]={4,8,2,5,1,6,3,7};
			int post[]={8,4,5,2,6,7,3,1};
			BinaryTreeFrmPostOrderInorder a = new BinaryTreeFrmPostOrderInorder(post.length-1);
			Node r=a.formTree(in.length-1,0,in,post);
			a.inorder(r);
		}
}