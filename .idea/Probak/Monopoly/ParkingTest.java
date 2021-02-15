package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Jokalaria;
import Monopoly.Parking;

public class ParkingTest {
	private Parking p1;
	private Jokalaria j1;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Parking("Parking", 17);
		j1 = new Jokalaria("Kepa");
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		j1 = null;
	}

	@Test
	public void testParking() {
		assertNotNull(p1);
	}

	@Test
	public void testKasilaEgikaritu() {
		//Hasierako egoera: diruKop = 0 && jokalariaren dirua = 1500
		p1.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),1500);
		assertEquals(p1.getDiruKop(),0);
		
		//diruKop = 800 && jokalariaren dirua = 1500
		p1.setDiruKop(800);
		p1.kasilaEgikaritu(j1);
		assertEquals(j1.getDiruKop(),2300);
		assertEquals(p1.getDiruKop(),0);
	}

	@Test
	public void diruKopEguneratu() {
		//diruKop = 400€; 100€ gehitu
		p1.setDiruKop(400);
		p1.diruKopEguneratu(100);
		assertEquals(p1.getDiruKop(),500);
	}
}
