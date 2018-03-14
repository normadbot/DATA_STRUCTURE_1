import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class AppendAlternateNodeAtEndReverse{
		Node head;
		public AppendAlternateNodeAtEndReverse(){
			this.head=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+"->");
				display(head.next);
			}
		}
		void appendAltRevAtEnd(Node odd){
			if(head==null)return;
			Node even=odd.next;
			odd.next=odd.next.next;
			odd=odd.next;
			
			even.next=null;
			
			while(odd!=null && odd.next!=null){
				Node t= odd.next.next;
				
				odd.next.next=even;
				even=odd.next;
				
				odd.next=t;
				if(t!=null){
					odd=t;
				}
				
			}
			odd.next=even;
			display(head);
			
		}
		public static void main(String [] args){
			AppendAlternateNodeAtEndReverse a = new AppendAlternateNodeAtEndReverse();
			a.head=new Node(1);
			a.head.next=new Node(2);
			a.head.next.next=new Node(3);
			a.head.next.next.next=new Node(4);
			a.head.next.next.next.next=new Node(5);
			a.head.next.next.next.next.next=new Node(6);
			a.head.next.next.next.next.next.next=new Node(7);
			a.head.next.next.next.next.next.next.next=new Node(8);
			a.display(a.head);
			System.out.println();
			a.appendAltRevAtEnd(a.head);
		}
}