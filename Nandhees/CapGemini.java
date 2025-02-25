package Nandhees;

import java.util.Scanner;

public class CapGemini {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      String str = new String();
	      str = sc.nextLine();
	      char[] c1 = str.toCharArray();
	      for(int i=0;i<str.length();i++){
	    	 int count =1;
	         for(int j=i+1;j<str.length();j++){
	            if(c1[i] == c1[j]){
	            count++;
	           }
	  	     }
	         System.out.print(c1[i]);
	     System.out.print(count);
	    }
	}
}
