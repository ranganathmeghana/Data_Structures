import java.util.Stack;

public class StackMinimum {

	public void minimum(int[] data){
		
		Stack<Integer> mainstack = new Stack<Integer>();	
		Stack<Integer> minstack = new Stack<Integer>();
		
		for(int i=0;i<data.length; i++){
			
			mainstack.push(data[i]);
			
			if(minstack.isEmpty()||minstack.peek()>data[i]){
				minstack.push(data[i]);
			}
			
			else{
				minstack.push(minstack.peek());
			}
		}
	}
}
