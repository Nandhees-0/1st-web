package Nandhees;

import java.util.Scanner;

public class DupIntArray {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size: ");
        n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the integers: ");
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int count;
        for (int i = 0; i < n; i++) {
             count = 1;
             boolean ac = false;
             for (int k = 0; k < i; k++) {
                 if (arr[k] == arr[i]) {
                     ac = true;
                     break;
                 }
             }
                if (!ac) {
                 for (int j = i + 1; j < n; j++) {
                     if (arr[i] == arr[j]) {
                         count++;
                     }
                 }
                  if (count > 1) {
                     System.out.println(arr[i] + " occurs " + count + " times.");
                 }}}
	}

}
