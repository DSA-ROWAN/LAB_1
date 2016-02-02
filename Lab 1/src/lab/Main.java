package lab;
import  java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> tsts = new ArrayList<String>();
		//testSpare
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[3,/][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n"); 
		//testStrike
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[X][X]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n"); 
		//testStrikeCount and frame errors
		tsts.add("2\r\n" +
				"[X][3,4]\r\n" + 
				"[X][2,3]\r\n" +
				"[X][5,6]\r\n" +
				"[5,4][X]\r\n" +
				"[X][2,3]\r\n" +
				"[2,1][X]\r\n" +
				"[X][1,1]\r\n" +
				"[0,0][X]\r\n" +
				"[X][7,2]\r\n" +
				"[X][7,1]\r\n"); 
		//testSpareCount
		tsts.add("2\r\n" +
				"[1,/][9,/]\r\n" + 
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/][9,/]\r\n" +
				"[1,/,5][9,/,5]\r\n"); 
		//testMax
		tsts.add("2\r\n" +
				"[X][X]\r\n" + 
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X][X]\r\n" +
				"[X,X,X][X,X,X]\r\n"); 
		//testMin
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n"); 
		
		//testPlayersLow
		tsts.add("2\r\n" +
				"[1,1]\r\n" + 
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n" +
				"[1,1]\r\n"); 
		
		//testPlayersHigh                 
		tsts.add("2\r\n" +               
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n" +  
				"[1,1][1,1][1,1]\r\n");  
		
		//testTooManyPlayersInLine
		tsts.add("2\r\n" +
				"[1,1][1,1][1,1]\r\n" + 
				"[1,1][1,1][1,1]\r\n" +
				"[1,1][1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n" +
				"[1,1][1,1]\r\n"); 
		
	//testNumPlayers
			tsts.add("Q\r\n" +
					"[1,1][1,1][1,1]\r\n" + 
					"[1,1][1,1][1,1]\r\n" +
					"[1,1][1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n"); 
				
			//testNumPlayers2
			tsts.add("[1,1][1,1][1,1]\r\n" + 
					"[1,1][1,1][1,1]\r\n" +
					"[1,1][1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n" +
					"[1,1][1,1]\r\n"); 
		
		//testFewPlayersInLine
		tsts.add("2\r\n" +
				"[0,0]\r\n" + 
				"[3,/]\r\n" +
				"[0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n"); 
		//testToManyBowls
		tsts.add("2\r\n" +
				"[0,0,3][0,0,3]\r\n" + 
				"[3,/][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n"); 
		//testLastFrame1
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[X,X,X][X,1,/]\r\n"); 
		
		//testLastFrame2
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[1,/,X][X,/,1]\r\n"); 
		
		//testLastFrame3
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[X,X,1][1,1]\r\n"); 
		//testLastFrame4
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[1,X,X][1,X,1]\r\n"); 
		//testLastFrame5
		tsts.add("2\r\n" +
				"[0,0][0,0]\r\n" + 
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[0,0][0,0]\r\n" +
				"[X,X,1][1,1]\r\n"); 
		int indx = 1;
		for(String tst:tsts){
			System.out.println("TEST NUMBER " + indx);
			System.out.println("--------------------------------");
			Parser prsr = new Parser(tst);
			printPlayers(prsr.getPlayers());
			System.out.println("--------------------------------");
			indx++;
		}
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