package exercism_projects;

/**
 * In this exercise you're going to write some code to help you cook a brilliant lasagna from your favorite cooking book.
 * 
 * @author 
 * Hannah Cailing
 */

public class basics_lasagna {
	int expected_minutes = 40, preparation_minutes = 2;
	
	/* define the expected oven time in minutes */
	public int expected_time () {
		return expected_minutes;
	}
	
	/* calculate the remaining oven time in minutes */ 
	public int remaining_time (int actual_time) {
		return this.expected_time() - actual_time;
	}
	
	/* calculate the preparation time in minutes */
	public int preparation_time (int number_layer) {
		return preparation_minutes * number_layer;
	}
	
	/* calculate the total working time in minutes */
	public int total_time (int actual_time, int number_layer) {
		return actual_time + this.preparation_time(number_layer);
	}
}
