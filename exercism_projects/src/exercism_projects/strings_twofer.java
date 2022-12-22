package exercism_projects;

/**
 * Two-fer or 2-fer is short for two for one. One for you and one for me.
 * Given a name, return a string with the message: One for name, one for me.
 * Where "name" is the given name.
 * 
 * However, if the name is missing, return the string: One for you, one for me.
 * 
 * @author 
 * Hannah Cailing
 */

public class strings_twofer {
	
	/* given a name, return a string with the message: "one for name, one for me" */
	public String twofer (String name) {
		return String.format("One for %s, one for me.", name != null ? name : "you");
	}
}
