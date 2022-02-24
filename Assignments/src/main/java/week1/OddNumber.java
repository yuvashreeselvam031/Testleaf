package week1;

public class OddNumber {

	public static void main(String[] args) {

		
			String test = "I am a software tester";
			
//			String s1= "['I', 'am', 'a', 'software', 'tester']";
			String[] arr=test.split(" ");
			//System.out.println(test);
			for(int i=0;i<=arr.length-1;i++)
		       {
				//find the odd index within the loop (use mod operator)
				if(i%2==0) {
					String[] arr1=test.split(" ");
					System.out.println(arr1[i]);
				}
		           
		       }
			//System.out.println(arr1);
			
		}

	
	}
