import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Write a program that takes in the amount of integers the program should read (n). After 
 * reading the n integers using a while loop, print the sum of the integers out to 
 * the terminal. 
 */
public class Exercise06 {
     
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      System.out.print("How many integers should be read?: ");
      int n = scan.nextInt();
      System.out.println(n + " integers will be read");
      
      //#TODO: use a while loop to read n integers and find their sum
      
      scan.close();
      //#TODO: Print out the sum of all read integers
      System.out.println("The sum of all entered integers is ");

        
    }
    
}
