package Strings;

import java.util.HashMap;
import java.util.Stack;

public class validParentheses {

	public static boolean isValidParentheses(String str) {

		HashMap<Character, Character> map = new HashMap<>();
		Stack<Character> stack = new Stack<>();

		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				char topElement = stack.isEmpty() ? '#' : stack.pop();
				if (topElement != map.get(c))
				return false;
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();

	}
	
	public static void main (String [] args) {
		String str = "{}[])";
		System.out.println(isValidParentheses(str));
	}

}
