package Nandhees;

import java.util.Scanner;

public class MaxMinTwoD {

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
        int min = ar[0][0];
        int max = ar[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	if (ar[i][j] < min ) {
            		min= ar[i][j];
                  }
            	else if(ar[i][j]>max) {
            		max = ar[i][j];
            	}
            }
            
        }
        System.out.println("The Min: "+min );
        System.out.println("The Max: "+max );
        sc.close();
    }

	}


