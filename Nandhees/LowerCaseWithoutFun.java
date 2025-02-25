package Nandhees;

import java.util.Scanner;

public class LowerCaseWithoutFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        int l = str.length();
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < l; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') { 
                c = (char) (c + 32); 
            }
            result.append(c); 
        }
        System.out.println(result.toString());
    }
}