package IU4;

import java.util.Scanner;

public class Homework4A{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number:");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.println("Greatest : " + num1);
		}
		else if(num2 > num1 && num1 > num3) {
			System.out.println("Greatest : " + num2);
		}
		else if(num3 > num1 && num1 > num2) {
			System.out.println("Greatest : " + num2);
		}
				

	}

}
