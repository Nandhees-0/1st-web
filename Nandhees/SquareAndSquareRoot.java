package Nandhees;

public class SquareAndSquareRoot {

	public static void main(String[] args) {
		int ar[]= {4,5,6,7,8,9};
		int n = ar.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			int arr = (ar[i]*ar[i]);
			sum+=arr;
			System.out.println("The Square of each element is: "+arr);
		}
		System.out.println("The Sum of Square of elements inarray is: "+sum);
		double sqr= Math.sqrt(sum);
		System.out.println("The Square is: "+sqr);

	}

}
