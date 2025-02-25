package Nandhees;

import java.util.Scanner;

public class StrRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = new String();
		str=sc.nextLine();
		int l= str.length();
		char[] r = str.toCharArray();
		for(int i=l-1;i>=0;i--) {
			System.out.print(r[i]);
		}
		
	}

}
