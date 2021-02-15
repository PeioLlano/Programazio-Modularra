package packlaborategia8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaLiburuakTest {
	private Liburua l1,l2,l3;
	private ListaLiburuak lista;

	@Before
	public void setUp() throws Exception {
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);
		l3 = new Liburua("Telebistak", "Aritz Altuna", 94);
		lista = new ListaLiburuak();
		lista.gehituLiburua(l1);
	}

	@After
	public void tearDown() throws Exception {
		l1 = null;
		l2 = null;
		l3 = null;
		lista = null;
	}

	@Test
	public void testListaLiburuak() {
		assertNotNull(lista);
	}

	@Test
	public void testListarenTamaina() {
		assertEquals(lista.listarenTamaina(),1);
		
		lista.gehituLiburua(l2);
		lista.gehituLiburua(l3);
		assertEquals(lista.listarenTamaina(),3);
		
		lista.kenduLiburua(l1);
		assertEquals(lista.listarenTamaina(),2);	
	}

	@Test
	public void testBilatuLiburuaIdz() {
		assertEquals(lista.bilatuLiburuaIdz(44),l1);
		
		lista.gehituLiburua(l3);
		assertEquals(lista.bilatuLiburuaIdz(94),l3);
	}

	@Test
	public void testBadago() {
		assertTrue(lista.badago(l1));
		
		lista.kenduLiburua(l3);
		assertFalse(lista.badago(l3));
	}

	@Test
	public void testIdBerdinekoLibururikBaAlDa() {
		assertTrue(lista.idBerdinekoLibururikBaAlDa(l1));
		
		assertFalse(lista.idBerdinekoLibururikBaAlDa(l2));
		
		Liburua l4=new Liburua("Harry Potter", "JK Rowling", 94);
		lista.gehituLiburua(l4);
		assertTrue(lista.idBerdinekoLibururikBaAlDa(l3));
	}

	@Test
	public void testGehituLiburua() {
		assertEquals(lista.listarenTamaina(),1);
		
		lista.gehituLiburua(l2);
		lista.gehituLiburua(l3);
		assertEquals(lista.listarenTamaina(),3);
	}

	@Test
	public void testKenduLiburua() {
		assertEquals(lista.listarenTamaina(),1);
		
		lista.gehituLiburua(l2);
		lista.gehituLiburua(l3);
		assertEquals(lista.listarenTamaina(),3);
		
		lista.kenduLiburua(l1);
		assertEquals(lista.listarenTamaina(),2);	
	}

	@Test
	public void testInprimatu() {
		lista.inprimatu();
	}

}
