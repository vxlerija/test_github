package exceptions;
 
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
 
public class MusicReader {
 
	public static void main(String[] args) {
		String filePath = "file.txt";
		try {
			Scanner scr = new Scanner(Paths.get(filePath));
			while (scr.hasNextLine()) {
			}
		}catch (IOException e) {
			System.out.println("c, d, e");
		}

	}
}