package rekursion;

public class Bionomialkoeffizient {

	public static int calculateKoeficient (int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}else {
			return (calculateKoeficient(n-1,k-1)) + (calculateKoeficient(n-1,k));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculateKoeficient(4,2));

	}

}
