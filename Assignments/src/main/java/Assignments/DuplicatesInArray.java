package Assignments;

public class DuplicatesInArray {

	public void toRemoveDuplicatesWithInteger() {
		int[] a = { 10, 20, 50, 20, 30, 10 };
		int[] b = new int[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] == a[j]) {
					a[j] = 99;
				}
			}
			if (a[i] != 99) {
				b[i] = a[i];
				System.out.println(b[i]);
			}
		}
		System.out.println("\n");
	}

	private void toPringDuplicateWithInteger() {
		int[] a = { 10, 20, 50, 20, 30, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicatesInArray d = new DuplicatesInArray();
		d.toRemoveDuplicatesWithInteger();
		d.toPringDuplicateWithInteger();

	}

}
