package IU3;

import java.util.Scanner;

public class Homework3A {

	public static void main(String[] args) {
		
		//Variable Declaration
		String name, gender;
		double salary;
		boolean overtimeStatus;
		
		//Input Data From User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff Name:");
		name = sc.nextLine();
		System.out.println("Enter Staff Gender such as Male or Female:");
		gender = sc.nextLine();
		System.out.println("Enter Staff Salary:");
		salary = sc.nextDouble();
		System.out.println("Enter Overtime status such as true or false:");
		overtimeStatus=sc.hasNext();
		
		
		//Display output
		System.out.println("Staff Name: "+ name.toUpperCase());
		System.out.println("Staff Gender: "+ gender.charAt(0));
		System.out.println("Staff Salary: "+ salary);
		System.out.println("Staff Overtime status: "+ overtimeStatus);
		

	}

}
