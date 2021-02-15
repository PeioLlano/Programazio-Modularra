package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaBikoteakTest {
	Mutila m1,m2;
	Neska n1,n2;
	Bikotea b1,b2;
	ListaBikoteak lb1;
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
		b1 = new Bikotea(m1,n1);
		b2 = new Bikotea(m2,n2);
		lb1 = ListaBikoteak.getListaBikoteak();
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
		b1 = null;
		b2 = null;
		lb1.erreseteatu();
	}

	@Test
	public void testGetListaBikoteak() {
		assertNotNull(lb1);
	}

	@Test
	public void testGehituBikoteaModuOrdenatuan() {
		lb1.gehituBikoteaModuOrdenatuan(b1);
		lb1.gehituBikoteaModuOrdenatuan(b2);
		assertEquals(n1,lb1.lortuHonenBikotea(m1));
		assertEquals(n2,lb1.lortuHonenBikotea(m2));
	}

	@Test
	public void testLortuHonenBikotea() {
		lb1.gehituBikoteaModuOrdenatuan(b1);
		assertEquals(n1,lb1.lortuHonenBikotea(m1));
		
		lb1.gehituBikoteaModuOrdenatuan(b2);
		assertEquals(n2,lb1.lortuHonenBikotea(m2));
	}

	@Test
	public void testReajustatuBikoteak() {
		m1.gehituPreferentzia(n2);
		m2.gehituPreferentzia(n1);
		n1.gehituPreferentzia(m2);
		n2.gehituPreferentzia(m1);
		lb1.gehituBikoteaModuOrdenatuan(b1);
		lb1.gehituBikoteaModuOrdenatuan(b2);
		lb1.reajustatuBikoteak();
		assertEquals(m1,lb1.lortuHonenBikotea(n2));
		assertEquals(n1,lb1.lortuHonenBikotea(m2));
		
	}

	@Test
	public void testErreseteatu() {
		lb1.gehituBikoteaModuOrdenatuan(b1);
		lb1.erreseteatu();
		assertEquals(null,lb1.lortuHonenBikotea(m1));
	}

}
