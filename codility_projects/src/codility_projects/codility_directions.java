package codility_projects;

/**
 * You are given a string representing a sequence of N arrows, each pointing in one of the four cardinal 
 * directions: up ('^'), down ('v'), left ('<'), or right ('>').
 * 
 * Write a function that, given a string S denoting the directions of the arrows,
 * returns the minimum number of rows that must be rotated to make them all point in the same direction.
 * 
 * Examples:
 * 1. Given S = "^vv<v", the function should return 2, after rotating both the first ('^') and fourth ('<') arrows
 * downwards ('v'), all the arrows would point down.
 * 
 * 2. Given S = "v>>>vv", the function should return 3, after rotating the first, fifth, and sixth arrow rightwards, 
 * all of the arrows would point right.
 * 
 * 3. Given S = "<<<", the function should return 0. All of the arrows already point in left.
 * 
 * Assume that:
 * - N is an integer within the range [1 to 100];
 * - string S is made only of the following characters: "^", "v", "<", and ">".
 * 
 * In your solution, focus on the correctness. The performance if your solution will not be the focus of the assessment.
 * 
 * @author 
 * Hannah Cailing
 */

public class codility_directions {
	
	public int solution (String S) {
		int count_up = 0, count_dn = 0, count_lf = 0, count_rt = 0, freq_size = 4, largest = 0, rotation = 0;
		int[] freq = new int[freq_size];
		
		// Count the frequency of each character and store the value in an integer array
		for (int i = 0; i < S.length(); i++) {
			char character = S.charAt(i);
			
			if (character == '^') {
				count_up += 1;
				freq[0] = count_up;
			}
			
			else if (character == 'v') {
				count_dn += 1;
				freq[1] = count_dn;
			}
			
			else if (character == '<') {
				count_lf += 1;
				freq[2] = count_lf;
			}
			
			else if (character == '>') {
				count_rt += 1;
				freq[3] = count_rt;
			}
			
		}
		
		// Find the largest value in an integer array
		for (int i = 0; i < freq_size; i++) {
			for (int j = i + 1; j < freq_size; j++) {
				if (freq[i] > freq[j]) {
					largest = freq[i];
					freq[i] = freq[j];
					freq[j] = largest;
				}
			}
		}
		
		// Compute the number of rotation
		rotation = S.length() - largest;
		
		return rotation;
	}
}
