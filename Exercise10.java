import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Write a program that first reads n, the size of the array we want to create. Then proceed to read n integers 
 * from the console into the array and then print out all the integers from the array on seperate lines. 
 */
public class Exercise10 {
     
    public static void main(String[] args) {
        //Initializes the scanner and reads the amount of elements to be read into the array
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //TODO: Create an array of integers of size n 
        for(int i=0; i < n; i++){
            //TODO: Read n integers from the console into the array
        }
        //TODO: Loop through the array and print out all the elements in the array 
        scan.close();
    }
    
}
