package Nandhees;

import java.util.Scanner;

public class EqualOrNot {
	public int a,b,c;
	public static void main(String[] args) {
		System.out.println("A=");
		int a =new Scanner(System.in).nextInt();
		System.out.println("B=");
		int b =new Scanner(System.in).nextInt();
		System.out.println("C=");
		int c =new Scanner(System.in).nextInt();
		if((a==b)&&(b==c)&&(c==a)) {
			System.out.println("All Nums Are Equal");
			
		}
		else if((a==b)||(b==c)||(c==a)) {
			System.out.println("One Num is Equal");
		}
		else {
			System.out.println("All Nums Are Not Equal");
		}
	}

}
