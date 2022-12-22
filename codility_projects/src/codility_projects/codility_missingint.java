package codility_projects;
import java.util.Arrays;

/**
 * Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0)
 * that does not occur in A.
 * 
 * Examples:
 * 1. Given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 2. Given A = [1, 2, 3], the function should return 4.
 * 3. Given A = [-1, -3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * - N is an integer within the range [1 to 100 000];
 * - Each element of array is an integer within the range [-1 000 000 to 1 000 000].
 * 
 * @author
 * Hannah Cailing
 */

public class codility_missingint {
	
	public int solution (int[] A) {
		int missing_integer = 1;
		
		// Sort the array
		Arrays.sort(A);
		
		// Check the smallest missing positive integer (greater than 0)
		for (int i = 0; i < A.length; i++) {
			if (A[i] == missing_integer) { 
				
				/**
				 * if the value is equal to the initial value of the missing integer, 
				 * then the value is present in the array. 
				 * thus, change the initial missing integer to a new value.
				 */ 
				
				missing_integer++;
			}
		}
		
		return missing_integer;
	}
}
