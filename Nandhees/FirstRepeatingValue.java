package Nandhees;
import java.util.Scanner;
public class FirstRepeatingValue {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] ar = new int[5];
		        System.out.println("Enter 5 elements for the array:");
		        for (int i = 0; i < ar.length; i++) {
		            System.out.print("Element for index " + (i + 1) + ": ");
		            ar[i] = sc.nextInt();
		        }
		        int[] sqr= new int[ar.length];
		        for (int a = 0; a < ar.length; a++) {
		         int sqrr =(ar[a]*ar[a]);
		         sqr[a]= sqrr;
		        }
		        
		        for (int i = 0; i < ar.length ; i++) {
		        	for(int j=i+1;j<ar.length;j++) {
		        		for(int k=0;k<ar.length;k++) {
		            if (sqr[i]!=sqr[j]) {
		            	if(sqr[i]+sqr[j]==sqr[k]) {
		           	System.out.println("The triplet is: " + ar[i] + ", " + ar[j]+ ", " +ar[k]);
			        System.out.println("Their squares are: " +sqr[i] + ", " + sqr[j] + ", " + sqr[k]);
		            	}
		            }   
		                }
		        		
		            }
		        }
		        sc.close();
		        }
		        
		    }
	
