package lab;
import  java.util.*;

public class Main {

	private static String testSpare = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testStrike = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testStrikeCount = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testSpareCount = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testMax = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testMin = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	
	private static String testManyPlayers = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	

	private static String test10thFrame = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testPlayersWrong = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testToManyPlayers = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testToFewPlayers = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	
	private static String testToManyBowls = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 

	private static String testRand1 = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	

	private static String testRand2 = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	

	private static String testRand3 = "2\r\n" +
			"[0,0][0,0]\r\n" + 
			"[3,/][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n" +
			"[0,0][0,0]\r\n"; 
	
	
	
	public static void main(String[] args) {
		
		//String bowler_log = "";
		//read file into bowler_log
		
		
		Parser prsr = new Parser(testSpare);
		ArrayList<Player> bowlers = prsr.getPlayers();
		printPlayers(bowlers);
	}
	
	private static void printPlayers(ArrayList<Player> bowlers){
		int indx = 1;
		for(Player bowler : bowlers){
			System.out.println("Player " + indx);
			System.out.println("Score " + bowler.getScore());
			System.out.println("Number of Strikes " + bowler.getNumStrikes());
			System.out.println("Number of Spares " + bowler.getNumSpares());
			System.out.println();
			indx++;
		}
		
	}

}

//TODO//
/*
* Log file read in (Pete)
* Player Bowling rules (Pete) TODO: Needs 10th frame parse 
* 
* Log file parsing (Robert) DONE.
* 
* error handling (both)
* construct test cases (both)
* style guide review (both)
*/
//TODO// 


/*
incorrect char
score above 9
missing bowl
Too many bowls in one frame
Too many frames
*/