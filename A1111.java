import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class A1111{
	Node head,head1,add;
		public A1111(){
			this.head=null;
			this.add=null;
			this.head1=null;
		}
		int length(Node c){
			int cnt=0;
			if(c==null)return 0;
			while(c!=null){
				cnt++;
				c=c.next;
			}
			System.out.println("length:"+cnt);
			return cnt;
		}
		
		void work(Node head1,Node head2){
			Node c1=head1;
			Node c2=head2;
			Node c1next=null;
			Node c2next=null;
			while(c1!=null && c2!=null){
			c2next=c2.next;
			c1next=c1.next;
			
			c1.next=c2;
			
			c2.next=c1next;
			c2=c2next;
			c1=c1next;	
			}
			display(head2);
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+"->");
				display(head.next);
			}
		}
		
		public static void main(String [] args){
			A1111 a = new A1111();
			A1111 b = new A1111();
			a.head= new Node(1);
			a.head.next= new Node(2);
			a.head.next.next= new Node(3);
			a.head.next.next.next= new Node(4);
			a.head.next.next.next.next= new Node(5);
			a.head.next.next.next.next.next= new Node(6);
			
			a.head1= new Node(1);
			a.head1.next= new Node(2);
			a.head1.next.next= new Node(3);
			a.head1.next.next.next= new Node(4);
			a.head1.next.next.next.next= new Node(5);
			a.head1.next.next.next.next.next= new Node(6);
			
			a.work(a.head,a.head1);
		//	a.display(a.head);
			
		}
}