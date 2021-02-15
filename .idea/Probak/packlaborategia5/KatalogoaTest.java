package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KatalogoaTest {
	private Katalogoa k1;
	private Liburua l1, l2, l3, l4;
	private ListaErabiltzaileak le;
	private Erabiltzailea e1, e2;

	@Before
	public void setUp() throws Exception {
		k1 = Katalogoa.getKatalogoa();
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);
		l3 = new Liburua("Telebistak", "Aritz Altuna", 94);
		l4 = new Liburua("Hegazkinak", "Charles Leclerc", 16);
		le = ListaErabiltzaileak.getListaErabiltzaileak();
		e1 = new Erabiltzailea ("Kepa Sakolegi", 87);
		e2 = new Erabiltzailea ("Dani Pedrosa", 26);
		le.erabiltzaileariAltaEman(e1);
		le.erabiltzaileariAltaEman(e2);
	}

	@After
	public void tearDown() throws Exception {
		k1.erreseteatu();
		l1 = null;
		l2 = null;
		l3 = null;
		l4 = null;
		e1 = null;
		e2 = null;
		le.erreseteatu();
	}

	@Test
	public void testGetKatalogoa() {
		assertNotNull(k1);
	}

	@Test
	public void testLiburuKopuru() {
		//Lista hutsa
		assertEquals(k1.liburuKopuru(),0);
		
		//Lista ez-hutsa
		k1.katalogatuLiburua(l1);
		assertEquals(k1.liburuKopuru(),1);
	}

	@Test
	public void testBilatuLiburuaIdz() {
		//liburua ez dago
		assertNull(k1.bilatuLiburuaIdz(44));
		
		//liburua badago
		k1.katalogatuLiburua(l1);
		assertEquals(k1.bilatuLiburuaIdz(44),l1);
	}

	@Test
	public void testMailegatuLiburua() {
		//Mailegatzeko maximoa EZ gainditua; 
		k1.katalogatuLiburua(l1);
		k1.mailegatuLiburua(l1.getIdLiburua(), e1.getIdErabiltzailea());
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),1);
		
		//Mailegatzeko maximoa gainditua;
		k1.katalogatuLiburua(l2);
		k1.katalogatuLiburua(l3);
		k1.katalogatuLiburua(l4);
		k1.mailegatuLiburua(l2.getIdLiburua(), e1.getIdErabiltzailea());
		k1.mailegatuLiburua(l3.getIdLiburua(), e1.getIdErabiltzailea());
		k1.mailegatuLiburua(l4.getIdLiburua(), e1.getIdErabiltzailea());
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),3);
		
		
	}

	@Test
	public void testItzuliLiburua() {
		k1.erreseteatu();
		k1.katalogatuLiburua(l1);
		k1.katalogatuLiburua(l2);
		k1.katalogatuLiburua(l3);
		k1.mailegatuLiburua(l1.getIdLiburua(), e1.getIdErabiltzailea());
		k1.mailegatuLiburua(l2.getIdLiburua(), e1.getIdErabiltzailea());
		assertTrue(e1.maileguanDu(l1));
		k1.itzuliLiburua(44);
		assertFalse(e1.maileguanDu(l1));
		assertEquals(e1.getLiburuMailegatuak().listarenTamaina(),1);
		assertEquals(k1.liburuKopuru(),3);
	}

	@Test
	public void testKatalogatuLiburua() {
		//Liburu bakarra: 1
		k1.katalogatuLiburua(l1);
		assertEquals(k1.liburuKopuru(),1);
		
		//Liburu kopurua: 1+
		k1.katalogatuLiburua(l2);
		assertEquals(k1.liburuKopuru(),2);
		
	}

	@Test
	public void testDeskatalogatuLiburua() {
		//Lista hutsa;
		k1.deskatalogatuLiburua(l1.getIdLiburua());
		assertEquals(k1.liburuKopuru(),0);
		
		//Lista ez-hutsa; Liburua ez dago;
		k1.katalogatuLiburua(l1);
		k1.katalogatuLiburua(l2);
		k1.deskatalogatuLiburua(l3.getIdLiburua());
		assertEquals(k1.liburuKopuru(),2);
		
		//Lista ez-hutsa; Liburua badago;
		k1.deskatalogatuLiburua(l1.getIdLiburua());
		assertEquals(k1.liburuKopuru(),1);
		
	}

	@Test
	public void testInprimatu() {
		k1.katalogatuLiburua(l1);
		k1.inprimatu();
	}

	@Test
	public void testErreseteatu() {
		k1.erreseteatu();
		assertEquals(k1.liburuKopuru(),0);
	}

}
