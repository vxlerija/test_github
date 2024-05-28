package exceptions;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class MusicReader {
	
	
	private static final Pattern notes = Pattern.compile("C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'");
	    

	    
	        
	    
	
 
	public static void main(String[] args) {
		System.out.println("M:C");
		System.out.println("L:1/4");
		System.out.println("K:C");
		String output = "";
		String filePath = "file.txt";
		try {
			Scanner scr = new Scanner(Paths.get(filePath));
			while (scr.hasNextLine()) {
				String temp = scr.nextLine();
				if (notes.matcher(temp).matches()) {
					System.out.print(temp + " ");
					output = output + temp + " ";
				}
			}
		}catch (IOException e) {
			System.out.println("c, d, e");
		}
		try (PrintWriter writer = new PrintWriter(new File("noteOuput.txt"), "UTF-8")) {
			writer.println("M:C");
			writer.println("L:1/4");
			writer.println("K:C");
			writer.print(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}