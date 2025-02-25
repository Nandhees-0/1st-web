package Nandhees;

import java.util.Scanner;

public class TraceOfMat {

	public static void main(String[] args) {
		int n,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row size");
		n=sc.nextInt();
		System.out.println("Enter the col size");
		m=sc.nextInt();
		if(n==m) {
			int[][] ar= new int[n][m];
			System.out.println("Enter the ele ");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					ar[i][j]=sc.nextInt();
				}
			}	
		int sum =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==j) {
		          sum+= ar[i][j];
				}
			}
		}
		System.out.println("The Trace of matrix is: "+sum);}
		else {
			System.out.println("Enter a valid matrix...");
		}

	}

}
