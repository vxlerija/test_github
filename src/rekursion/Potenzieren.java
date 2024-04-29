package rekursion;

public class Potenzieren {

	public static int calculatePotenz (int b, int e) {
		if (e == 0) {
			return 1;
		}else {
			return b*calculatePotenz(b,e-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePotenz(2,2));

	}

}
