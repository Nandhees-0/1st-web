package Nandhees;

import java.util.Scanner;

public class SumAndAvg {
	public int a,b,c,d,e,sum,avg;
	public static void main(String[] args) {
		System.out.println("A=");
		int a =new Scanner(System.in).nextInt();
		System.out.println("B=");
		int b =new Scanner(System.in).nextInt();
		System.out.println("C=");
		int c =new Scanner(System.in).nextInt();
		System.out.println("D=");
		int d =new Scanner(System.in).nextInt();
		System.out.println("E=");
		int e =new Scanner(System.in).nextInt();
		int sum=a+b+c+d+e;
		int avg=(sum/5);
		System.out.println("The Sum is= "+sum);
		System.out.println("The Avg is= "+avg);
	}

}
