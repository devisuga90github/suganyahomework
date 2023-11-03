/*
Assignment Requirements:
- Declare an array for {3, 2, 11, 4, 6, 7}
- Declare another array for {1, 2, 8, 4, 9, 7}
- Compare both the arrays
- Print the values if they are equal
Hints to Solve:
- Add array elements to a list
- Iterate the values through the length of the list
- Use an appropriate conditional statement to compare the values*/

package week3.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {
	int array1[]={3, 2, 11, 4, 6, 7};
	int array2[]={1, 2, 8, 4, 9, 7};
	
	List <Integer> array1List =new ArrayList<Integer>();
	List <Integer> array2List =new ArrayList<Integer>();
	
	for (Integer value1 : array1) {
		array1List.add(value1);
		
	}
	for (Integer value2 : array2) {
		array2List.add(value2);	
	}
	 //if (array1List.size() == array2List.size()) {
	for (int i = 0; i < array1List.size(); i++) {
		
		if (array1List.get(i).equals(array2List.get(i))) {
			System.out.println(array1List.get(i));
		}
	}
		
	}
		 
		
	
}

