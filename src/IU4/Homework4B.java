package IU4;

import java.util.Scanner;

public class Homework4B {

	public static void main(String[] args) {
		
	  Scanner pd = new Scanner(System.in);
	  
	  System.out.println("Enter number");
	  int num = pd.nextInt();    // 55 = pd.nextInt()   
	  
	  for(int i=1; i<=12; i++) {   //i=1   1<=12 1++
		  int result = num*i;   //12*1
		  System.out.println(num + "x" + i + "=" + result);
	  }

	}

}
