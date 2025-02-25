package Nandhees;

public class VowelsInString {
 public static void main(String[]args) {
	 char[] str= {'n','a','n','d','h','e','e','s'};
	 int n = str.length;
	 int v=0,c=0;
	 for(int i=0;i<n;i++) {
		 if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {
			 v++;
		 }
		 else {
			 c++;
		 }
	 }
	 System.out.println("The No.Of Vowels in str: "+v);
	 System.out.println("The No.Of Consonants in str: "+c);
 }
}
