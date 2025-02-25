package Nandhees;

import java.util.Scanner;

public class MinMaxWithTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return; 
        }int[] ar = new int[n];
      
        for (int i = 0; i < n; i++) {
           
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println(ar[0]+  " " + ar[n - 1]);
        sc.close();
    }
}