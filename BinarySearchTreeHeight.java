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
public class BinarySearchTreeHeight{
		Node root;
		public BinarySearchTreeHeight(){
			this.root=null;
		}
		void insert(int data){
			Node newNode=new Node(data);
			if(root==null){
				root=newNode;
				return;
			}
			Node Current=root;
			Node Parent=null;
			while(true){
				Parent=Current;
					if(Current.data>data){
						Current=Current.left;
						if(Current==null){
							Parent.left=newNode;
							return;
						}
					}else if(Current.data<data){
							Current=Current.right;
							if(Current==null){
								Parent.right=newNode;
								return;
							}
						
					}
			}
		}
		void INORDERdisplay(Node root){
			if(root!=null){
					INORDERdisplay(root.left);					//INORDER ->left,root,right
					System.out.print(" "+root.data);
					INORDERdisplay(root.right);
			}
		}void PREORDERdisplay(Node root){				//PREORDER ->root,left,right
			if(root!=null){
					System.out.print(" "+root.data);
					PREORDERdisplay(root.left);
					PREORDERdisplay(root.right);
			}
		}void POSTORDERdisplay(Node root){
			if(root!=null){
					POSTORDERdisplay(root.left);					//POSTORDER ->left,right,root
					POSTORDERdisplay(root.right);
					System.out.print(" "+root.data);
			}
		}
		public Node find(int id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return current;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return current;
	}
	public int treeHeight(Node root){
		if(root==null)return 0;
		return (1+ Math.max(treeHeight(root.left),treeHeight(root.right)));
	}
	int findMax(Node root){
		Node C=root;
		while(C.right!=null){
				C=C.right;
		}
		return C.data;
	}
	int findMin(Node root){
		Node C=root;
		while(C.left!=null){
				C=C.left;
		}
		return C.data;
	}
        boolean sleft=false;
	void delete(int id){
		Node current = root;
		Node P=null;
		boolean isLeft=false;
		while(current!=null){
			if(current.data==id){
				break;		
			}else if(current.data>id){
				P=current;		
				isLeft=true;		
				current = current.left;
			}else{
				P=current;	
				isLeft=false;	
				current = current.right;
			}
		}
			//System.out.println(P.data+" "+current.data+" "+current.left.data+ " "+current.right.data);
		if(current.left==null && current.right==null){
			if(isLeft==true){
				P.left=null;return;
			}else if(isLeft==false){
				P.right=null;return;
			}
		}
		if(current.left==null && current.right!=null){
			if(isLeft==true){
				P.left=current.left;
				return;
			}else if(isLeft==false){
				P.right=current.right;
				return;
			}
		}else if(current.left!=null && current.right==null){
			if(isLeft==true){
				P.left=current.left;
				return;
			}else if(isLeft==false){
				P.right=current.right;
				return;
			}
		}
                
		if(current.left!=null && current.right!=null){
                 
			int succ=inorderSuccessor(current);
			System.out.println(succ);
			int t=current.data;
			current.data=succ;
			succ=t;
                      /*  Node cr=find(succ);
                        if(sleft){
                            current.right=cr.left.left;System.out.println("here4");
                        }else{
                            current.right=cr.right;System.out.println("here5");
                        }
			//delete(current.data);
                            */
			return;
		}
	}
        
	int inorderSuccessor(Node root1){
		Node C=root1.right;
		if(C.left!=null){
                    System.out.println("here1");
		 while(C.left!=null){
		this.sleft=true;
			C=C.left;
			if(C.left==null){
                            root1.right=C.left;
                            System.out.println("here12");
                            return C.data;
                        }
		}
              }else{
                    this.sleft=false;
                    root1.right=C.right;
                    System.out.println("here3");
                return C.data;
                }
	  
	  return C.data;
	}
	int height(Node root1){
            Node C=root1;
            if(C==null){
              System.out.println();  
            }else{
            int left=height(root1.left);
            int right=height(root1.right);
            if(left>right){
                return (left+1);
            }else{
                return (right+1);
            }
            }
            return 0;
        }
		int depth(Node root){
			if(root==null){
				return 0;
			}
			else{
				int left=depth(root.left);
				int right = depth(root.right);
				
				if(left>right){
					return (left+1);
				}else{
					return (right+1);
				}
				
			}
			
		}
		public static void main(String [] args){
			BinarySearchTreeHeight bh=new BinarySearchTreeHeight();
			bh.insert(7);
			bh.insert(15);
			bh.insert(11);
			bh.insert(16);
			bh.insert(5);
			bh.insert(10);
			bh.insert(8);
			bh.insert(4);
			bh.insert(12);
			bh.insert(9);
			System.out.println();
			bh.INORDERdisplay(bh.root);
			System.out.println();
			System.out.println(bh.treeHeight(bh.root)+"  ");
			System.out.println("Max Value Element:"+bh.findMax(bh.root)+"  ");
			System.out.println("Min Value Element:"+bh.findMin(bh.root)+"  ");
			 bh.delete(11);
			System.out.print("INORDER :");
			bh.INORDERdisplay(bh.root);
			System.out.println();
			System.out.print("PREORDER :");
			bh.PREORDERdisplay(bh.root);
			System.out.println();
			System.out.print("POSTORDER :");
			bh.POSTORDERdisplay(bh.root);
            System.out.println("Height"+bh.height(bh.root));
			System.out.println();
			System.out.println("Depth :"+bh.depth(bh.root));
        
		}		
}
