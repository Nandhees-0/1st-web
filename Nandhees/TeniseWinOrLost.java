package Nandhees;

import java.util.Scanner;

public class TeniseWinOrLost {

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
	 System.out.println(count);
	 System.out.println(count1);

	      if(count<count1){
	     System.out.println("WON");
	      }
	      else{
	     System.out.println("loss");

	      }

	}

}
