import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * In this exercise, you will be given a class that you have to write according to 
 * the following specifications:
 *  1. A person has an attribute called age, and a person is initialized with it's age.
 *  2. The age has to be positive, and if a Person with a negative age is initialized, 
 *  then print "Age is not valid, setting age to 0." to the console and set the age to 0
 *  3. The yearPasses method for the person adds 1 to the person's age. 
 *  4. The amIOld method should print a message out to the console depending on the 
 *  person's age:
 *          If Person is younger than 13, print "You are young"
 *          If Person is older than 13 but younger than 18, print "You are a teenager"
 *          If Person is 18 or older, print "You are old" 
 *  Do not modify the code in the main function. It will be used to test correctness. 
 */
public class Exercise09 {
     
    public static void main(String[] args) {
        Person p1 = new Person(4);
        Person p2 = new Person(-1);
        Person p3 = new Person(18);
        Person p4 = new Person(17);
        p1.amIOld();
        p2.amIOld();
        p3.amIOld();
        p4.amIOld();
        p4.yearPasses();
        p4.amIOld();

    }
    
}

class Person {
    private int age;    
  
    public Person(int initialAge) {
        //Initialize the age 
    }

    public void amIOld() {
        String ageMessage = "";
        //Modify the ageMessage based on the current age
        System.out.println(ageMessage);
    }

    public void yearPasses() {
        //Make the person 1 year older
    }
}
