package Nandhees;

import java.util.Scanner;

public class LucyFavSeq {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[] seq=new int[n];
for(int i=0;i<n;i++) {
	seq[i]=sc.nextInt();
	}
int f= sc.nextInt();
int[] fav=new int[f];
for(int i=0;i<f;i++) {
	fav[i]=sc.nextInt();
	}
for(int i=0;i<n;i++) {
	for(int j=i+1;i<f;j++) {
			if(seq[i]==fav[j]) {
			
					}
	}
}
	}

}
