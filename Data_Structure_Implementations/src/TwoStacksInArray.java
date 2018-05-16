import java.util.Stack;

public class TwoStacksInArray {
	
	int size;
	int[] array;
	int top1, top2;
	
	public TwoStacksInArray(int n) {
		// TODO Auto-generated constructor stub
		
	array = new int[n];
	size = n;
	top1= -1;
	top2 = size;
	
	}
	
	public void push1(int data){
	
		if(top1<top2) {
			
			array[top1 +1]= data;
			top1++;
			
		}
		
		else {
			
			System.out.println("Stack Overflow");
			System.exit(1);//unsuccessful termination of program
		}
	}
	
	public void push2(int data){
		
		if(top1<top2) {
			
			array[top2 -1]= data;
			top1--;
			
		}
		
		else {
			
			System.out.println("Stack Overflow");
			System.exit(1);//unsuccessful termination of program
		}
	}
	
	
	public int popStack1(){
		int data;
		
		if(top1>-1){
			data = array[top1];
			top1--;
			return data;
		}
		
		System.out.println("stack empty");
		System.exit(1);
		return 0;
	}
	
	public int popStack2(){
		int data;
		
		if(top2<size){
			data = array[top2];
			top1++;
			return data;
		}
		
		System.out.println("stack empty");
		System.exit(1);
		return 0;
	}

}
