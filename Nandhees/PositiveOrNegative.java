package Nandhees;

import java.util.Scanner;

public class PositiveOrNegative {
	public int a;
	public static void main(String[] args) {
		System.out.println("A=");
		int a =new Scanner(System.in).nextInt();
		if(a>=1) {
			System.out.println("It is +ve");
		}
		else if (a<=-1) {
			System.out.println("It is -ve");
		}
		else{
			System.out.println("It is Zero");
		}
		
	}

}
