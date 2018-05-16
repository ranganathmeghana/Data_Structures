import java.util.HashMap;



public class LinkedListRemoveDuplicate {

	//To reverse a linkedlist, 
	//make the current node prvious
	//make the next node current
	//make current node's next previous
	
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
	
	 Node removeDuplicates(Node head)
	    {
		 Node node1= head;
		 
		 HashMap<Integer,Node> hashMap = new HashMap<Integer, Node>();
		
		 Node node2= new Node();
		 
		 while(node1.next!=null){
			  if(node1.next.value == node1.value){
				  node1.next = node1.next.next;
				  node1.next.next=null;
			  }
			 
			 node1=node1.next;	 
		 }
		 return node1;
		 
	    }
}
