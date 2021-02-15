package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Dadoa;

public class DadoaTest {
	private Dadoa d1;
	
	@Before
	public void setUp() throws Exception {
		d1 = Dadoa.getNireDadoa();
	}

	@After
	public void tearDown() throws Exception {
		d1 = null;
	}

	@Test
	public void testBotaDadoa() {
		//Ausaz dadoarekin zenbaki bat lotuko 
		int i = d1.botaDadoa();
		assertTrue(i>=1 && i<=6);
		assertTrue(i>=1 && i<=6);
		assertTrue(i>=1 && i<=6);
		assertTrue(i>=1 && i<=6);
		assertTrue(i>=1 && i<=6);
		assertTrue(i>=1 && i<=6);
	}

}
