
public class DeQueueUsingArray {
	
	int[] arr;
	int front;
	int rear;
	int size;
	
	public DeQueueUsingArray(int cap) {
		// TODO Auto-generated constructor stub
		
		arr=new int[cap];
		front=-1;
		rear=-1;
		size=0;
	}

	
	public boolean isEmpty() {
		
		if(front==-1 && rear==-1){
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(front==0 && rear==size-1){
			return true;
		}
		return false;
	}

public void enFront(int data){
	  if (front == -1)
      {
          front = 0;
          rear = 0;
      }
       
      // front is at first position of queue
      else if (front == 0)
          front = size - 1 ;

      else // decrement front end by '1'
          front = front-1;

      // insert current element into Deque
      arr[front] = data ;
	}

public void enRear(int data){

	  if (front == -1)
      {
          front = 0;
          rear = 0;
      }
	  
	  else if (rear == size-1)
          rear = 0;

      // increment rear end by '1'
      else
          rear = rear+1;
       
      // insert current element into Deque
      arr[rear] = data ;
}

void deletefront()
{
    // check whether Deque is empty or not
    if (isEmpty())
    {
        System.out.println("Queue Underflow\n");
        return ;
    }

    // Deque has only one element
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else
        // back to initial position
        if (front == size -1)
            front = 0;

        else // increment front by '1' to remove current
            // front value from Deque
            front = front+1;
}

// Delete element at rear end of Deque
void deleterear()
{
    if (isEmpty())
    {
        System.out.println(" Underflow");
        return ;
    }

    // Deque has only one element
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else if (rear == 0)
        rear = size-1;
    else
        rear = rear-1;
}

	
}
