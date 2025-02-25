package Nandhees;

import java.util.Scanner;

public class SumOfFourEleIsEqlToNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of matrix:");
		int n=sc.nextInt();
		System.out.println("Enter the value:");
		int val=sc.nextInt();
		System.out.println("Enter the size of matrix:");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("The ele of "+i+" is "+arr[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					for(int l=k+1;l<n;l++) {
						if(arr[i]+arr[j]+arr[k]+arr[l]==val) {
							System.out.println("The combination of 4 ele is"+arr[i]+"+"+arr[j]+"+"+arr[k]+"+"+arr[l]+"="+val);
						}
					}
				}
			}
		}
	}

}
