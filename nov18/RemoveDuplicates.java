package nov18;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> text1 = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			String t2= split[i];
			text1.add(t2);
		}
		System.out.println(text1);
		
	
	}

}
