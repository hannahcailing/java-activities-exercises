package codility_projects;

/**
 * A non-empty array A consisting of N integers is given. Each element of the array can be treated as a relative pointer
 * to another element in the array: if A[K] = M, then element A[K] points to element A[K+M].
 * 
 * The array defines a sequence of jumps of a pawn as follows:
 * - Initially, the pawn is located at element A[0];
 * - On each jump, the pawn moves from its  current element to the destination element pointed to by the current element;
 * i.e. if the pawn stands on element A[K], then it jumps to the element pointed to by A[K];
 * - The pawn may jump forever or may jump out of the array.
 * 
 * For example, consider the following array A: A[0] = 2; A[1] = 3; A[2]  =-1; A[3] = 1; A[4] = 3; or A[2, 3, -1, 1, 3];
 * This array defines the following sequence of jumps of the pawn:
 * - Initially, the pawn is located at element A[0];
 * - On the first jump, the pawn moves from A[0] to A[2] because 0 + A[0] = 2;
 * - On the second jump, the pawn moves from A[2] to A[1] because 2 + A[2] = 1;
 * - On the third jump, the pawn moves from A[1] to A[4] because 1 + A[1] = 4;
 * - On the fourth jump, the pawn jumps out of the array.
 * 
 * Write a function that, given a non-empty array A consisting of N integers, returns the number of jumps after which the
 * pawn will be out of the array. The function should return -1 if the pawn will never jump out of the array.
 * 
 * For example, for the array A given above, the function should return 4, as explained above. 
 * 
 * Given array A such that: A[0] = 1, A[1] = 1; A[2] =-1; A[3] = 1; or A[1, 1, -1, 1]; the function should return -1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * - N is an integer within the range [1 to 100 000];
 * - Each element of array A is an integer within the range [-1 000 000 to 1 000 000].
 * 
 * @author 
 * Hannah Cailing
 */

public class codility_pawnjump {
	
	public int solution (int[] A) {
		int pos_index = 0, count_move = 0;
		boolean visited = false;
		
		// If 
		if (A.length == 1) {
			return count_move;
		}
		
		// Run the loop as long as the position index is an positive integer and within the array range
		while (pos_index >= 0 && pos_index < A.length) {
			
			// Check if the index has been visited before
			
			
			// Mark the current position as visited
			
			// Jump 
			
			// Increment the Counter
			count_move += 1;
		}
		
		return count_move;
	}

}
