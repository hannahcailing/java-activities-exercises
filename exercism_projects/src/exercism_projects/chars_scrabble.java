package exercism_projects;

/**
 * Given a word, compute the scrabble score for that word.
 * 
 * Letter							Score
 * A, E, I, O, U, L, N, R, S, T		1
 * D, G  							2
 * B, C, M, P 						3
 * F, H, V, W, Y					4
 * K								5
 * J, X 							8
 * Q, Z								10
 * 
 * Example
 * - "cabbage" should be scored as worth 14 points.
 * 
 * Extensions
 * - You can play a double or a triple letter.
 * - You can play a double or a triple word.
 * 
 * @author
 * Hannah Cailing
 */

public class chars_scrabble {

	public int scrabble (String word) {
		int score = 0;
		word = word.toUpperCase();
		
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' ||
					word.charAt(i) == 'L' || word.charAt(i) == 'N' || word.charAt(i) == 'R' || word.charAt(i) == 'S' || word.charAt(i) == 'T') {
				score = score + 1; }
			
			else if (word.charAt(i) == 'D' || word.charAt(i) == 'G') {
				score = score + 2; }
			
			else if (word.charAt(i) == 'B' || word.charAt(i) == 'C' || word.charAt(i) == 'M' || word.charAt(i) == 'P') {
				score = score + 3; }
			
			else if (word.charAt(i) == 'F' || word.charAt(i) == 'H' || word.charAt(i) == 'V' || word.charAt(i) == 'W' || word.charAt(i) == 'Y') {
				score = score + 4; }
			
			else if (word.charAt(i) == 'K') {
				score = score + 5; }
			
			else if (word.charAt(i) == 'J' || word.charAt(i) == 'X') {
				score = score + 8; }
			
			else if (word.charAt(i) == 'Q' || word.charAt(i) == 'Z') {
				score = score + 10; }
			
			else {
				score = score + 0; }
		}
		
		return score;
	}
	
	/**
	import java.util.HashMap;
	import java.util.Map;

	private String word;
    private static final Map <Integer, Integer> scrabble_score = new HashMap<>(26);
    
    static {
        "AEIOULNRST".chars().forEach(c -> scrabble_score.put(c, 1));
        "DG".chars().forEach(c -> scrabble_score.put(c, 2));
        "BCMP".chars().forEach(c -> scrabble_score.put(c, 3));
        "FHVWY".chars().forEach(c -> scrabble_score.put(c, 4));
        "K".chars().forEach(c -> scrabble_score.put(c, 5));
        "JX".chars().forEach(c -> scrabble_score.put(c, 8));
        "QZ".chars().forEach(c -> scrabble_score.put(c, 10));
    }
    
    Scrabble (String word) {
        this.word = word.toUpperCase();
    }
    
    int getScore () {
        return word.chars().reduce(0, (a, b) -> a + scrabble_score.get(b));
    }
	
	 */
}
