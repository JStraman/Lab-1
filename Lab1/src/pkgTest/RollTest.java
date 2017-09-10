package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			// COMPLETE: Make sure value of roll is between 1 and 12.
			// BUT How can a score be 1 if you are rolling two dice?
			assertTrue(r.getScore() >= 2 && r.getScore() <= 12);
			System.out.println(r.getScore());
		}

	}

}
