package Nandhees;

import java.util.Scanner;

public class StrYesOrNo {
	public static void main(String[] args) {
	    int count =0,count1=0;
	     Scanner sc = new Scanner(System.in);   
	     System.out.println("Enter the numer =");
	     String str = sc.next();
	     int n= str.length();
	     char[] ar =str.toCharArray();
	     
	      for(int i=0;i<n;i++){
	     if(ar[i] == '0'){
	     count++;
	     }
	     else if(ar[i] == '1'){
	     count1++;
	     }
	      } 
          if(count!=count1) {
	      if(count>=1){
	     System.out.println("Yes");
	      }
	      else{
	     System.out.println("No");

	      }
	     }
          else {
        	  System.out.println("No");
          }

	}

}
