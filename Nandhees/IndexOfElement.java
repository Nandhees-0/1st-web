package Nandhees;
import java.util.Scanner;
public class IndexOfElement {

	public static void main(String[] args) {
		        int[] num = {10, 20, 30, 40, 50};
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the element to find: ");
		        int target = sc.nextInt();
		        int index = findIndex(num, target);

		       
		        if (index != -1) {
		            System.out.println("Element found at index: " + index);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }
		    public static int findIndex(int[] array, int target) {
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == target) {
		                return i;
		            }
		        }
		        return -1; 
		    }
	}

