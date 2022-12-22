package exercism_projects;

/**
 * In this exercise we will simulate the first turn of a Blackjack game.
 * 
 * You will receive two cards and will be able to see the face up card of the dealer. All cards are represented using a string such as "ace", 
 * "king", "three", "two", etc. The values of each card are:
 * 
 * Card		Value		
 * ace		11			
 * two		2			
 * three	3			
 * four		4			
 * five		5			
 * six 		6			
 * seven	7			
 * eight	8
 * nine		9
 * ten		10
 * jack		10
 * queen	10
 * king		10
 * other	0
 * 
 * Commonly, aces can take the value of 1 or 11 but for simplicity we will assume that they can only take the value of 11.
 * 
 * Depending on your two cards and the card of the dealer, there is a strategy for the first turn of the game, 
 * in which you have the following options:
 * - Stand (S)
 * - Hit (H)
 * - Split (P)
 * - Automatically win (W) 
 * 
 * Although not optimal yet, you will follow the strategy your friend Alex has been developing, which is as follows:
 * Category: Large Hand
 * - If you have a pair of aces you must always split them.
 * - If you have a Blackjack (two cards that sum up to a value of 21), and the dealer does not have an ace, a figure or a ten then you 
 * automatically win. If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.
 * 
 * Category: Small Hand
 * - If your cards sum up to 17 or higher you should always stand.
 * - If your cards sum up to 11 or lower you should always hit.
 * - If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, 
 * in which case you should always hit.
 * 
 * @author 
 * Hannah Cailing
 */
public class conditionals_blackjack {
	
	/* calculate the score of any given card */
	public int parseCard (String card) {
		switch (card) {
			case "ace": return 11;
			case "king": return 10;
			case "queen": return 10;
			case "jack": return 10;
			case "ten": return 10;
			case "nine": return 9;
			case "eight": return 8;
			case "seven": return 7;
			case "six": return 6;
			case "five": return 5;
			case "four": return 4;
			case "three": return 3;
			case "two": return 2;
			default: return 0;
		}
	}
	
	/* determine if two cards make up a blackjack */
	public boolean isBlackjack (String card1, String card2) {
		if (card1 == "ace" && (card2 == "king" || card2 == "queen" || card2 == "jack" || card2 == "ten")) {
			return true; }
		
		else if ((card1 == "king" || card1 == "queen" || card1 == "jack" || card1 == "ten") && card2 == "ace") {
			return true; }
		
		else {
			return false; }
	}
	
	/* implement the decision logic for hand scores larger than 20 points */
	public String largeHand (boolean isBlackjack, int dealerScore) {
		if (isBlackjack == true && dealerScore < 10) {
			return "W"; }
		
		else if (isBlackjack == true && dealerScore >= 10) {
			return "S"; }
		
		else {
			return "P"; }
	}
	
	/* implement the decision logic for hand scores with less than 21 points */
	public String smallHand (int handScore, int dealerScore) {
		if (handScore >= 17) {
			return "S"; }
		
		else if (handScore <= 11) {
			return "H"; }
		
		else {
			if (dealerScore < 7) {
				return "S"; }
			
			else {
				return "H"; }
		}
	}
}
