package exceptions;

public class StringArrayParser {

	public static int[] parseInts(String... numbers) {
		int[] intNumbers = new int [numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			intNumbers[i] =Integer.parseInt(numbers[i]);
		}
		return intNumbers;
	}
	
	public static void main(String[] args) {
		int[] test1 = parseInts("12", "123", "534", "8930");
	}

}
