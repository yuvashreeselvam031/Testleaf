package week2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// PrimeNumber
		//a number that is divisible only by itself and 1 
		//7 % 7 = 0
		//7 % 1 = 0
		
		int a = 2;         
		
		boolean flag = false;
		// from 1 2 3 4 5 6 
		for (int i = 2; i < a; i++) {
			// 2 3 4 5 
			
			if (a%i==0) {
				//7 % 3 == 0
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not a prime number");

		}
	}

}
