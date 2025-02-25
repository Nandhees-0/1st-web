package Nandhees;
import java.util.Scanner;
public class UndercoverOp {
	public static void main(String[] args) {
        String input = "aabcdb";    
        char result = findFirstNonRepeating(input);
        System.out.println("First non-repeating character: " + result);
    }
   public static char findFirstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return currentChar;
            }
        }
        return '-';
    }
}