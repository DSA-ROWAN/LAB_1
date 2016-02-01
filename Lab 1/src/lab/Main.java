package lab;
import  java.util.*;

public class Main {

	private static String test = "2\r\n" +
			"[1,1][2,1]\r\n" + 
			"[1,2][2,2]\r\n" +
			"[1,3][2,3]\r\n" +
			"[1,4][2,4]\r\n" +
			"[1,5][2,5]\r\n" +
			"[1,6][2,6]\r\n" +
			"[1,7][2,7]\r\n" +
			"[1,8][2,8]\r\n" +
			"[1,9][2,9]\r\n" +
			"[X,X,3][1,1]\r\n"; 
	
	
	public static void main(String[] args) {
		
		//String bowler_log = "";
		//read file into bowler_log
		
		
		Parser prsr = new Parser(test);
		ArrayList<Player> bowlers = prsr.getPlayers();
		printPlayers(bowlers);		
		//System.out.println("Done.");

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
* Log file read in (Pete) #TODO error checking
* Player Bowling rules (Pete) #TODO error checking pin
* 
* Log file parsing (Robert) #TODO regex
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