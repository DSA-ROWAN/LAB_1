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
			
				int inc = bowlOne + bowlTwo;
				if(inc > 9){
					System.out.println("Frame Value " + inc + " in frame " + (i+1) + " is Illegal");
					inc = 0;
				}
				score += inc;
			}
		}
		
		//tenth frame parse
		String[] frame = frames[frames.length - 1];
		
		int bScoreOne = 0;
		int bScoreTwo = 0;
		int bScoreThr = 0;
		try{
			if("X".equals(frame[0])){
				numStrikes++;
				bScoreOne = toInt(frame[0]);
			}else{
				bScoreOne = toInt(frame[0]);
			}	
			
			if("X".equals(frame[1])){
				numStrikes++;
				bScoreTwo = toInt(frame[1]);
			}else if("/".equals(frame[1]) & !"X".equals(frame[0])){
				bScoreOne = 0;
				bScoreTwo = 10;
				numSpares++;
			}else{
				bScoreTwo = toInt(frame[1]);
			}	
			
			if("X".equals(frame[2])){
				numStrikes++;
				bScoreThr = toInt(frame[2]);
			}else if("/".equals(frame[2]) & (!"X".equals(frame[1]) & !"/".equals(frame[1]))){
				bScoreTwo = 0;
				bScoreThr = 10;
				numSpares++;
			}else{
				bScoreThr = toInt(frame[2]);
			}	
		}catch(ArrayIndexOutOfBoundsException except){
			switch (except.getMessage()) {
            case "0":  
            	bScoreOne = 0;
            	System.out.println("Not enough Bowls in line 10");
                     break;
            case "1":  
            	bScoreTwo = 0;
            	System.out.println("Not enough Bowls in line 10");
                     break;
            case "2":  
            	bScoreThr = 0;
            	if("/".equals(frame[1]) | "X".equals(frame[0])){
            		System.out.println("Not enough Bowls in line 10");
            	}
                     break;
        }		
			
		}
		
		score += bScoreOne + bScoreTwo + bScoreThr;
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
			 if(val > 9 | val < 0){
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
			try{
				bScoreTwo = frames[frameIndex + 1][1];
			}catch(ArrayIndexOutOfBoundsException excpt){
				System.out.println("Not enough Bowls in line 10");
				bScoreTwo = "0";
			}
			
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
