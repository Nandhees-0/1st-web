package Nandhees;

import java.util.Scanner;

public class AlterSeries {

	public static void main(String[] args) {
		 int i=0;
		 double sum = 0;
		 System.out.println("N=");
			int n =new Scanner(System.in).nextInt();
		 for(i=1;i<=n;i++) {
			 if(i%2==0)
			sum-=(1.0/i); 
			 else {
				 sum+=(1.0/i);  
			 }
		 }
		 System.out.println("The Sum Of Series of "+n+" is= "+sum);

	}

}
