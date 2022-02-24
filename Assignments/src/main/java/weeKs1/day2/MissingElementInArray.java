package weeKs1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
int[] a = {1,2,3,4,6,7,9,11};
		
		int count=1;
				
		Arrays.sort(a);
	
//To print the sorted array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");

		}
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=count) {
				
				System.out.println(count);
				
				break;
				}
			else if(a[i]==count) {
				
			count++;
				
			}
			
			}
		System.out.println("No missing element");

	}
}
