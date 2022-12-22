package exercism_projects;

/**
 * Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.
 * 
 * The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.
 * The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.
 * 
 * Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the 
 * first ten natural numbers is 3025 - 385 = 2640.
 * 
 * You are not expected to discover an efficient solution to this yourself from first principles; research is allowed, indeed, encouraged. 
 * Finding the best algorithm for the problem is a key skill in software engineering.
 * 
 * @author
 * Hannah Cailing
 */

public class numbers_squares {
	
	public int difference (int N) {
		int square_sum = 0, sum_square = 0;
		int array[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = i + 1;
			
			square_sum = (square_sum + array[i]);
			sum_square = sum_square + (array[i] * array[i]);
		}
		
		square_sum = square_sum * square_sum;
		return square_sum - sum_square;
	}
}
