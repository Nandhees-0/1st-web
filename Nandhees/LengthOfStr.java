package Nandhees;

public class LengthOfStr {

	public static void main(String[] args) {
		String str1 = "nandhees";
		String str2 = "NANHEES";
		String s1=str1.toLowerCase();
		String s2=str2.toLowerCase();
		int n= str1.length();
		int m = str2.length();
		int count =0;
		if(n==m) {
			for(int i=0;i<n;i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					count++;
				}
			}
		}
		else {
			System.out.println("Not an lacicogrpically");
		}
        if(count==n&&count==m) {
        	System.out.println("It is an lacicogrpically");
        }
        else {
			System.out.println("Not an lacicogrpically");
		}
	}

}
