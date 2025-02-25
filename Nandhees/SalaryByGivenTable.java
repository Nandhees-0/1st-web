package Nandhees;

import java.util.Scanner;

public class SalaryByGivenTable {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your gender(male/female) : ");
		        String gender = scanner.nextLine().toLowerCase();
		        Scanner scanner2 = new Scanner(System.in);
		        System.out.print("Enter your Qualification(pg/gr) : ");
		        String qualification = scanner.nextLine().toLowerCase();
		        Scanner scanner1 = new Scanner(System.in);
		        System.out.print("Enter your Experience : ");
		        int experience = scanner.nextInt();
		     if(gender.equals("male") && qualification.equals("pg") && experience >=10) {
		    			 System.out.println("Your Salary is 15K");
		     }
		     else if(gender.equals("male") && qualification.equals("pg") && experience<10) {
    			 System.out.println("Your Salary is 10K");
     }
		     else if(gender.equals("male") && qualification.equals("gr") && experience >=10) {
    			 System.out.println("Your Salary is 10K");
     }
		     else if(gender.equals("male") && qualification.equals("gr") && experience<10) {
    			 System.out.println("Your Salary is 7K");
     }
		     else if(gender.equals("female") && qualification.equals("pg") && experience >=10) {
    			 System.out.println("Your Salary is 12K");
     }
		     else if(gender.equals("female") && qualification.equals("pg") && experience<10) {
    			 System.out.println("Your Salary is 10K");
     }
		     else if(gender.equals("female") && qualification.equals("gr") && experience >=10) {
    			 System.out.println("Your Salary is 9K");
     }
		     else if(gender.equals("female") && qualification.equals("gr") && experience<10) {
    			 System.out.println("Your Salary is 6K");
     }
		     else {
		    	 System.out.println("Your Entry is Invalid...");
		     }
		        scanner.close();
		        
		    }
	}


