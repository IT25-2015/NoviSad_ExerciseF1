import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		for(int i = 0; i < 10; i++)
		{
			frames.add(frame);
		}
		if(frames.size() > 10){
			throw new BowlingException();
		}
		else{
			frames.add(frame);
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		for(Frame fr : frames){
			if(fr.isStrike()){
				
			}
		}
	}
	
	// Returns the game score
	public int score(){
		boolean checkStrike = false;
		boolean checkDoubleStrike = false;
		boolean checkSpare = false;
		int score = 0;
		for(Frame fr : frames){
			if(checkStrike){
				if(checkDoubleStrike){
					score += fr.getFirstThrow();
					checkDoubleStrike = false;
				}
				score += fr.getFirstThrow() + fr.getSecondThrow();
				checkStrike = false;
			}
			else if(checkSpare){
				score += fr.getFirstThrow();
				checkSpare = false;
			}
			if(fr.isStrike()){
				checkStrike = true;
			}
			if(fr.isSpare()){
				checkSpare = true;
			}
		}
		return score;
	}
}
