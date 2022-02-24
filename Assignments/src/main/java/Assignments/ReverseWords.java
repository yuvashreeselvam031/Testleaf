package Assignments;


public class ReverseWords {

	public static void main(String[] args) {


		String str = "Welcome to java session";
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (i%2!=0) {
				char[] l = s[i].toString().toCharArray();
				for (int j = l.length-1; j >=0; j--) {
					System.out.print(l[j]);
				}				
			} else {
				System.out.print(" " +s[i]+ " ");
			}			
		}
	}

}
