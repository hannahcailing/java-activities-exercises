package codility_projects;

public class codility_testcases {
	
	public static void main (String[] args) {
		
		// Missing Smallest Positive Integer
		System.out.println("\nMissing Smallest Positive Integer");
		codility_missingint missingint = new codility_missingint();
		
		int[] missingint_test1 = {1, 3, 6, 4, 1, 2};
		System.out.println("Test 1:\t" + missingint.solution(missingint_test1));
		
		int[] missingint_test2 = {1, 2, 3};
		System.out.println("Test 2:\t" + missingint.solution(missingint_test2));
		
		int[] missingint_test3 = {-1, -3};
		System.out.println("Test 3:\t" + missingint.solution(missingint_test3));
		
		// Rotation of Directions
		System.out.println("\nRotation of Directions");
		codility_directions directions = new codility_directions();
		
		String directions_test1 = "^vv<v";
		System.out.println("Test 1:\t" + directions.solution(directions_test1));
		
		String directions_test2 = "v>>>vv";
		System.out.println("Test 2:\t" + directions.solution(directions_test2));
		
		String directions_test3 = "<<<";
		System.out.println("Test 3:\t" + directions.solution(directions_test3));
	}

}
