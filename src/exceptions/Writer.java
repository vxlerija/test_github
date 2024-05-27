package exceptions;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.File;
import java.io.FileNotFoundException;


public class Writer {

  public static void main(String[] args) {
	  try (PrintWriter writer = new PrintWriter("file.txt")) {
		  writer.print(LocalDateTime.now());
	  } catch (FileNotFoundException e) {
		  System.out.println("Datei wurde nicht gefunden");
	  }
  }
}
