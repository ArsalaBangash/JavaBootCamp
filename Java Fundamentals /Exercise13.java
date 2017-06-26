import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Write the body of the decrypt function that takes in the encrypted string and outputs the decrypted message. 
 */
public class Exercise13 {
     
    public static void main(String[] args) {
        String encryptedMessage = "D$d y%& h@!r !b%&t th@ g&y th!t $nv@nt@d th@ 'Kn%ck Kn%ck' j%k@?" +
        " H@ w%n th@ NO-BELL pr$z@";
        System.out.println(decrypt(encryptedMessage));
    }
    
    static String decrypt(String encryptedMessage) {
        HashMap<String, String> decryptMap= new HashMap<String, String>();
        String decryptedMessage = "";
        
        //#TODO: Populate the decrptMap with the correct vowel replacements

        for (int i = 0; i < encryptedMessage.length(); i++) {
           //#TODO: Add to the decryptedMessage and replace all special characters with vowels
        }
        return decryptedMessage;
    }
    
}
