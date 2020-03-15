import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("([[{}]])"));
		System.out.println(isValid("((})"));
		System.out.println(isValid("({(([{}]))})"));

	}

	public static boolean isValid(String s) {
		// Sample Input: "(){[]}" --> true
		// Sample Input: "([})" --> false

		Stack<Character> parens = new Stack<Character>();

		for (char c : s.toCharArray()) {

			// falls öffnende Klammer
			if (c == '(' || c == '{' || c == '[') {
				parens.add(c);
			}

			else if (parens.size() > 0 && ((c == ')' && parens.peek() == '(') || (c == ']' && parens.peek() == '[')
					|| (c == '}' && parens.peek() == '{'))) {
				parens.pop();
				continue;
			}

			else {
				return false;
			}

			
		}
		
		if(parens.size() != 0) return false;
		return true;
	}

}
