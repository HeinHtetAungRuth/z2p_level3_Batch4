package Pratice;

import java.util.Scanner;

public class IfElseIfStatement {


	public static void main(String[] args) {
		
		String color;
		
		System.out.println("you can enter Red or Green or Yellow");
		
		Scanner guess = new Scanner(System.in);
		
	    System.out.println("Enter color:");
	    color = guess.nextLine();
	    
	   
		if(color.equals("red")) {    // blue    .equals("")  num1==num2   name1.equals()
	    	System.out.println("STOP");
	    }
	    else if(color.equals("yellow")) {  
	    	System.out.println("Slowly");
	    }
	    else if(color.equals("green")){
	    	System.out.println("You can drive");
	    }
	    else {
	    	System.out.println("Your choice is wrong");
	    }
	      
	    

	}

}
