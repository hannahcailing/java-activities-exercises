package exercism_projects;

/**
 * In this exercise you'll be processing log-lines.
 * 
 * Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".
 * 
 * There are three different log levels:
 * - INFO
 * - WARNING
 * - ERROR
 * 
 * @author
 * Hannah Cailing
 */

public class strings_loglevels {
	
	/* get message from a log line */
	public static String message (String logLine) {
		return logLine.split(":")[1].trim();
	}
	
	/* get log level from a log line */
	public static String logLevel (String logLine) {
		return logLine.split(":")[0].replace("[", "").replace("]", "").toLowerCase();
	}
	
	/* reformat a log line */
	public static String reformat (String logLine) {
		return logLine.split(":")[1].trim() + " " + logLine.split(":")[0].replace("[", "(").replace("]", ")").toLowerCase();
	}
}
