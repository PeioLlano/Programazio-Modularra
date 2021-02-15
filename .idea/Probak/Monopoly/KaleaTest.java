package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Jokalaria;
import Monopoly.Kalea;

public class KaleaTest {
	Kalea k1, k2, k3, k4;
	Jokalaria j1,j2;

	@Before
	public void setUp() throws Exception {
		k1 = new Kalea("Plaza de Lavapiés", 3, 60, 4, "Gorria");
		k3 = new Kalea("Plaza España", 24, 280, 24, "Laranja");
		k4 = new Kalea("Calle Alcalá", 27, 300, 26, "Granatea");
		j1 = new Jokalaria("Jokalaria1");
		j2 = new Jokalaria("Jokalaria2");
	}

	@After
	public void tearDown() throws Exception {
		k1 = null;
		k2 = null;
		k3 = null;
		k4 = null;
	}

	@Test
	public void testKalea() {
		assertNotNull(k1);
		assertNotNull(k3);
		assertNotNull(k4);
		assertNull(k2);
	}

	@Test
	public void testJabeaKendu() {
		assertNull(k1.getJabea());
		k1.kasilaEgikaritu(j1); //BAI erantzun
		assertNotNull(k1.getJabea());
		k1.jabeaKendu(j1);
		assertNull(k1.getJabea());
	}
	
	@Test
	public void testKasilaEgikaritu() {
		//Kasila erosita dago; 
		//diruKop (J1) = 1500 - 4 = 1496€; 
		//diruKop (J2) = 1500 - 60 + 4 = 1444€
		k1.kasilaEgikaritu(j2);//BAI erantzun
		k1.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),1496);
		assertEquals(j2.getDiruKop(),1444);
		
		//Kasila EZ dago erosita; erosteko behar haina diru duzu (EZ erantzun)
		//diruKop (J1) = 1496€
		k3.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),1496);
				
		//Kasila EZ dago erosita; erosteko behar haina diru duzu (BAI erantzun)
		//diruKop (J1) = 1216€
		k3.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),1216);
		
		//Kasila EZ dago erosita; EZ duzu erosteko behar haina diru
		//diruKop (J1) = 80€
		j1.setDiruKop(80);
		k4.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),80);
	}
}
