package university_penn;
import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing. Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
 */

public class up_hw1_simplegame {
	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	
	public String convertTime(int seconds){
		// TODO: Your code goes here
		int one_hour = 3600, one_minute = 60, convert_hours = 0, convert_minutes = 0, convert_seconds = 0;
		String converted_time = "";
		
		if (seconds > 0) {
			convert_hours = seconds / one_hour;
			convert_minutes = (seconds % one_hour) / one_minute;
			convert_seconds = seconds - ((one_hour * convert_hours) + (one_minute * convert_minutes));
			
			converted_time = String.valueOf(convert_hours) + ":" + String.valueOf(convert_minutes) + ":" + String.valueOf(convert_seconds);
		}
		
		else if (seconds == 0) {
			converted_time = "0:0:0";
		}
		
		else if (seconds < 0) {
			converted_time = "-1:-1:-1";
		}	
		
		return converted_time;
	}

	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	
	public int digitsSum(int input){
		// TODO: Your code goes here
		int sum = 0;
		
		while (input > 0) {
			sum = sum + (input % 10);
			input = input / 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		up_hw1_simplegame simplegame = new up_hw1_simplegame();
				
		Scanner sc = new Scanner(System.in);
			
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
				
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
				
		// TODO: Your code goes here
		int user_input = 1, user_seconds = 0, user_digits = 0;
				
		System.out.print("SIMPLE GAME\n");
		System.out.print("There are two types of games to play:\n");
		System.out.print("(1) Convert Time: will convert the given seconds to its corresponding time.\n");
		System.out.print("(2) Sum of Digits: will convert the given values to its corresponding sum.\n");
				
		System.out.print("\nPick a Game:\t");
		user_input = sc.nextInt();  
				
				
		if (user_input == 1) {
			System.out.print("Seconds:\t");
			user_seconds = sc.nextInt(); 
					
			String converted_value = simplegame.convertTime(user_seconds);
			System.out.print("Converted Time:\t" + converted_value);
		}
				
		else if (user_input == 2) {
			System.out.print("Digits:\t");
			user_digits = sc.nextInt(); 
					
			int sum_digits = simplegame.digitsSum(user_digits);
			System.out.print("Sum of Digits:\t" + sum_digits);
		}
				
		else {
			System.out.print("Input must be only one (1) or two (2). Please try again.");
		}
				
		sc.close();
	}	
}
