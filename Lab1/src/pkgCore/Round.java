package pkgCore;
import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>(); //<-- what's the point of the LinkedList?
	private int numberOfRolls;  // <--- I added this field

	public eGameResult geteGameResult() {
		return eGameResult;
	}
	
	public void seteGameResult(eGameResult eGameResult) {
		this.eGameResult = eGameResult;
	}

	public Round() {
		// COMPLETE: Execute Come Out roll, value ComeOutScore
		Roll r1 = new Roll();
		ComeOutScore = r1.getScore();
		
		// COMPLETE: Create a loop that will execute a roll until point is made, or
		// seven-out
		int i = 0;
		numberOfRolls = 1;
		
		if ((ComeOutScore >= 4 && ComeOutScore <=6) || (ComeOutScore >=8 && ComeOutScore <=10)) { 
			//^^^only rolling again if we didn't initially get craps or seven-out
			while (i != ComeOutScore && i != 7) {
				r1 = new Roll();
				i = r1.getScore();
				numberOfRolls++;
			}
		}
		
		// COMPLETE: value the eGameResult after the round is complete
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			seteGameResult(pkgCore.eGameResult.CRAPS);
		}
		else if (ComeOutScore == 7 || ComeOutScore == 11) {
			seteGameResult(pkgCore.eGameResult.NATURAL);
		}
		else if (i == 7) {
			seteGameResult(pkgCore.eGameResult.SEVEN_OUT);
		}
		else {
			seteGameResult(pkgCore.eGameResult.POINT);
		}
			
	}

	public int RollCount() {
		//COMPLETE: Return the roll count
		return numberOfRolls;
	}

}