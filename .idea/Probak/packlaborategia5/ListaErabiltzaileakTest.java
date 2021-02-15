package packlaborategia5;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaErabiltzaileakTest {
	private Liburua l1,l2,l3;
	private Erabiltzailea e1, e2;
	private ListaErabiltzaileak le;
	
	@Before
	public void setUp() throws Exception {
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);
		l3 = new Liburua("Telebistak", "Aritz Altuna", 94);
		e1 = new Erabiltzailea ("Kepa Sakolegi", 87);
		e1.gehituLiburua(l1);
		e1.gehituLiburua(l2);
		e2 = new Erabiltzailea ("Dani Pedrosa", 26);
		e2.gehituLiburua(l3);
		le = ListaErabiltzaileak.getListaErabiltzaileak();		
		le.erabiltzaileariAltaEman(e1);
	}

	@After
	public void tearDown() throws Exception {
		le.erreseteatu();
		e1 = null;
		e2 = null;
		l1 = null;
		l2 = null;
		l3 = null;
	}

	@Test
	public void testGetListaErabiltzaileak() {
		assertNotNull(le);
	}

	@Test
	public void testErabiltzaileKopurua() {
		assertEquals(le.erabiltzaileKopurua(),1);
		
		le.erabiltzaileariAltaEman(e2);
		assertEquals(le.erabiltzaileKopurua(),2);
		
		le.erabiltzaileaBajaEman(e1.getIdErabiltzailea());
		le.erabiltzaileaBajaEman(e2.getIdErabiltzailea());
		assertEquals(le.erabiltzaileKopurua(),0);
	}

	@Test
	public void testBilatuErabiltzaileaIdz() {
		//BilatuErabiltzaileaIdz = null; 
		assertNull(le.bilatuErabiltzaileaIdz(26));
		
		//BilatuErabiltzaileaIdz = e1;
		assertEquals(le.bilatuErabiltzaileaIdz(87),e1);
	}

	@Test
	public void testBadagoIdBerdinekoErabiltzailerik() {
		//Erabiltzailea ez dago;
		assertFalse(le.badagoIdBerdinekoErabiltzailerik(e2));
		
		//Erabiltzailea badago;
		assertTrue(le.badagoIdBerdinekoErabiltzailerik(e1));
	}

	@Test
	public void testErabiltzaileariAltaEman() {
		assertEquals(le.erabiltzaileKopurua(),1);
		
		le.erabiltzaileariAltaEman(e2);
		assertEquals(le.erabiltzaileKopurua(),2);
	}

	@Test
	public void testErabiltzaileaBajaEman() {
		assertEquals(le.erabiltzaileKopurua(),1);
		
		le.erabiltzaileariAltaEman(e2);
		assertEquals(le.erabiltzaileKopurua(),2);
		
		le.erabiltzaileaBajaEman(e1.getIdErabiltzailea());
		le.erabiltzaileaBajaEman(e2.getIdErabiltzailea());
		assertEquals(le.erabiltzaileKopurua(),0);
	}

	@Test
	public void testNorkDaukaMaileguan() {
		assertEquals(le.norkDaukaMaileguan(l1),e1);
		
		le.erabiltzaileariAltaEman(e2);
		assertEquals(le.norkDaukaMaileguan(l3),e2);
	}

	@Test
	public void testInprimatu() {
		le.inprimatu();
	}

	@Test
	public void testErreseteatu() {
		le.erreseteatu();
    	assertEquals(le.erabiltzaileKopurua(),0);
	}

}

