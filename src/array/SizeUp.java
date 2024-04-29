package array;

public class SizeUp {
	
	int ze;
	int sp;
	int [][] array = new int[ze][sp];
	
	public static int[][] magnify(int[][] array, int factor) {
	if (factor < 0)	{
		System.out.println("can't magnify");
	}else  ze = array.length* factor;
		 sp = array[0].length * factor;
	}
}

