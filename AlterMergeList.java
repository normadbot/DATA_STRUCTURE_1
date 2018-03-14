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
public class AlterMergeList{
	   Node head,head1,head2;
		public AlterMergeList(){
			this.head=null;
		}
		void addNode(int data){
			Node newNode = new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			Node current = head;
			while(current!=null){
				if(current.next==null){
					current.next=newNode;
					return;
				}
				current=current.next;
			}	
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
		}
		Node add(Node c1,Node c2){
			Node t=c1.next;
			c1.next=c2;
			c2.next=t;	
			return c2;
		}
		Node deletefrmList2(){
			if(head2!=null){
			head2=head2.next;
				return head2;
			}else{
				head2=null;
				return head2;
			}
		}
		void mergeList(Node head1,Node head2){
			Node c1=head1,c2=head2,C1=null;
				while(c1!=null ){
				if(c2!=null&&c1!=null){				
					Node del=c2;
					Node C2=deletefrmList2();
					C1=add(c1,del);				
					c2=C2;
					c1=C1.next;
				}
				if(c1!=null && c2==null){
					c1=c1.next;
				}
			}
		}
		public static void main(String [] args){
			AlterMergeList al = new AlterMergeList();
			al.addNode(1);
			al.addNode(2);
			al.addNode(3);
			al.addNode(4);
			al.addNode(5);
			al.addNode(6);
			al.addNode(7);
			al.head1=al.head;
			al.head=null;
			al.addNode(10);
			al.addNode(20);
			al.addNode(30);
			al.addNode(40);
			al.addNode(50);
			al.addNode(60);
			al.addNode(70);
			al.addNode(80);
			al.addNode(90);
			al.head2=al.head;
			al.head=null;
			al.display(al.head1);
			System.out.println();
			al.display(al.head2);
			System.out.println();
			al.mergeList(al.head1,al.head2);
			System.out.println();
			al.display(al.head1);
			System.out.println();
			al.display(al.head2);
		}
}	
