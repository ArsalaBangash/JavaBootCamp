import java.io.*;
import java.util.*;
/**
 * Exercise 01: The following program should take in user input and print it out the 
 * terminal after the line "Hello World", which has already been printed out for you.  
 */
public class Exercise01 {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}