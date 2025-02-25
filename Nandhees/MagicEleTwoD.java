package Nandhees;
import java.util.Scanner;
public class MagicEleTwoD {
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
        } int[] sum= new int[n];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
                sum[i] += ar[i][j]; 
            }              
        }
        	if(sum[0]==sum[1]&&sum[0]==sum[2]) {
        		System.out.println("The array is magic");        
        }
        sc.close();
	}
}
