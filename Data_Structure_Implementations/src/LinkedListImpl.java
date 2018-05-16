
import java.util.LinkedList;

public class LinkedListImpl {
	
//	public static void main(String[] args) {
//		
//		LinkedList<Integer> linkedList=new LinkedList<Integer>();
//		linkedList.add(1);
//		linkedList.add(2);
//		linkedList.add(3);
//		linkedList.add(4);
//		linkedList.add(5);
//		linkedList.add(6);
//		linkedList.add(7);
//		linkedList.add(8);
//		
//		System.out.println(linkedList);
//		System.out.println(linkedList.size());
//		linkedList.set(2, 20);
//		System.out.println(linkedList);
//		
//	}
	
	Node head;
	
	class Node{
		
		private int data;
		private Node next;
		
		Node(int data) {
			// TODO Auto-generated constructor stub
			
			this.data=data;
			this.next = null;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public void insertNodeAtFirst(int data){
		
			Node newNode= new Node(data);
			
			newNode.next = head.next;
			head = newNode;
		
	}
	
	
	public void inserAfterANode(Node prevNode, int data){
		
		Node temp=new Node();
		
		temp = head; 
		
		while(temp.next!=prevNode.next)
			temp=temp.next;
		
		Node newNode =new Node(data);
		
		newNode.next = temp.next;
		temp.next =newNode;
		
		
	}
	
	public void insertNodeAtEnd(int data)
	{
		
		Node temp=new Node();
		
		temp = head;
		
		while(temp.next!=null)
			temp = temp.next;
		Node newNode =new Node(data);
		newNode.next=null;
		
		temp.next=newNode;
		
		
	}

	public void printLinkedList()
	{
		Node temp=new Node();
		
		temp = head;
		
		while(temp.next!=null){
			
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public void returnMiddleNode(){
		
		//two pinters starting from head. One increments by 1 and other by 2. when second reaches end, first reaches half.
		
		Node neNode1 = head;
		Node node2 = head;
		if(head!=null){
		
		while( head.next!=null && neNode1.next!=null)
		{
			neNode1 = neNode1.next.next;
			node2 = node2.next;
		}
			System.out.println( node2.data);
			
		}
	}
	
	
}


