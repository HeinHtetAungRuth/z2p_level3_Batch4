package IU3;

import java.util.Scanner;

public class Homework3B {

	public static void main(String[] args) {
		
		//Variable Declaration 
		int num1, num2, num3;
		
		//Input number from user
		Scanner pro = new Scanner(System.in);
		System.out.println("Enter number 1:");
		num1=pro.nextInt();
		System.out.println("Enter number 2:");
		num2=pro.nextInt();
		System.out.println("Enter number 3:");
		num3=pro.nextInt();
		
		
		//Product of three number
		int result = num1 * num2 * num3;
		
		System.out.println( num1+"x"+num2+"x"+num3+"="+result);

	}

}
