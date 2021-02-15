package packlaborategia8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LiburuaTest {
	private Liburua l1, l2;

	@Before
	public void setUp() throws Exception {

		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);
	}

	@After
	public void tearDown() throws Exception {
		l1 = null;
		l2 = null;
	}

	@Test
	public void testLiburua() {
		
		assertNotNull(l1);
		assertNotNull(l2);
	}

	@Test
	public void testIdHauDu() {
		
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		
		//idHauDu() = false;
		assertFalse(l1.idHauDu(22));
		
		
//idHauDu() = true;
		assertTrue(l1.idHauDu(44));
	}

	@Test
	public void testIdBerdinaDute() {
		
		l1 = new Liburua("Patatak", "Julen Fuentes", 44);
		l2 = new Liburua("Autobusak", "Peio Llano", 25);

		//idBerdinaDute() = false;
		assertFalse(l1.idBerdinaDute(l2));
		
		//idBerdinaDute() = true;
		l2 = new Liburua("Autobusak", "Peio Llano", 44);
		assertTrue(l1.idBerdinaDute(l2));

	}

	@Test
	public void testInprimatu() {
		l1.inprimatu();
	}

}

