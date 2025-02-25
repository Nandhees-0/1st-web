package Nandhees;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		int sum=0,avg;
		int arr[] = {2,3,4,56,7,8};
		int length = arr.length;
		System.out.println("Length of array = "+length);
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(length%2==0) {
			
			System.out.println("Sum of array = "+sum);
		}
		else {
			avg=sum/length;
		System.out.println("Average of array = "+avg);
		}

	}

}
