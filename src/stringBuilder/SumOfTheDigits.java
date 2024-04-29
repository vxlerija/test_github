package stringBuilder;

public class SumOfTheDigits {

 
	    public static int digitSum(long value) {
	        int sum = 0;
	        while (value != 0) {
	            sum += value % 10; 
	            value /= 10; 
	        }
	        return sum;
	    }
 
	    public static int digitSum(String value) {
	        int sum = 0;
	        for (int i = 0; i < value.length(); i++) {
	            char digitChar = value.charAt(i);
	            if (Character.isDigit(digitChar)) {
	                sum += Character.getNumericValue(digitChar); 
	            }
	        }
	        return sum;
	    }
 
	    public static void main(String[] args) {
	        long number = 10938;
	        String stringNumber = "10938";
	        System.out.println("Quersumme von " + number + ": " + digitSum(number));
	        System.out.println("Quersumme von \"" + stringNumber + "\": " + digitSum(stringNumber));
	    }
	}
 