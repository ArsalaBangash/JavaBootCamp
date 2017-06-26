import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * You're given a file filled with NBA players and their all time point totals. Create a
 * HashMap that maps every player to their point totals. Then, using the provided array of 
 * players, try to get their point totals using your HashMap. 
 * 
 * If the player exists in the file, such as "Jordan", then print "Jordan has 32292 points"
 * If the player doesn't exist, like Durant then print "I don't know how many points Durant has"
 */
public class Exercise12 {
     
    public static void main(String[] args) {
      //Initializes the file and scanner 
      Scanner scan = null;
      //Enter the file path for your chosen file. 
      File file = new File("ENTER FILE PATH HERE");
      try {
         scan = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         System.exit(0);
      }
      System.out.println("File found.");
      
      //#TODO: Initialize the HashMap to store each NBA player's points

      
      while(scan.hasNext()){
          //#TODO: Read the file and add to the hashmap you created earlier
      }
      
      
      String[] players = new String[]{"Kareem", "Wilt", "Kobe", "Malone", "Jordan", "Lebron", "Durant"};
      
      //#TODO: Loop through the players and print the appropriate message to the terminal
      
    }
    
}
