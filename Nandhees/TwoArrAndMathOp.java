package Nandhees;

import java.util.Scanner;

public class TwoArrAndMathOp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row size of matrix:");
		int n=sc.nextInt();
		System.out.println("Enter the col size of matrix:");
		int m=sc.nextInt();
		System.out.println("Enter the ele of 1st matrix:");
		int[][] arr= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			 arr[i][j]=sc.nextInt();
			}
		}
		int[][] arr1= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr1[i][j]=sc.nextInt();
		}
		

}
}}