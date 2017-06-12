import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Write a program to print out the contents of a txt file to the terminal. The path of the 
 * file will need to be specified. 
 */
public class Exercise07 {
     
    public static void main(String[] args) {
      //Initializes the file and scanner 
      Scanner scan = null;
      //Enter the file path for your chosen file. 
      File file = new File("Enter File Path here");
      try {
         scan = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         System.exit(0);
      }
      System.out.println("File found.");
      
      //Read the contents of the file one line at a time and print the contents of 
      //each line to the terminal 
      
      //close the scanner
      scan.close();
    }
    
}
