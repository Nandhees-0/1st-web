package Nandhees;

import java.util.Scanner;

public class CESStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine().toLowerCase();
        sc.close();
        int l =str.length();
        int c=0,c1=0,c2=0;
        for(int i=0;i<l;i++) {
        	for(int j=i+1;j<l;j++) {
        		for(int k=j+1;k<l;k++) {
        			 if(str.charAt(i)=='c') {
        				 c++;
        				 if(str.charAt(j)=='e') {
        					 c1++;
        					 if(str.charAt(k)=='s') {
        						 c2++;
        					 }
        				 }
        		       }
        	    	 }
                  }
	           }
        if(c>=1&&c1>=1&&c2>=1) {
        
				 System.out.println("Yes");
		}
        else {
        	 System.out.println("No");
        }
   }
}
