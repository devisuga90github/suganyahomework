/*- Declare an array {1, 2, 3, 4, 10, 6, 8}.
- Do a comparison check if there is a gap in the sequence of numbers.
- Print the numbers that are missing.
Hints to Solve:
- Arrange the collection in ascending order
- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if
there is a gap in the sequence of numbers
- Use the get() method to get an element from the list
- Print the number if a gap is detected.*/

package week3.assignment;

import java.util.Arrays;

public class ListMissingElement {

	public static void main(String[] args) {
		int array[]= {1, 2, 3, 4, 10, 6, 8};
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length-1; i++) {
						
			if (array[i]+1 != array[i+1] ) {
				int missingElement =array[i]+1;
				System.out.println(missingElement);
				
			} 
		}
		
	}

}
