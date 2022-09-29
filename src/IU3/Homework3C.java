package IU3;

import java.util.Scanner;

public class Homework3C {

	public static void main(String[] args) {
		
		//Variable declaration
		double width,height;
		
		//Input width and height from user
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter width of Rectangle");
		width=ar.nextDouble();
		System.out.println("Enter height of Rectangle");
		height=ar.nextDouble();
		
		//Calculate Area
		double area=width*height;
		
		//Display output
		System.out.println("Area of Rectangle = " + area);

	}

}
