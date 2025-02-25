package Nandhees;

import java.util.Scanner;

public class SwitchCase {
	public int a,b,num;
	  public static void main(String[] args) {
		  System.out.println("A=");
		  Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			System.out.println("B=");
			int b =sc.nextInt();
			System.out.println("Enter Case Num");
			int num =sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Add= "+(a+b));
				break;
			case 2:
				System.out.println("Sub= "+(a-b));
				break;
			case 3:
				System.out.println("Mul= "+(a*b));
				break;
			case 4:
				System.out.println("Div= "+(a/b));
				break;
			}
	  }

}
