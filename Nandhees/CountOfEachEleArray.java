package Nandhees;

import java.util.Scanner;

public class CountOfEachEleArray {

	public static void main(String[] args) {
		int n,sum;
		int arr[]= {1,4,45,6,10,-8};
		n= arr.length;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the sum value: " );
		sum =sc2.nextInt();
		int c=0,c1=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==sum) {
					c++;
				}
			}
		c1+=c;
		}
		System.out.println(c1*2);
		}

}
