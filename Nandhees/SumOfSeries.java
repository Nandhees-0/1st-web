package Nandhees;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		 int i=0;
		 double sum = 0;
		 System.out.println("N=");
			int n =new Scanner(System.in).nextInt();
		 for(i=1;i<=n;i++) {
			sum+=(1.0/i); 
		 }
		 System.out.println("The Sum Of Series of "+n+" is= "+sum);
		}

}
