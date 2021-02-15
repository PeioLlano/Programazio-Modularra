package packlaborategia8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ErabiltzaileaTest {
	private Erabiltzailea e1, e2;
	private Liburua l1,l2,l3;

	@Before
	public void setUp() throws Exception {
		e1 = new Erabiltzailea ("Kepa Sakolegi", 87);
		e2 = new Erabiltzailea ("Dani Pedrosa", 26);
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);
		l3 = new Liburua("Telebistak", "Aritz Altuna", 94);
	}

	@After
	public void tearDown() throws Exception {
		e1 = null;
		e2 = null;
		l1 = null;
		l2 = null;
		l3 = null;
	}

	@Test
	public void testErabiltzailea() {
		assertNotNull(e1);
		assertNotNull(e2);
	}

	@Test
	public void testIdHauDu() {
		//idHauDu() = false;
		assertFalse(e1.idHauDu(24));
		
		//idHauDu() = true;
		assertTrue(e1.idHauDu(87));
	}

	@Test
	public void testIdBerdinaDute() {
		//idBerdinaDute = false;
		assertFalse(e1.idBerdinaDute(e2));
		
		//idBerdinaDute = true;
		e2.setIdErabiltzailea(87);
		assertTrue(e1.idBerdinaDute(e2));
	}

	@Test
	public void testMailegatzekoMaximoaGainditua() {
		//Liburu kopurua < 3 (false);
		e1.gehituLiburua(l1);
		e1.gehituLiburua(l2);
		assertFalse(e1.mailegatzekoMaximoaGainditua());
		
		//Liburu kopurua = 3 (true);
		e1.gehituLiburua(l3);
		assertTrue(e1.mailegatzekoMaximoaGainditua());
	}

	@Test
	public void testGehituLiburua() {		
		//Liburua ez dago;
		e1.gehituLiburua(l1);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),1);
		
		//Liburua badago;
		e1.gehituLiburua(l1);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),1);
	}

	@Test
	public void testKenduLiburua() {
		//Lista hutsa:
		e1.kenduLiburua(l1);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),0);
		
		//Lista ez-hutsa; Liburua ez dago;
		e1.gehituLiburua(l1);
		e1.kenduLiburua(l2);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),1);
		
		//Lista ez-hutsa: Liburua badago;
		e1.kenduLiburua(l1);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),0);
		
		e1.gehituLiburua(l1);
		e1.gehituLiburua(l2);
		e1.gehituLiburua(l3);
		e1.kenduLiburua(l2);
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),2);
	}

	@Test
	public void testMaileguanDu() {
		//Liburua ez dago;
		assertFalse(e1.maileguanDu(l1));
		
		//Liburua badago;
		e1.gehituLiburua(l1);
		assertTrue(e1.maileguanDu(l1));
	}
}
