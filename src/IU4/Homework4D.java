package IU4;

import java.util.Scanner;

public class Homework4D {

	public static void main(String[] args) {
		
		Scanner sq = new Scanner(System.in);
		
		
		System.out.println("Enter 1st number:");
		int num = sq.nextInt();
		int squre = num*num;
		System.out.println("Square = " + squre);
		
		while(num>0) {
			System.out.println("Enter number that is not equal to zero");
			num = sq.nextInt();
			if(num!=0) {
				System.out.println("Square = " + num*num);
			}
		}
	}
}
			
		  
