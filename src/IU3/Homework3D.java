package IU3;

import java.util.Scanner;

public class Homework3D {

	public static void main(String[] args) {
		
		//Variable Declaration
		int num1,num2,num3,num4,num5;
		
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number1 ");
		num1=sc.nextInt();
		System.out.println("Input Number2 ");
		num2=sc.nextInt();
		System.out.println("Input Number3 ");
		num3=sc.nextInt();
		System.out.println("Input Number4 ");
		num4=sc.nextInt();

		//Sum Numbers
		int sum = num1 + num2 + num3 + num4;
		System.out.println("Sum is: " + sum);
		
		int avgvalue = sum/4;
		System.out.println("Average is: "+ avgvalue + "%");
	}

}
