package Nandhees;

import java.util.Scanner;

public class WBCombinations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 =sc.next().toUpperCase();
		String str2 =sc.next().toUpperCase();
		String res;
		int l=str1.length();
		int m=str2.length();
		if(l==m) {
		char[] ar1 =str1.toCharArray();
		char[] ar2 =str2.toCharArray();
		 int count=0;
		   for(int i=0;i<l;i++){
			  
		     if(ar1[i] == 'W'&& ar2[i]=='W'){
		     System.out.print("B");
		     }
		     else if(ar1[i] == 'B'&&ar2[i]=='B'){
		    	 System.out.print("W");
		     }
		     else if(ar1[i]=='W'&&ar2[i]=='B') {
		    	 System.out.print("W");
		     }
		     else if(ar1[i]=='B'&&ar2[i]=='W') {
		    	 count++;
		    	 if(count%2==0) {
		    	 System.out.print("W");
		    	 }
		    	 else {
		    		 System.out.print("B");
		    	 }
	
		          }
		      }  
		}
		else {
			System.out.println("Invalid Input...");
		}
	}

}
