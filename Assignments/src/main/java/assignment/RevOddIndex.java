package assignment;

public class RevOddIndex {

	public static void main(String[] args) {

		String str= "I am a software tester";
		String[] split = str.split(" ");
		//String revStr ="";	
		String temp ="";
		for (int i = 0; i < split.length; i++) {
			String revStr ="";
			if (i%2==0) {
				String string = split[i];
				temp = temp+string + " ";
				//System.out.println(revStr);
				
			} else {
				char[] charArray = split[i].toCharArray();
				System.out.println(split[i]);
				for (int j = charArray.length-1; j >=0; j--) {
					revStr=revStr+charArray[j];
					
				}
				System.out.println(revStr);
				//System.out.println(split[i]);
				temp =temp+ revStr+" ";
				
			

			}
		
			
		}
		//System.out.println(temp);
	}

}
