package stack;

import java.util.LinkedList;

public class words {

	public static String reverseString(String input) {
		LinkedList<Character> stack = new LinkedList<Character>();
		char[] reversedList = new char[input.length()];
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder reversedString = new StringBuilder();
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		return reversedString.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Valerija"));
	}
}


