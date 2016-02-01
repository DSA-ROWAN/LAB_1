package lab;

public class Player {

	String[][] frames;
	int numSpares = 0;
	int numStrikes = 0;
	int score = 0;

	public Player(String[][] parsedFrames){
		
		this.frames = parsedFrames;
		for(int i = 0; i < frames.length - 1; i++){
			if("X".equals(frames[i][0])){
				score += 10 + getStrikeBonus(i);
			}else if("/".equals(frames[i][1])){
				score += 10 + getSpareBonus(i);
			}else{
				int bowlOne = toInt(frames[i][0]);
				int bowlTwo = toInt(frames[i][1]);
				score += bowlOne + bowlTwo;
			}
		}
		
		//tenth frame parse
		String[] frame = frames[frames.length - 1];
		
		int bScoreOne = 0;
		int bScoreTwo = 0;
		int bScoreThr = 0;
		
		if("X".equals(frame[0])){
			bScoreOne = toInt(frame[0]);
			bScoreTwo = toInt(frame[1]);
			try{
				if("/".equals(frame[2])){
					bScoreTwo = 0;
					bScoreThr = 10;
					numSpares++;
				}else if("X".equals(frame[2])){
					bScoreThr = 10;
					numStrikes++;
				}else{
					bScoreThr = toInt(frame[2]);
				}
			}catch(Exception excpt){
				bScoreThr = 0;
				System.out.println("Expecting third value in final frame");
			}
			numStrikes++;
		}else if("/".equals(frame[1])){
			bScoreOne = toInt(frame[0]);
			bScoreOne = 0;
			bScoreTwo = 10;
			bScoreThr = toInt(frame[2]);
			numSpares++;
		}else if("/".equals(frame[1])){
				bScoreTwo = 0;
				bScoreThr = 10;
				numSpares++;
		}else{
			bScoreOne = toInt(frame[0]);
			bScoreTwo = toInt(frame[1]);
		}
		//tenth frame parse
		score += bScoreOne + bScoreTwo + bScoreThr;//#TODO# TRY CATCH
	}
	
	//toInt(String bowlVal)
	//	parameters: takes one string to be converted to an int
	//	returns: if the value passed in is 0-9 or X it converts to the appropriate number. 
	//		Else an error is thrown like "[bowlVal]  is not a valid pin value"
	//	NOTE: will not convert spare directly i.e. don't pass in a "/"
	
	private int toInt(String bowlVal){
		int val = 0;
		try{
			 val = Integer.parseInt(bowlVal);
			 if(val > 9 || val < 0){
				 throw new NumberFormatException();
			 }
			 
		}catch(NumberFormatException excpt){
			if("X".equals(bowlVal)){
				val = 10;
			}else{
				System.out.println(bowlVal + " is not a valid pin value");
				val = 0;
			}
		}
		return val;
	}
	
	private int getStrikeBonus(int frameIndex){
		int bonus = 0;
		String bScoreOne = "";
		String bScoreTwo = "";
		
		if(frameIndex == 8){
			bScoreOne = frames[frameIndex + 1][0];
			bScoreTwo = frames[frameIndex + 1][1];
			
			
			if("/".equals(bScoreTwo)){
				bScoreTwo = Integer.toString(10 - toInt(bScoreOne));
			}
			
			bonus =  toInt(bScoreOne) + toInt(bScoreTwo);
		}else{

			bScoreOne = frames[frameIndex + 1][0];
			bScoreTwo = "";
					
			if("X".equals(bScoreOne)){			
				bScoreTwo = frames[frameIndex + 2][0];
				bonus =  toInt(bScoreOne) + toInt(bScoreTwo);
			}else{
				bonus =  "/".equals(frames[frameIndex + 1][1]) ? 10 : toInt(frames[frameIndex + 1][0]);
			}
		}
		numStrikes++;
		return bonus;
		
	}
	
	private int getSpareBonus(int frameIndex){
		int bonus = 0;
		
		String bScoreOne = frames[frameIndex + 1][0];
		bonus = toInt(bScoreOne);
		numSpares++;
		return bonus;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getNumStrikes(){
		return numStrikes;
		
	}
	
	public int getNumSpares(){
		return numSpares;
		
	}
	
	
	
	
}
