package Nandhees;
import java.util.Scanner;
public class OpDigTwoD {
	public static void main(String[] args) {
		int n,m;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row Size :");
		n = sc.nextInt();
		System.out.println("Enter the col Size :");
		m = sc.nextInt();
		if(n==m) {
	int[][] ar=new int[n][m];
	System.out.println("Enter elements for the array :");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			ar[i][j]=sc.nextInt();
		}
	}
	System.out.println("The elements of the array :");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              System.out.print(ar[i][j] + " ");
          }
          System.out.println();
      }
      System.out.println("The Anti-Diagonal ele of the array :");
	for(int i=0;i<n;i++) {
		 System.out.print(ar[i][ar.length - 1 - i] + " ");	
	}
		}
		else {
			System.out.println("The array is invalid");
		}
	}
}