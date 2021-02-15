package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaIkasleakKurtsoTest {
	Mutila m1,m2;
	Neska n1,n2;
	ListaIkasleakKurtso lk1;
	Bikotea b1,b2;
	ListaBikoteak lb1;
	
	@Before
	public void setUp() throws Exception {
		lk1 = ListaIkasleakKurtso.getListaIkasleakKurtso();
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
		lk1.gehituIkasleaKurtsoan(m1);
		lb1 = ListaBikoteak.getListaBikoteak();
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
		lk1.erreseteatu();
		lb1.erreseteatu();
	}

	@Test
	public void testGetListaIkasleakKurtso() {
		assertNotNull(lk1);
	}

	@Test
	public void testGehituIkasleaKurtsoan() {
		//Ikaslea kurtsoan sartuta dago hasieratik
		assertEquals(m1,lk1.bilatuIkasleaNANez("55"));
		
		//Ikaslea EZ daude kurtsoan sartuta
		assertFalse(m2 == lk1.bilatuIkasleaNANez("54"));
		assertNull(lk1.bilatuIkasleaNANez("54"));
		assertFalse(n1 == lk1.bilatuIkasleaNANez("50"));
		assertNull(lk1.bilatuIkasleaNANez("50"));
		
		//Orain ikasleak kurtsoan sartuta daude
		lk1.gehituIkasleaKurtsoan(m2);
		lk1.gehituIkasleaKurtsoan(n1);
		assertEquals(m2,lk1.bilatuIkasleaNANez("54"));
		assertEquals(n1,lk1.bilatuIkasleaNANez("50"));
	}

	@Test
	public void testErreseteatu() {
		//Listan ez dago ikaslearik --> Ezin dira listan aurkitu
		lk1.erreseteatu();
		assertEquals(null,lk1.bilatuIkasleaNANez("55"));
		assertEquals(null,lk1.bilatuIkasleaNANez("54"));
		assertEquals(null,lk1.bilatuIkasleaNANez("50"));
		assertEquals(null,lk1.bilatuIkasleaNANez("77"));
	}

	@Test
	public void testBilatuIkasleaNANez() {
		//Ikaslea listan dago
		assertEquals(m1,lk1.bilatuIkasleaNANez("55"));
		
		//Ikasle hauek EZ daude listan (m2,n1,n2)
		assertEquals(null,lk1.bilatuIkasleaNANez("54"));
		assertEquals(null,lk1.bilatuIkasleaNANez("50"));
		assertEquals(null,lk1.bilatuIkasleaNANez("77"));
		
		//m2 eta n1 gehitu dira, baina n2 EZ
		lk1.gehituIkasleaKurtsoan(m2);
		lk1.gehituIkasleaKurtsoan(n1);
		assertEquals(m2,lk1.bilatuIkasleaNANez("54"));
		assertEquals(n1,lk1.bilatuIkasleaNANez("50"));
		assertEquals(null,lk1.bilatuIkasleaNANez("77"));
	}

	@Test
	public void testBadagoIkaslerikBikoterikGabe() {
		//Ikasle guztiak listan daude, baina m2-k eta n2-k ez dute bikoterik
		lk1.gehituIkasleaKurtsoan(m2);
		lk1.gehituIkasleaKurtsoan(n1);
		lk1.gehituIkasleaKurtsoan(n2);
		b1 = new Bikotea(m1,n1);
		lb1.gehituBikoteaModuOrdenatuan(b1);
		assertTrue(lk1.badagoIkaslerikBikoterikGabe());
		
		//Orain guztiek bikotea dute
		b2 = new Bikotea(m2,n2);
		lb1.gehituBikoteaModuOrdenatuan(b2);
		assertFalse(lk1.badagoIkaslerikBikoterikGabe());
	}

}

