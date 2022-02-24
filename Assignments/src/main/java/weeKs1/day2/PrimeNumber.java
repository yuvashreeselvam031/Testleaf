package weeKs1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean count = false;

		// if the number is divisible by 1 and also by its own number only except 1.
		
		for(int i=2;i<=input/2;++i)
		{
			
			if(input%i==0)
			{
				count= true;
				break;
			}
		}
		if (!count)
		
			System.out.println("The given number"+input+" is a prime number ");
		else	
		
			System.out.println("The given number"+input+" is not a prime number ");
				
		
			
	}
	}


