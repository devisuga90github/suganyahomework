package week1.day2;

import java.util.Iterator;

public class PalindromeAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123321;
		int digit = input;
		int remainder;
		int output = 0;

		for (output = 0; input > 0; input = input / 10) {
			remainder = input % 10;
			output = (output * 10) + remainder;

			System.out.println(output);

		}

		if (digit == output) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The numebr is not palindrome");
		}

	}

}
