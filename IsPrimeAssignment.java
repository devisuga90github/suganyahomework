package week1.day2;

public class IsPrimeAssignment {

	public static void main(String[] args) {

		int n = 39;
		
		for (int i = 2; i <= n - 1; i++) {

			if (n % i == 0) {
				
				System.out.println("The number " + n + " is not a Prime");
				break;
				
			}
			    System.out.println("The number " + n + " is  a Prime");
			    break;
		}

		
	}

}
