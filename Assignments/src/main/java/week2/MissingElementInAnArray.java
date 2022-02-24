package week2;



public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 5, 6, 8, 10, 13 };
		//          0  1  2  3  4  5  6  7
		
		int count = 1;
		// count =2
		for (int i = 0; i <= a.length - 1; i++) {
			// i =4
			if (a[i] != i + count) {
				// a[3]!= 3 + 2
				// 5 == 5
				System.out.println(i + count);
				//1 + 1
				//2
				count++;

			}
		}

	}
}
