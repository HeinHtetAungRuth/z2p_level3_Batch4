package Pratice;

import java.util.Scanner;

public class IFStatement {

	public static void main(String[] args) {
		
		int num1, num2, sum=0, result;
		
		//double salary ;//delclare data type
		
		//boolean nu;
		
		Scanner ha = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		num1 = ha.nextInt(); 
		
		System.out.println("Enter num2:");
		num2 = ha.nextInt(); 
		
		//System.out.println("Enter guess number between 0 to 10:");
		
		if(num1==5 && num2==8  ) { //50>=52 && 12<=52
			System.out.println("you correct!");
		}
		else{
			System.out.println("Wrong number");
		}
		
	}

}
