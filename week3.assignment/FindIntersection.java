/*Declare An array for {3,2,11,4,6,7}; 
- Declare another array for {1,2,8,4,9,7};
- Declare for loop iterator from 0 to array length
- Declare a nested for another array from 0 to array length
- Compare both the arrays using a conditional statement.
- Print the value from first array when there is a match */

package week3.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int array1[] = {3,2,11,4,6,7};
		int array2[] = {1,2,8,4,9,7};
		int length1 =array1.length;
		int length2 =array2.length;
		
		System.out.println("The matching values are ");
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++) {
				if (array1[i]==array2[j]) {
					System.out.println (+array1[i]);
				

				}
				
			}
			
		}
		
		

	}

}
