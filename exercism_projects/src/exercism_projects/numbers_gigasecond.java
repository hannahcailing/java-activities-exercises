package exercism_projects;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Given a moment, determine the moment that would be after a gigasecond has passed.
 * 
 * A gigasecond is 10^9 (1,000,000,000) seconds.
 * 
 * @author 
 * Hannah Cailing
 */

public class numbers_gigasecond {
	
	private LocalDateTime temp;
	
	public numbers_gigasecond (LocalDate moment) {
		this.temp = moment.atStartOfDay(); }
	
	public numbers_gigasecond (LocalDateTime moment) {
		this.temp = moment; }
	
	public LocalDateTime getDateTime() {
		return this.temp.plusSeconds(1000000000); }
}
