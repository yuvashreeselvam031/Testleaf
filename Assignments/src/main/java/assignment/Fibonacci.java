package assignment;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum = 0 ;
		int secnum = 1;
		int range = 8;
		
		System.out.println("First Number : " +firstnum);
		for (int i=0;i<range;i++) {
			int sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
		}
	}

}
