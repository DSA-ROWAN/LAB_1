package lab;
import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	int numBowlers = 0;
	
	ArrayList<Player> plyrs = new ArrayList<Player>();
	

	public Parser(String bowler_log){
		Scanner log_scanner = new Scanner(bowler_log);
		Scanner line_scanner;
		if(log_scanner.hasNextLine()){
			line_scanner = new Scanner(log_scanner.nextLine());
			int numBowlers = 0;
			try{
				numBowlers = line_scanner.nextInt();
			}catch(NoSuchElementException excpt){
				System.out.println("LOG LINE FORMAT ERROR: The number of players on the first line of the log file is incorrect");
				log_scanner.close();
				line_scanner.close();
				return;
			}
			
			line_scanner.close();

			//String regex = "\\[(X)\\]|\\[([0-9],[0-9/])\\]|\\[(X,[0-9],[0-9/X])\\]|\\[([0-9],[0-9/],[0-9X])\\]|\\[(X,X,X)\\]";
			String regex = "\\[(X)\\]|\\[([^X\\[\\],]*?,[^X\\[\\],]*?)\\]|\\[([^\\[\\],]*?,[^\\[\\],]*?,[^\\[\\],]*?)\\]";
			String[][][] playerFrames = new String[numBowlers][10][];
			
			int currentFrame = 0;
			Pattern pattern = Pattern.compile(regex);
			
			while(log_scanner.hasNextLine()){
				if(currentFrame < 10){
					Matcher matcher = pattern.matcher(log_scanner.nextLine());
					int numMatches = 0;
			        while (matcher.find()) {
			        	numMatches++;
			        	if(numMatches <= numBowlers){
			        		String[] frame = null;
			        		for(int i = 1; i <= matcher.groupCount() & frame == null; i++){
			        			if(matcher.group(i) != null){
			        				if(i == 3 & currentFrame != 9){
			        					System.out.println("LOG LINE FORMAT ERROR: Too many bowls on log file line " + (currentFrame + 2)+". Player " + numMatches);
			        					frame = new String[]{"0","0"};
			        				}else if(i == 1 & !"X".equals(matcher.group(i))){
		        						System.out.println("LOG LINE FORMAT ERROR: Too few bowls on log file line " + (currentFrame + 2)+". Player " + numMatches);
		        						frame = new String[]{"0","0"};
		        					}else{
		        						frame = matcher.group(i).split(",");
		        					}
			        			}
			        		}
			        		playerFrames[numMatches-1][currentFrame] = frame;
			        	}else{
			        		System.out.println("LOG LINE FORMAT ERROR: Too many players on log file line " + (currentFrame + 2));
			        	}
			        	
			        }
			        if(numMatches <  numBowlers){
			        	System.out.println("LOG LINE FORMAT ERROR: Too few players on log file line " + (currentFrame + 2));
			        	
			        	for(;numMatches < numBowlers; numMatches++){
			        		playerFrames[numMatches][currentFrame] = new String[]{"0","0"};
			        	}
			        	
			        }
				}else{
					System.out.println("LOG LINE FORMAT ERROR: Too many frames in log file");
				}
				currentFrame++;
			}
			
			for(int i = 0; i < numBowlers; i++){
				plyrs.add(new Player(playerFrames[i]));
			}
			
		}else{
			System.out.println("LOG LINE FORMAT ERROR: The number of players on the first line of the log file is incorrect");
			log_scanner.close();
			return ;
		}
		
		log_scanner.close();
	}
	
	public ArrayList<Player> getPlayers() {
		
		//return player array
		return plyrs;
	}
	

}
