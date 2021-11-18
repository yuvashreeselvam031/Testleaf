package nov18;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
	char[] ch = test.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if (i%2!=0) {
			char upperCase = Character.toUpperCase(ch[i]);
			ch[i]=upperCase;
			
			}
		System.out.print(" "+ch[i]);
		
	}
	String string = Arrays.toString(ch);
	System.out.println("\n"+string);
	
	}

}
