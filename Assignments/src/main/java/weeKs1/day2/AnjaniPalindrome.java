package weeKs1.day2;

public class AnjaniPalindrome {

	public static void main(String[] args) {
		long num=34346L;
		long temp=num;
		int len=0;
		int value =1;
		long rem;
		long num2=0;
		while(num>0)
		{
			
			num = num/10;
			len++;
		}
		num=temp;
		for (int i = len-1; i >=0; i--)
			
		{
			rem=num%10;
			rem=rem*value;
		  	for (int  k=0;k <i; k++) {
		  		value= value*10;
				
			}
		  	num2=num2+ rem*value;
		  	value =1;
		  	num=num/10;
		  	if (num ==0)
		  	{
		  	break;
		  	}
		}
		System.out.println("Input Number;"+temp);
		System.out.println("Reversed Number;"+num2);
		if (num2==temp)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is not Palindrome");
		}
		
	}

}
