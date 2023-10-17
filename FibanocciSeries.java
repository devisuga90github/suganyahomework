package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int MaxRange = 7;
		int n,m=1;
		int first_term =0;
		int second_term=1;
		int next_term;
		
		for (int i = 0; i <= MaxRange; i++) {
			
			if (i<=1)
			
			{
				System.out.println(i);	
				
			}
			else {
			// i=(i-1);
			// i++; //+(i-2);
		    next_term = first_term+ second_term;
		    first_term = second_term;
			second_term= next_term;
            System.out.println(second_term);
			}

		}

	}

}
