import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Exercise04: 
 * 
 * Given the meal price (base cost of a meal), tip percent (the percentage of 
 * the meal price being added as tip), and tax percent (the percentage of the meal 
 * price being added as tax) for a meal, find and print the meal's total cost.
 * 
 * The tip and tax of the meal are calculated by multiplying the base cost of a meal by
 * the relative tip and tax percentages. 
 * 
 * 
 */
public class Exercise04 {
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        //#TODO: Write your calculation code here.
      
        //#TODO: cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(0.00/*total cost in double*/);
      
        //#TODO: Print your result
        System.out.println("The total meal cost is " + /*Concatenate total cost here*/ " dollars.");
    }
    
}
