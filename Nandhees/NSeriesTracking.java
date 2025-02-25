package Nandhees;

import java.util.Scanner;

public class NSeriesTracking {

	public static void main(String[] args) {
		int n;
		int track;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int[] ser = new int[n];
		int[] ser1 = new int[n];
		int m;
		System.out.println("Enter ingnored: ");
		m = sc.nextInt();
		int k;
		System.out.println("Enter tracking: ");
		k = sc.nextInt();
		System.out.println("Enter the 1st array: ");
        for(int i=0;i<m;i++) {
        	ser[i]= sc.nextInt();
        }
        System.out.println("Enter the 2nd array: ");
        for(int i=0;i<k;i++) {
        	ser1[i]= sc.nextInt();
        }int count =0;
        for(int i =0;i<m;i++) {
        	for(int j =0;j<k;j++) {
        		
        if(ser[i]==ser1[j]) {
               	count++;
        }}
                }
       
	}

}
