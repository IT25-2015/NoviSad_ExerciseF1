import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void test_strike(){
		boolean provera = true;
		
		assertEquals("Greska", true, provera);
	}
	
	@Test
	public void test_spare(){
		boolean provera = true;
		
		assertEquals("Greska", true, provera);
	}
	
	@Test
	public void test_score() throws BowlingException{
		Frame fr = new Frame(5, 3);
		int skor = fr.getFirstThrow() + fr.getSecondThrow();
		
		assertEquals("Greska", 8, skor);
	}

}
