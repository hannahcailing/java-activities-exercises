package exercism_projects;

/**
 * In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.
 * In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.
 * In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.
 * 
 * @author
 * Hannah Cailing
 */

public class chars_squeakyclean {
	
	public static String clean (String input) {
		StringBuilder clean_word = new StringBuilder();
		boolean isCapital = false;
		
		for (char get_char : input.toCharArray()) {
			
			/* replace any spaces encountered with underscores */
			if (get_char == ' ') {
				clean_word.append('_');
				isCapital = false;
			}
			
			/* replace control characters with the upper case string "CTRL" */
			else if (Character.isISOControl(get_char)) {
				clean_word.append("CTRL");
			}
			
			/* convert kebab-case to camel case */
			else if (get_char == '-') {
				isCapital = true;
			}
			
			/* omit characters that are not letters and greek lower case letters */
			else if (Character.isLetter(get_char) && (get_char < 0x3B1 || get_char > 0x3C9)) {
				if (isCapital == true) {
					get_char = Character.toUpperCase(get_char);
				}
				
				clean_word.append(get_char);
				isCapital = false;
			}
		}
		
		return clean_word.toString();
	}
}
