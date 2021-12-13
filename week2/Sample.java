package week2;

public class Sample {

		//[2:55 PM, 12/13/2021] Pradeep Test2: public class RemoveDuplicates {

			public static void main(String[] args) {
				 
				String text = "We learn java basics as part of java sessions in java week1";
				
				 
				String[] Word = text.split(" ");
				
				//loop iteration
				for(int i=0;i<Word.length;i++) {
					
					for(int j=i+1;j<Word.length;j++) {
						
						if(Word[i].equalsIgnoreCase(Word[j])) {
							Word[j]="";
						}
					}
				}
				System.out.println("String without duplicates:");
				for(int i=0;i<Word.length;i++) {
					System.out.print(Word[i]+" ");
				}
				
				

			}

			
		
	}


