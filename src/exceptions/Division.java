package exceptions;

public class Division {
	
	public static int divide(int x, int y) {
		int i = null;
		try{
			return x/y;
		}catch (ArithmeticException e) {
			System.err.println("division with 0 not possible");
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		System.out.println(divide(6,0));
	}

}
