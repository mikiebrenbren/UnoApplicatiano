package statsinterface;

//import static org.junit.Assert.*;
import junit.framework.TestCase;

public class StatsTestCase extends TestCase{

	Player p1, p2, p3, p4, p5, p6, p7, p8;
	Team t1, t2;
	League l1;

	public void setUp() throws Exception {
			
	}


	public void tearDown() throws Exception {
	}

	public void testPlayer(){
		p1 = new Player();
		p1.setFirstName("Chipper");
		p1.setLastName("Jones");
		p1.setHomeruns(30);
		p1.setHits(500);
		p1.setStrikeouts(18);
		p1.setHits(500);
		p1.setStrikeouts(50);
		p1.setWalk(40);
		p1.setAtBats(1000);
		
		assertEquals(30, p1.getHomeruns());
		assertEquals(500, p1.getHits());
		assertEquals(1000, p1.getAtBats());
//		assertEquals(30.0, p1.getOBP(), 1.0); essentially testing difference between obp and average real difference is num of walks
//		assertEquals(30.0, p1.getAverage(), 1.0);
		
		
	}

}
