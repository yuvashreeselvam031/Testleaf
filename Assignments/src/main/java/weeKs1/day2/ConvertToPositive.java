package weeKs1.day2;

public class ConvertToPositive {

	public static void main(String[] args) {
		int number= 65;
		int number1;
		
		if(number<0)
		{
			//converting negative to poistive by multiplying with '-'
			
			number1=-(number);
					
			System.out.println("The given number"+number+"is converted to "+number1);
			}
		else {
			System.out.println("The given number"+number+"is a Positive number");
		}
	}
}


