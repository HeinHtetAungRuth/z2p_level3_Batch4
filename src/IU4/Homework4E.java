package IU4;

import java.util.Scanner;

public class Homework4E {

	public static void main(String[] args) {
		
		System.out.println("What is the largest plant in our solor system?");

		Scanner ch = new Scanner(System.in);
		System.out.println("Choose one of the following: earth, jupitar, saturn");
		String choose = ch.nextLine();
		
		if(choose.equals("jupitar")) {
			System.out.println("Congrats! That's the correct answer");
		}
		else 
		{
			System.out.println("Your are incorrect. The correct answer is jupiter.");
		}
	}

}
