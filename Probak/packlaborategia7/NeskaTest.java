package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NeskaTest {
	Mutila m1,m2;
	Neska n1,n2;
	ListaIkasleak pMutilAtzigarriak;
	
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
		pMutilAtzigarriak = new ListaIkasleak();
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
		n1.gehituPreferentzia((Ikaslea)m1);
		n1.gehituPreferentzia((Ikaslea)m2);
		assertEquals(2,n1.getListaPreferentziak().getTamaina());
		
		n2.gehituPreferentzia((Ikaslea)m1);
		assertEquals(1,n2.getListaPreferentziak().getTamaina());
		
		n1.gehituPreferentzia(n2);
		assertEquals(2,n1.getListaPreferentziak().getTamaina());
	}

	@Test
	public void testNeska() {
		assertNotNull(n1);
	}

	@Test
	public void testEnparejatu() {
		pMutilAtzigarriak.gehituIkaslea(m1);
		pMutilAtzigarriak.gehituIkaslea(m2);
		
		assertEquals(null,n1.enparejatu(pMutilAtzigarriak));
		
		n1.gehituPreferentzia(m1);
		n2.gehituPreferentzia(m2);
		m1.gehituPreferentzia(n1);
		m2.gehituPreferentzia(n2);
		n1.enparejatu(pMutilAtzigarriak);
		n2.enparejatu(pMutilAtzigarriak);
		
		assertEquals(m1,n1.enparejatu(pMutilAtzigarriak));
		assertEquals(m2,n2.enparejatu(pMutilAtzigarriak));
		
		n1.getListaPreferentziak().kenduIkaslea(m1);
		n1.gehituPreferentzia(m2);
		n2.getListaPreferentziak().kenduIkaslea(m2);
		n2.gehituPreferentzia(m1);
		m1.getListaPreferentziak().kenduIkaslea(n1);
		m1.gehituPreferentzia(n2);
		m2.getListaPreferentziak().kenduIkaslea(n2);
		m2.gehituPreferentzia(n1);
		
		n1.enparejatu(pMutilAtzigarriak);
		n2.enparejatu(pMutilAtzigarriak);
		
		assertEquals(m2,n1.enparejatu(pMutilAtzigarriak));
		assertEquals(m1,n2.enparejatu(pMutilAtzigarriak));
		



}
}
