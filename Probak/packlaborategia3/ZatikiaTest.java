package packlaborategia3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZatikiaTest {
	Zatikia z1,z2;

	@Before
	public void setUp() throws Exception {
		z1 = new Zatikia(2,3);
		z2 = new Zatikia(1,2);
	}

	@After
	public void tearDown() throws Exception {
		z1 = null;
		z2 = null;
	}

	@Test
	public void testZatikia() {
		assertNotNull(z1);
		assertNotNull(z2);
	}

	@Test
	public void testSinplifikatu() {

// Zenbakitzailea < 0; Izendatzailea < 0;
		z1 = new Zatikia(-2,-4);
		z1.sinplifikatu();
		assertEquals(z1.getZenbakitzailea(),1);
		assertEquals(z1.getIzendatzailea(),2);
		
		// Zenbakitzailea < 0; Izendatzailea > 0;
		z1 = new Zatikia(-2,4);
		z1.sinplifikatu();
		assertEquals(z1.getZenbakitzailea(),-1);
		assertEquals(z1.getIzendatzailea(),2);
		
		// Zenbakitzailea > 0; Izendatzailea < 0;
		z1 = new Zatikia(2,-4);
		z1.sinplifikatu();
		assertEquals(z1.getZenbakitzailea(),-1);
		assertEquals(z1.getIzendatzailea(),2);
		
		// Zenbakitzailea > 0; Izendatzailea > 0;
		z1 = new Zatikia(2,4);
		z1.sinplifikatu();
		assertEquals(z1.getZenbakitzailea(),1);
		assertEquals(z1.getIzendatzailea(),2);
	}
	
	@Test
	public void testGehitu() {
		assertEquals(z1.gehitu(z2).getZenbakitzailea(),7);
		assertEquals(z1.gehitu(z2).getIzendatzailea(),6);
		
		z1=new Zatikia(22,11);
		z2=new Zatikia(12,9);
		assertEquals(z1.gehitu(z2).getZenbakitzailea(),10);
		assertEquals(z1.gehitu(z2).getIzendatzailea(),3);
		
		z1=new Zatikia(24,32);
		z2=new Zatikia(9,33);
		assertEquals(z1.gehitu(z2).getZenbakitzailea(),45);
		assertEquals(z1.gehitu(z2).getIzendatzailea(),44);
		
		z1=new Zatikia(1,2);
		z2=new Zatikia(-1,2);
		assertEquals(z1.gehitu(z2).getZenbakitzailea(),0);
		assertEquals(z1.gehitu(z2).getIzendatzailea(),1);
	}

	@Test
	public void testKendu() {

		//z1 (negatibo); z2 (negatibo);
		z1 = new Zatikia(-3,5);
		z2 = new Zatikia(-1,10);
		assertEquals(z1.kendu(z2).getZenbakitzailea(),-1);
		assertEquals(z1.kendu(z2).getIzendatzailea(),2);

		//z1 (negatibo); z2 (positibo);
		z1=new Zatikia(-3,5);
		z2=new Zatikia(4,10);
		assertEquals(z1.kendu(z2).getZenbakitzailea(),-1);
		assertEquals(z1.kendu(z2).getIzendatzailea(),1);
		
		//z1 (positibo); z2 (negatibo);
		z1=new Zatikia(1,2);
		z2=new Zatikia(-1,2);
		assertEquals(z1.kendu(z2).getZenbakitzailea(),1);
		assertEquals(z1.kendu(z2).getIzendatzailea(),1);
		
		//z1 (positibo); z2 (positibo);
		z1=new Zatikia(1,2);
		z2=new Zatikia(1,2);
		assertEquals(z1.kendu(z2).getZenbakitzailea(),0);
		assertEquals(z1.kendu(z2).getIzendatzailea(),1);

	}

	@Test
	public void testBiderkatu() {

// z1 (negatibo); z2 (negatibo);
		z1 = new Zatikia(-3,2);
		z2 = new Zatikia(2,-4);
		assertEquals(z1.biderkatu(z2).getZenbakitzailea(),3);
		assertEquals(z1.biderkatu(z2).getIzendatzailea(),4);
		
		// z1 (negatibo); z2 (positibo);
		z1=new Zatikia(-1,2);
		z2=new Zatikia(1,2);
		assertEquals(z1.biderkatu(z2).getZenbakitzailea(),-1);
		assertEquals(z1.biderkatu(z2).getIzendatzailea(),4);
								
		// z1 (positibo); z2 (positibo);
		z1=new Zatikia(8,12);
		z2=new Zatikia(12,14);
		assertEquals(z1.biderkatu(z2).getZenbakitzailea(),4);
		assertEquals(z1.biderkatu(z2).getIzendatzailea(),7);
			
	}

	
@Test
	public void testZatitu() {

// z1 (positibo); z2 (negatibo);
		z1 = new Zatikia(3,2);
		z2 = new Zatikia(-4,3);
		assertEquals(z1.zatitu(z2).getZenbakitzailea(),-9);
		assertEquals(z1.zatitu(z2).getIzendatzailea(),8);	

		// z1 (negatibo); z2 (negatibo);
		z1 = new Zatikia(-3,2);
		z2 = new Zatikia(4,-3);
		assertEquals(z1.zatitu(z2).getZenbakitzailea(),9);
		assertEquals(z1.zatitu(z2).getIzendatzailea(),8);	

		// z1 (positibo); z2 (positibo);
		z1=new Zatikia(27,13);
		z2=new Zatikia(3,47);
		assertEquals(z1.zatitu(z2).getZenbakitzailea(),423);
		assertEquals(z1.zatitu(z2).getIzendatzailea(),13);
				
	}



	@Test
	public void testBerdinaDa() {
		
//z1 = z2 (biak positiboak);
		z1 = new Zatikia(1,2);
		z2 = new Zatikia(2,4);
		assertTrue(z1.berdinaDa(z2));
		
		//z1 = z2 (biak negatiboak);
		z1 = new Zatikia(-1,2);
		z2 = new Zatikia(2,-4);
		assertTrue(z1.berdinaDa(z2));
		
		//z1 != z2;
		z1 = new Zatikia(1,2);
		z2 = new Zatikia(2,3);
		assertFalse(z1.berdinaDa(z2));
	}



	@Test
	public void testHandiagoaDa() {
		
//z1 (positibo) < z2 (positibo);
		z1 = new Zatikia(1,3);
		z2 = new Zatikia(1,2);
		assertFalse(z1.handiagoaDa(z2));
				
		//z1 (negatibo) < z2 (positibo);
		z1 = new Zatikia(-1,3);
		z2 = new Zatikia(1,4);
		assertFalse(z1.handiagoaDa(z2));
		
		//z1 (positibo) > z2 (positibo);
		z1 = new Zatikia(5,4);
		z2 = new Zatikia(3,4);
		assertTrue(z1.handiagoaDa(z2));
				
		//z1 (positibo) > z2 (negatibo);
		z1 = new Zatikia(1,4);
		z2 = new Zatikia(1,-2);
		assertTrue(z1.handiagoaDa(z2));
	}


	@Test
	public void testTxikiagoaDa() {

		//z1 (positibo) < z2 (positibo);
		z1 = new Zatikia(1,3);
		z2 = new Zatikia(1,2);
		assertTrue(z1.txikiagoaDa(z2));
		
		//z1 (negatibo) < z2 (positibo);
		z1 = new Zatikia(-1,3);
		z2 = new Zatikia(1,4);
		assertTrue(z1.txikiagoaDa(z2));
		
		//z1 (positibo) > z2 (positibo);
		z1 = new Zatikia(5,4);
		z2 = new Zatikia(3,4);
		assertFalse(z1.txikiagoaDa(z2));
		
		//z1 (positibo) > z2 (negatibo);
		z1 = new Zatikia(1,4);
		z2 = new Zatikia(1,-2);
		assertFalse(z1.txikiagoaDa(z2));
	}

	@Test
	public void testIzendatzaileBerdinaDu() {

		//z1.Izendatzailea = z2.Izendatzailea;
		z1 = new Zatikia(5,2);
		z2 = new Zatikia(3,2);
		assertTrue(z1.izendatzaileBerdinaDu(z2));
		
		//z1.Zenbakitzailea = z2.Zenbakitzailea (sinplifikatuta);
		z1 = new Zatikia(8,6);
		z2 = new Zatikia(5,3);
		assertTrue(z1.izendatzaileBerdinaDu(z2));
		
		//z1.Zenbakitzailea != z2.Zenbakitzailea;
		z1 = new Zatikia(3,4);
		z2 = new Zatikia(1,3);
		assertFalse(z1.izendatzaileBerdinaDu(z2));
	}

	@Test
	public void testZenbakitzaileBerdinaDu() {

		//z1.Zenbakitzailea = z2.Zenbakitzailea;
		z1 = new Zatikia(1,2);
		z2 = new Zatikia(1,3);
		assertTrue(z1.zenbakitzaileBerdinaDu(z2));
		
		//z1.Zenbakitzailea (sinplifikatuta) = z2.Zenbakitzailea;
		z1 = new Zatikia(2,4);
		z2 = new Zatikia(1,3);
		assertTrue(z1.zenbakitzaileBerdinaDu(z2));
		
		//z1.Zenbakitzailea != z2.Zenbakitzailea;
		z1 = new Zatikia(7,4);
		z2 = new Zatikia(1,3);
		assertFalse(z1.zenbakitzaileBerdinaDu(z2));
	}


}