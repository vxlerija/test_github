package array;

public class Task2 {
	

	
	public boolean isProbablyApproaching(String[] signs) {
		if(signs.length == 0) {
			System.out.println("Array is null");
			return false;
		}
		
		for (int i = 0; i < signs.length-3; i++) {
			if (signs[i].equals(signs[i+1])&&equals(signs[i+2])&&equals(signs[i+3])) {
			}		}
		return true;
	}
}
