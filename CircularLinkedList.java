import java.lang.*;
import java.util.*;
class Node{
	Node next;
	int data;
	public Node(int data){
		this.data=data;
		this.next=null;
	}

}
public class CircularLinkedList{
	static Node head;
	public CircularLinkedList(){
		this.head=null;
	} 
	void insertAtBeg(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			head.next=head;
			return;
		}
			Node Current =head;
		while(true){
			if(Current.next==head){
				Current.next=newNode;
				newNode.next=head;
				head= newNode;
				return;
			}
				Current=Current.next;
		}		
	}
	void display(Node head){
		Node Current=head;
		while(true){
			System.out.print(" "+Current.data);
			Current=Current.next;
			if(Current==head)break;
		}
	}
	void insertAtEnd(int data){
			Node newNode = new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			Node Current=head;
			while(true){
				if(Current.next==head){
					Current.next=newNode;
					newNode.next=head;
					return;
				}
				Current=Current.next;
			}
	}
	void insertBeforeNode(int data,int bdata){
			Node newNode= new  Node(data);
			if(bdata==head.data){
					Node Current =head;
			while(true){
				if(Current.next==head){
					Current.next=newNode;
					newNode.next=head;
					head= newNode;
					return;
			}
				Current=Current.next;
		   }
		}
		
		Node C1=head;
		Node C2=head;
		   while(C1.next.data!=bdata){
				C1=C1.next;
				C2=C1.next;
		   }
			C1.next=newNode;
			newNode.next=C2;
			return;
			
			
	}
	void insertAfterNode(int data,int adata){
		Node newNode= new  Node(data);
		Node C1=head;
		Node C2=head;
		   while(C1.data!=adata){
				C1=C1.next;
				C2=C1.next;
		   }
			C1.next=newNode;
			newNode.next=C2;
			return;
	}
		public static void main(String [] ags){
				CircularLinkedList cl = new CircularLinkedList();
				cl.insertAtBeg(5);
				cl.insertAtBeg(50);
				cl.insertAtBeg(55);
				cl.insertAtBeg(60);
				cl.insertAtBeg(51);
				cl.insertAtEnd(10);
				cl.insertAtEnd(11);
				cl.insertBeforeNode(40,51);
				cl.insertBeforeNode(100,11);
				cl.insertAfterNode(14,5);
				cl.insertAfterNode(14,11);
				cl.display(cl.head);
		}
}