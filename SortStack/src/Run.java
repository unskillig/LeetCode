import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.add(23);
		stack.add(11);
		stack.add(34);
		stack.add(45);
		stack.add(31);
		stack.add(22);
		
		System.out.println("Unsortierter Stack");
		printStack(stack);
		
		System.out.println("Sortierter Stack");
		System.out.println(sortStack(stack));
		

	}
	
	
	
	public static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();
		tempStack.push(stack.pop());
		
		while(!stack.isEmpty()){
			
			if(stack.peek() > tempStack.peek()){
				tempStack.push(stack.pop());
			}
			
			else{
				int temp = stack.pop();
								
				while(!tempStack.empty() && temp < tempStack.peek()){
					stack.push(tempStack.pop());
				}
				

				tempStack.push(temp);
			}
			
			System.out.println("Stack");
			printStack(stack);
			
			System.out.println();
			
			System.out.println("TempStack");
			printStack(tempStack);
		}
		
		
		
		
		
		return tempStack;
		
	}



	public static void printStack(Stack<Integer> stack){
		for(int i = 0; i < stack.size(); i++){
			System.out.println(stack.get(i));
		}
	}

}
