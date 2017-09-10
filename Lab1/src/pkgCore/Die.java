package pkgCore;
import java.lang.Math;

// LAB 1 - CISC181 - FALL2017 - LAB SECTION 30 - LECTURE SECTION 11 - GROUP 4
// GROUP MEMBERS:
// Joseph Stramandinoli
// Victoria DeSpirito
// Thomas Carey
// Julianna DeCarousso   - Dropped Course
// Jason Kalaygian       - Dropped Course

/*Participation:
 *  We decided to individually work on parts of the lab, and then met up to collaborate on and produce one final version.
 *  Joe, Victoria, and Thomas all participated to adequate degrees.
 *  Julianna and Jason dropped the course.
 */


public class Die {

	private int DieValue;

	public Die() {
		// COMPLETE: Determine DieVaue.. a random number between 1 and 6
		DieValue = (int) (Math.random() * 6 + 1);
		
	}

	public int getDieValue() {
		return DieValue;
	}
}
