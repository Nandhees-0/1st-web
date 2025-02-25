package Nandhees;

import java.util.Scanner;

public class IplMatch {

	public static void main(String[] args) {
		int count = 0 ,count1=0, total;
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next();
        char[] c1 = str.toCharArray();
        for(int i=0; i<str.length();i+=2){
       if(c1[0] == c1[i]){
       count++;
       }
        }
        for(int i=1 ; i<str.length();i+=2){
       if(c1[1] == c1[i]){
       count1++;
       }
        }
        total = count + count1 ;
        if(total == str.length()){
       System.out.println("Yes");
        }
        else{
       System.out.println("No");
        }

	}

}
