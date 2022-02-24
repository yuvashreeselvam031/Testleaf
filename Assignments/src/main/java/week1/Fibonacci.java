package week1;

public class Fibonacci {

	public static void main(String[] args) {
		
		//Fibonacci series
		//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
		// the order should be 0 1 1 2 3 5
		
		int firstNumber = 0;
		int secondNumber = 1;
		int num = 5;
		//upto 6 
		
		int sum ;
		System.out.println( firstNumber);
		// 0
		System.out.println(secondNumber);
		// 1
		
		// first printing 0 and 1
		// 0 
		// 1
		// 0 + 1 =1
		// so 0 1 1
		// 1 + 1 =2
		// so 0 1 1 2
		// 1 + 2 = 3
		// so 0 1 1 2 3
		// 2 + 3 = 5
		//so 0 1 1 2 3 5
		
		
		for (int i=0;i<num;i++) {
		sum = firstNumber+secondNumber;
		// 1 + 2
		//sum =  3
		System.out.println(sum);
		// 3
		firstNumber = secondNumber;
		//firstNumber = 2
		secondNumber = sum;
		//secondNumber = 3
		
		
		}
		  
			
	}
}

	
