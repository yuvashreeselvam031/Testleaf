package assignment;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicate {

	public void method1() {

		// TODO Auto-generated method stub
				String text = "We learn java basics as part of java sessions in java week1";
				String[] split = text.split(" ");
				for (int i = 0; i < split.length; i++) {
					for (int j = i+1; j < split.length; j++) {
						if (split[i].equals(split[j])) {
							split[j] = "";
						}
					}
				}
				for (int i = 0; i < split.length; i++) {
					if (!split[i].equals(" ")) {
						System.out.print(split[i]+" ");
					}
				}


	}
	public void method2() {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		String replaced = "";
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					split[j]="";
				} 
				
			}
		}
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
			if(!split[i].equals("")) {
			replaced=replaced+ split[i]+" ";
			}
		}
		
		System.out.println("original string: "+text);
		System.out.println("string after removed duplicates: "+replaced);
		
	}
	public static void main(String[] args) {
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.method2();
		obj.method1();
		
	}

}
