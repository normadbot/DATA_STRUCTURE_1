import java.lang.*;	
import java.util.*;
class bnode{
    bnode right;
    bnode left;
    int data;
    public bnode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class BoundaryTraversal {
    bnode root;
    public BoundaryTraversal(){
        this.root=null;
    }
    void printLeftBoundary(bnode node){
        if(node!=null){
            if(node.left!=null){
                System.out.print(" "+node.data);
                printLeftBoundary(node.left);
            }else if(node.right!=null){
                  System.out.print(" "+node.data);
                printLeftBoundary(node.right);
            }
        }
    }
    void printRightBoundary(bnode node){
        if(node!=null){
            if(node.right!=null){
                printRightBoundary(node.right);    
                System.out.print(" "+node.data);
            }else if(node.left!=null){
                printRightBoundary(node.left);
                  System.out.print(" "+node.data);
            }
        }
    }
    void printLeaves(bnode node){
        if(node!=null){
            printLeaves(node.left);
            if(node.right==null && node.left==null)
                System.out.print(" "+node.data);
           
            printLeaves(node.right);	
        }
    }
    void display(bnode root){
       bnode c = root;
       if(root!=null){
           System.out.print(root.data);
           printLeftBoundary(root.left);
           printLeaves(root.left);
           printLeaves(root.right);
           printRightBoundary(root.right);
       }
    }
    public static void main(String [] args ){
        BoundaryTraversal bt = new BoundaryTraversal();
        bt.root=new bnode(20);
        bt.root.left=new bnode(8);
        bt.root.left.left=new bnode(4);
        bt.root.left.right=new bnode(12);
        bt.root.left.right.right=new bnode(14);
        bt.root.left.right.left=new bnode(10);
        bt.root.right=new bnode(22);
        bt.root.right.right=new bnode(25);  
        bt.display(bt.root);
    }
}
