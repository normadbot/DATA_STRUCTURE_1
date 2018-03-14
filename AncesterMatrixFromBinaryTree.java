import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class AncesterMatrixFromBinaryTree{
		Node root;
		AncesterMatrixFromBinaryTree(){
			this.root=null;
		}
		void formMatrix(Node root,int a[][]){
			int b[]= new int[10];
			fill(root,a,0,b);
		}
		void fill(Node root,int a[][],int i,int b[]){
			if(root==null)return;
			b[i]=root.data;
			if(root.left==null && root.right==null){
				for(int j=0;j<i;j++){
					for(int k=j+1;k<=i;k++){
						a[b[j]][b[k]]=1;
					}
				}
			}
			fill(root.left,a,i+1,b);
			fill(root.right,a,i+1,b);
			
			
		}
		public static void main(String [] arfs){
			AncesterMatrixFromBinaryTree a= new AncesterMatrixFromBinaryTree();
			a.root=new Node(9);
			a.root.right=new Node(2);
			a.root.right.left=new Node(2);
			a.root.left=new Node(8);
			a.root.left.left=new Node(3);
			a.root.left.right=new Node(5);
			int b[][]=new int[10][10];
			a.formMatrix(a.root,b);
			System.out.println();
						for(int i=0;i<b.length;i++){
							for(int j=0;j<b.length;j++){
								System.out.print(b[i][j]+" ");
							}
							System.out.println();
						}
		}
}
