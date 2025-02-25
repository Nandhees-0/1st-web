package Nandhees;

import java.util.Scanner;

public class DigOfTwoD {

	public static void main(String[] args) {

				int n,m;
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the row Size :");
				n = sc.nextInt();
				Scanner sc1 =new Scanner(System.in);
				System.out.println("Enter the col Size :");
				m = sc1.nextInt();
				
			int[][] ar=new int[n][m];
			Scanner sc2 =new Scanner(System.in);
			System.out.println("Enter elements for the array :");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					ar[i][j]=sc2.nextInt();
				}
			}
			System.out.println("The elements of the array :");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(ar[i]==ar[j]) {
						
					System.out.print(ar[i][j]+" ");}
				}		
			}

			}
	}


