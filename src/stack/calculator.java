package stack;

public class calculator {
	
	static String input = "14 90 +";
	static String regex = " ";
	
	public static void splitInput(String input, String regex) {
		String[] myArray = input.split(regex);
		for (String s : myArray) {
			System.out.println(s);
		}
	}
	
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splitInput(input, regex);
	}

}
