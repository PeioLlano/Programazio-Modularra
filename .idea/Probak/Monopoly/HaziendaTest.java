package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Hazienda;
import Monopoly.Jokalaria;
import Monopoly.Parking;
import Monopoly.Tableroa;

public class HaziendaTest {
	Hazienda h1;
	Jokalaria j1;
	Parking p;
	Tableroa t;

	@Before
	public void setUp() throws Exception {
		h1 = new Hazienda("Hazienda", 31);
		j1 = new Jokalaria("Kepa Sakolegi");
		p = new Parking("Parking-a",17);
		t = Tableroa.getNireTableroa();
		t.sartuKasila(h1);
		t.sartuKasila(p);
	}

	@After
	public void tearDown() throws Exception {
		h1 = null;
		j1 = null;
		p = null;
	}
	
	@Test
	public void testHazienda() {
		assertNotNull(h1);
	}

	@Test
	public void testKasilaEgikaritu() {
		//Jokalariari -100€ (amaieran diru kopurua POSITIBOA)
		//Parking kasilako egungo dirua: 0€
		h1.kasilaEgikaritu(j1);
		assertEquals(1400,j1.getDiruKop());
		assertEquals(p.getDiruKop(),100);			
		
		//Jokalariari -100€ (amaieran diru kopurua NEGATIBOA)
		//Parking kasilako egungo dirua: 100€
		j1.setDiruKop(80);
		h1.kasilaEgikaritu(j1);
		assertEquals(-20,j1.getDiruKop());
		assertEquals(p.getDiruKop(),200);
	}
}
