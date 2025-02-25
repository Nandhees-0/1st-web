package Nandhees;

import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {
		 System.out.println("N=");
			int n =new Scanner(System.in).nextInt();
			for(int i=0;i<=n;i++) {
			int cube=(i*i*i);
			System.out.println("The Cube Of "+i+ " is= "+cube);
		}}


}
