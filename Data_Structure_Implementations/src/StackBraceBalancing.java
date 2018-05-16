import java.util.Stack;

public class StackBraceBalancing {
	
	Stack<Character> characters = new Stack<Character>();
	
	boolean checkBraces(String s){
		
		for(int i=0;i<s.length();i++){
			
			if((s.charAt(i))==')' ){
				if(characters.peek()=='('){
					characters.pop();
				}
				return false;
			}
			else if((s.charAt(i))=='}' ){
				if(characters.peek()=='{'){
					characters.pop();
				}
				return false;
			}
			else if((s.charAt(i))==']' ){
				if(characters.peek()=='['){
					characters.pop();
				}
				return false;
			}
			
			else{
				characters.push(s.charAt(i));
			}
		}
		
		if(characters.isEmpty()){
			return true;
		}
		
		return false;
	}

}
