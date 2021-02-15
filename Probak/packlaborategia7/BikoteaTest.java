package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BikoteaTest {
	Mutila m1,m2;
	Neska n1,n2;
	Bikotea b1,b2;
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
		b1 = new Bikotea(m1,n1);
		b2 = new Bikotea(m2,n2);
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
		b1 = null;
		b2 = null;
	}

	@Test
	public void testBikotea() {
		assertNotNull(b1);
		assertNotNull(b2);
	}

	@Test
	public void testBadago() {
		//Bikotea badago
		assertTrue(b1.badago(m1));
		assertTrue(b1.badago(n1));
		assertTrue(b2.badago(m2));
		assertTrue(b2.badago(n2));
		
		//Bikotea EZ dago
		assertFalse(b1.badago(m2));
		assertFalse(b1.badago(n2));
		assertFalse(b2.badago(m1));
		assertFalse(b2.badago(n1));
	}

}
