package week2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] split = text.split(" ");
		List<String> list= new ArrayList<String>();
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					split[j]="";
					
				}
				
				
			}
			
			
		}
		//System.out.println(list);
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
		}
	}

}
