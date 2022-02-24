package weeKs1.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		int number=34346;
		int output=0;
		int reminder;
		int input;
		input=number;
		
	while(number>0)
	{	
			reminder=number%10;
	        output=(output*10)+reminder;
	        number=number/10;
	}
			
			if(input== output)
			{
			System.out.println("The given number "+input+"is Palindrome");
		}
	
			else {
				System.out.println("The given number "+input+"is not a Palindrome");
			}
			
	}
}
