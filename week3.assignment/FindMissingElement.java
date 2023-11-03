/*Find the missing element in the given array
Input -> {1, 4,3,2,8, 6, 7};
Output -> 5 
Create a Java class named FindMissingElement. 
- Add a main method in the FindMissingElement class, either by typing it or using a shortcut
(Type main, ctrl+space & Enter).
- Inside the main method, write java code to print Missing Number in the console. 
- Save the code and run the program (right-click -> Run as -> Java Application).*/

package week3.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array1[]= {1,4,3,2,8,6,7};
		Arrays.sort(array1);
		//System.out.println(array1);
		int length= array1.length;
		for (int i = 0; i < length; i++){
			if (array1[i]==i+1) {
				
			} else {
				System.out.println("The missing number is " +(i+1));
				break;

			}
		}

	}

}
