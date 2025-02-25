package Nandhees;

public class FrequencyEleInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,5,6,3,6,4,9};
		int count=0;
        for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
