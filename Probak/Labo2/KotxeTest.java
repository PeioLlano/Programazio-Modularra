package Labo2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KotxeTest {
	private Pertsona p1;
	private Pertsona p2;
	private Kotxe k1;

	@Before
	public void setUp() throws Exception {
		p1 = new Pertsona("Peio Llano", 12, 047, 'G', "Etiopia", "A+");
		p2 = new Pertsona("Julen Fuentes", 15, 047, 'G', "Estatu Batuak", "A+");
		k1 = new Kotxe("1234 BCD","Seat Ibiza", null);

	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		k1 = null;
	}

	@Test
	public void testKotxe() {
		assertNotNull(p1);
		assertNotNull(p2);
		assertNotNull(k1);
	}

	@Test
	public void testAldatuJabea() {
		//Jabea: Null
		assertFalse(k1.jabeaAlDa(p1));
		
		//Jabea: p1
		k1.aldatuJabea(p1);
		assertTrue(k1.jabeaAlDa(p1));
		
		//Jabea: p2
		k1.aldatuJabea(p2);
		assertTrue(k1.jabeaAlDa(p2));
	}

}
