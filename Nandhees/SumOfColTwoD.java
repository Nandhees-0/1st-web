package Nandhees;

import java.util.Scanner;
public class SumOfColTwoD {
	public static void main(String[] args) {
		        int n, m;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the row size:");
		        n = sc.nextInt();
		        System.out.println("Enter the column size:");
		        m = sc.nextInt();
		        int[][] ar = new int[n][m];
		        System.out.println("Enter elements for the array:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                ar[i][j] = sc.nextInt();
		            }
		        }
		        System.out.println("The elements of the array:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                System.out.print(ar[i][j] + " ");
		            }
		            System.out.println();
		        }
		        for (int i = 0; i < n; i++) {
		            int sum = 0;
		            for (int j = 0; j < m; j++) {
		                sum += ar[j][i]; 
		            }
		            System.out.println("Sum of col " + i + " = " + sum);
		        }
		        sc.close();
		    }
		

	}


