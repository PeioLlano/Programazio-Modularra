package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MutilaTest {
	Mutila m1,m2;
	Neska n1,n2;
	
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
	}

	@Test
	public void testGehituPreferentzia() {
		//Gehitutako preferentzia neska da
		m1.gehituPreferentzia((Ikaslea)n1);
		m1.gehituPreferentzia((Ikaslea)n2);
		assertEquals(2,m1.getListaPreferentziak().getTamaina());
		
		m2.gehituPreferentzia((Ikaslea)n2);
		assertEquals(1,m2.getListaPreferentziak().getTamaina());
		
		//Gehitutako preferentzia EZ da neska (EZ GEHITU)
		m1.gehituPreferentzia(m2);
		assertEquals(2,m1.getListaPreferentziak().getTamaina());
		
		
	}

	@Test
	public void testMutila() {
		assertNotNull(m1);
		assertNotNull(m2);
	}

	@Test
	public void testOnartu() {
		
		m1.gehituPreferentzia((Ikaslea)n1);
		m1.gehituPreferentzia((Ikaslea)n2);
		
		m2.gehituPreferentzia((Ikaslea)n2);

		//Neska preferentzien barruan dago
		assertTrue(m1.onartu(n1));
		assertTrue(m1.onartu(n2));
		assertTrue(m2.onartu(n2));
		
		//Neska EZ dago preferentzien barruan
		assertFalse(m2.onartu(n1));

	}

}
