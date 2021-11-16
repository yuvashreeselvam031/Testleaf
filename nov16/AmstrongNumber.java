package nov16;

public class AmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
	
		int original = num;
		int calc=0;
		int remainder;
		while(num>0) {
		remainder=num%10;
		num=num/10;
		
		calc= calc+remainder*remainder*remainder;
		
		}
		
		if (calc==original) {
			System.out.println("the given number is amstrong number");
		} else {

			System.out.println("the given number is not amstrong number");
		}
	}

}
