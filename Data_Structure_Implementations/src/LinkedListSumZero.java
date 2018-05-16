
public class LinkedListSumZero {
	
	static Node head;
	int listCount;
	
	class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.value=value;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public int addNode(int data){
		
		Node node1 = new Node();
		
		node1 = head;
		
		Node node2 =new Node(data);
		
		if(node1 == null){
			
			head = node2;
		}
		else{
			
			while(node1.next!=null)
				node1 = node1.next;
			
			node1.next = node2;
				
		}
		
		listCount ++;
		
		
	//	System.out.println(listCount);
		return listCount;
		
	}
	
	Node removeRedundantNodes(Node head)
	{
		if (head == null || head.next == null)
			return head;

		Node start = head;
		Node end = head; // or Node end = start;
		int sum = 0;

		while (start != null && end != null)
		{
			sum += end.value;
			if (sum == 0)
			{
				// found a redundant sub-sequence!
				start = end.next;
				end = start;
			}
			else
			{
				end = end.next;
			}
		}

	
		
		System.out.println(start.value);
		return start;
	}
	
	
	 Node reverse(Node head, int k){
		 
		 Node current = head;
		 int i=0;
		 Node next=null;
		 Node prev=null;
		
		 while(current.next!=null && i<k){
			 next = current.next;
			 current.next = prev;
			 prev=current;
			 current=next;
			 i++;
		 }
		 
		 while(next!=null){
			 head.next=reverse(next, k);
		 }
		 
		 return prev;
	 }
	
	public static void main(String[] args) {
		
		LinkedListSumZero object =new LinkedListSumZero();
		
		object.addNode(6);
		object.addNode(-6);
		object.addNode(8);
		object.addNode(4);
		object.addNode(-12);
		object.addNode(9);
		object.addNode(11);
		object.addNode(12);
		object.addNode(8);
		object.addNode(-8);
		
		object.removeRedundantNodes(head);
		
	
	}

}
