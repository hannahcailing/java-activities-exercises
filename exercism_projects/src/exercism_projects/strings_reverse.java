package exercism_projects;

/**
 * Reverse a string
 * 
 * For example: input: "cool" output: "looc"
 * 
 * @author 
 * Hannah Cailing
 */

public class strings_reverse {
	
	/* reverse a string */
	public String reverse (String input) {
		String word = "";
		char get_char;
		
		for (int i = 0; i < input.length(); i++) {
			get_char = input.charAt(i);
			word = get_char + word;
		}
		
		return word;
	}
}
