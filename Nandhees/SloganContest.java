package Nandhees;

import java.util.Scanner;

public class SloganContest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine().toLowerCase();
		sc.close();
		int l = str.length();
		if(l%2==0) {
			int ct=0;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					ct++;
				}
			}
		}
		if(ct==(l-ct)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
 }

}
