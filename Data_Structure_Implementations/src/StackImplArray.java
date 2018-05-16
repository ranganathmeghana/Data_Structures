
public class StackImplArray {
	int Max= 1000;
	int[] stack =new int[Max];
	
	//in dynamic array stack implementation, double the size of array when full and reduce it to half when capacity is less than half.
	
	
	
	static int top =-1;
	
	public boolean isEmpty(){
		if(top<0){
			return true;
		}
		
		return false;
	}

	boolean push(int data){
		
		if(top> Max -1){
			
			return false;
		}
		
		stack[top+1] = data;
		top++;
		return true;
	}
	
	int pop(){
		
		if(top<0){
			return 0;
		}
		
		int pop=  stack[top];
		top--;
		return pop;
	}
	
	int top(){
		
		if(top<0){
			return 0;
		}
		
		int pop=  stack[top];
		System.out.println("the top item is" +pop);
		return pop;
	}
	
	public static void main(String[] args) {
		
		 StackImplArray s = new StackImplArray();
	        s.push(10);
	        s.top();
	        s.push(20);
	        s.top();
	        s.push(30);
	        s.top();
	        System.out.println(s.pop() + " Popped from stack");
	}
}
