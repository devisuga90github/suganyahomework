/*Find the second largest number from the given array
Assignment Requirements:
- Declare an array {3, 2, 11, 4, 6, 7}.
- Pick the 2nd element from the last and print it.
Hints to Solve:
- Arrange the collection in ascending order
- Use the get method to print the second largest numbe*/


package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondLargestNumber {

	public static void main(String[] args) {
		int[] array= {3, 2, 11, 4, 6, 7};
		Arrays.sort(array);
		int length = array.length;
		System.out.println("Length of array: "+length);
		
		List<Integer> largestNumber =new ArrayList<>();
		for (Integer num : array) {
			largestNumber.add(num);
		}
			//int answer =largestNumber.get(array[length-2]);
		int answer = largestNumber.get(length - 2);
			System.out.println("The second largest number in the array is: "+answer);
			
		

	}

}
