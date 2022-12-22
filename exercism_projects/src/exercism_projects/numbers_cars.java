package exercism_projects;

/**
 * In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. 
 * The assembly line's speed can range from 0 (off) to 10 (maximum).
 * 
 * At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, 
 * it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, 
 * which then have to be discarded. The following table shows how speed influences the success rate:
 * - 1 to 4: 100% success rate.
 * - 5 to 8: 90% success rate.
 * - 9: 80% success rate.
 * - 10: 77% success rate.
 * 
 * @author 
 * Hannah Cailing
 */

public class numbers_cars {
	int producedCarPerHour = 221;
	double successRate = 0.0;
	
	/* calculate the production rate per hour */
	public double productionRatePerHour (int speed) {
		if (speed == 10) {
			successRate = 0.77; }
		
		else if (speed == 9) {
			successRate = 0.80; }
		
		else if (speed <= 8 && speed >= 5) {
			successRate = 0.90; }
		
		else if (speed <= 4 && speed >= 1) {
			successRate = 1.00; }
		
		return speed * producedCarPerHour * successRate;
	}
	
	/* calculate the number of working items produced per minute */
	public int workingItemsPerMinute (int speed) {
		return (int)this.productionRatePerHour(speed) / 60;
	}
}
