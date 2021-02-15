package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaIkasleakTest {
	Mutila m1,m2;
	Neska n1,n2;
	ListaIkasleak l1;
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
		l1 = new ListaIkasleak();
		l1.gehituIkaslea(m1);
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
		l1 = null;
	}

	@Test
	public void testListaIkasleak() {
		assertNotNull(l1);
	}

	@Test
	public void testGehituIkaslea() {
		assertEquals(1,l1.getTamaina());
		
		l1.gehituIkaslea(m2);
		l1.gehituIkaslea(n1);
		assertEquals(3,l1.getTamaina());
		
		l1.kenduIkaslea(m1);
		assertEquals(2,l1.getTamaina());
		
		l1.kenduIkaslea(m2);
		l1.kenduIkaslea(n1);
		assertEquals(0,l1.getTamaina());
		
		l1.gehituIkaslea(m2);
		l1.gehituIkaslea(m2);
		assertEquals(1,l1.getTamaina());
		
		l1.gehituIkaslea(n1);
		l1.kenduIkaslea(n1);
		l1.kenduIkaslea(n1);
		assertEquals(1,l1.getTamaina());
		
	}

	@Test
	public void testKenduIkaslea() {
		assertEquals(1,l1.getTamaina());
		
		l1.kenduIkaslea(m1);
		assertEquals(0,l1.getTamaina());
		
		l1.gehituIkaslea(m1);
		l1.gehituIkaslea(m2);
		l1.gehituIkaslea(n1);
		l1.gehituIkaslea(n2);
		l1.kenduIkaslea(m2);
		assertEquals(3,l1.getTamaina());
	}

	@Test
	public void testBadago() {
		assertTrue(l1.badago(m1));
		
		l1.kenduIkaslea(m1);
		assertFalse(l1.badago(m1));
		
		l1.gehituIkaslea(m1);
		l1.gehituIkaslea(m2);
		l1.gehituIkaslea(n1);
		l1.gehituIkaslea(n2);
		assertTrue(l1.badago(n2));
	}

}
