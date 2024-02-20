package array;

public class Task1 {

	
		public static int count5PercentJumps(int[] gains) {
			int numberOfJumps = 0;
			if(gains.length == 0) {
				System.out.println("Array is null");
				return 0;
			}
			
			for (int i = 0; i < gains.length-1; i++) {
				if (gains[i] == gains[i+1] * 1.05) {
				numberOfJumps ++;
				}
			}
		return numberOfJumps;
	
	}
}


































