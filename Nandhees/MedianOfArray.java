package Nandhees;

import java.util.Scanner;

public class MedianOfArray {

	public static void main(String[] args) {
		System.out.println("Enter the Size of the Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar2 = new int[n];
		System.out.println("Enter the Elements for Array : ");
		Scanner sc2 = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			ar2[i]= sc2.nextInt();
		}
		if(n%2==1) {
			int mean = ar2[n/2];
			System.out.println("The median is : " +mean);
		}
		else {
			int m1 =ar2[n/2-1];
			int m2 = ar2[n/2];
			int emean =(m1 +m2)/2;
			System.out.println("The median is : " +emean);
		}
		sc.close();
		sc2.close();
	}

}
