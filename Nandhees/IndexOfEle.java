package Nandhees;

import java.util.Scanner;

public class IndexOfEle {

	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		m = sc.nextInt();
        int[][] ar=new int[m][m];
        System.out.println("Enter elements of matrix: ");
        for(int  i=0;i<m;i++) {
        	for(int j=0;j<m;j++) {
        		ar[i][j]=sc.nextInt();
        	}
        }
        int s;
        System.out.println("Enter the element to search: ");
		s = sc.nextInt();
		int a = 0,b=0;
		 for(int  i=0;i<m;i++) {
	        	for(int j=0;j<m;j++) {
	        		if(ar[i][j]==s) {
	        			a=i;
	        			b=j;
	        		}
	        	}
	        }
		 System.out.println("The index of "+s+" is "+a+" "+b);
	}

}
