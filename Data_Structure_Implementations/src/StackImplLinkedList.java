
public class StackImplLinkedList {
	
	Node head;
	int stackLenth;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			
			this.data=data;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	boolean stackisEmpty(){
		
		if (head==null){
			return true;
		} return false;
	}
	
	boolean push(int data){
		
		
		Node newnode=new Node(data);
		
		Node newnode2= head;
		
		while(newnode2.next!=null)
			newnode2 =newnode2.next;
		
		newnode2.next =newnode;
		stackLenth++;
		return true;
	}
	
	Node pop(){
	Node newnode=new Node();
		
		Node newnode2= head;
		
		Node prev = new Node();
		
		while(newnode2.next!=null){
			prev = newnode2;
			newnode2 =newnode2.next;
		}
		newnode= newnode2;
		prev.next = null;
		
		return newnode;
		
		
	}
}
