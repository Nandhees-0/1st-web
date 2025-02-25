package Nandhees;

import java.util.Scanner;

public class UpperCaseWithoutFun {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str =sc.next();
	int l = str.length();
	char c=' ';
	for(int i=0;i<l;i++) {
		c = str.charAt(i);
		if(c>='a'&& c<='z') {
			c = (char)(c-32); 
		}
		System.out.print(c);
	}
	
	}

}
