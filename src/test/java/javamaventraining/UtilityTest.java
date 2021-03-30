package javamaventraining;

import static org.junit.Assert.assertEquals;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class UtilityTest {
	
	private static final Logger logger = LogManager.getLogger(UtilityTest.class);

	Utility  u1;
	
	@Before
	public void setUp() throws Exception { 
		u1 =new Utility();
		logger.info("set up");
	}

	@After
	public void tearDown() throws Exception {
		u1 = null;
		logger.info("tearDown");
	}

	@Test
	public void testSum() {
		assertEquals(u1.sum(2, 4), 6);
	}

	@Test
	public void testProduct() {
		assertEquals(u1.product(2, 4), 8);
	}

	@Test
	public void testSquare() {
		assertEquals(u1.square(2), 4);
	}

	@Test
	public void testMean() {
		assertEquals(u1.mean(2, 4), 3);
	}

}
