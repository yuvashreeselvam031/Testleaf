package weeKs1.day2;

import java.util.Arrays;

public class ShankariMissingElementInAnArray {

	public static void main(String[] args) {
		int numbers[]={1,2,3,4,7,6,8,10,12};
        Arrays.sort(numbers);
        int i=1;

        while ( i < numbers.length ) 
        {
            if ( numbers[i] - numbers[i-1] == 1 ) 
            {
            } 
            else 
            {
                System.out.println( "Missing number is " + ( numbers[i-1] + 1 ) );
            }
            i++;
        }
	}

}
