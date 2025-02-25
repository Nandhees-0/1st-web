package Nandhees;

import java.util.Scanner;

public class SpecificValueInArray {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,4,3,2};
		int spvalue;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the spcific value to check in array = ");
		spvalue =sc.nextInt();
int len =  arr.length;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==spvalue) {
		System.out.println("The Specfic value is "+spvalue+ " in the array "+arr[i]);
	}
	}
	

	}

}
