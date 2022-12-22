package exercism_projects;
import java.util.Arrays;

/**
 * You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.
 * 
 * @author 
 * Hannah Cailing
 */

public class foreach_birdwatcher {
	private final int[] birdsPerDay;
	
	public foreach_birdwatcher (int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay; 
	}
	
	/* check what the counts were last week */
	public int[] getLastWeek () {
		return birdsPerDay; 
	}
	
	/* check how many birds visited today */
	public int getToday () {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1]; 
	}
	
	/* increment today's count */
	public int incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
        return getToday();
    }
	
	/* check if there was a day with no visiting birds */
	public boolean hasDayWithoutBirds() {
        Arrays.sort(birdsPerDay);
        return Arrays.binarySearch(birdsPerDay, 0) != -1;
    }
	
	/* calculate the number of visiting birds for the first number of days */
	public int getCountForFirstDays(int numberOfDays) {
        int count = birdsPerDay[0];
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length; }
        
        for (int i = 1; i < numberOfDays; i++) {
            count += birdsPerDay[i]; }
        
        return count;
    }
	
	/* calculate the number of busy days */
	public int getBusyDays() {
        int countBusy = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                countBusy++; }
        }
        
        return countBusy;
    }
}
