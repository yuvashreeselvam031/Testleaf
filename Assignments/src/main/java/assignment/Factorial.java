package assignment;

public class Factorial {

	
		public static void main(String[] args) {
			int i,fact=1;
			int number = 10;
			for(i=1;i<=5;i++) {
				fact=fact*i;
				
			}
			System.out.println("Factorial of "+number+" is:"+fact);
		}	
	}
