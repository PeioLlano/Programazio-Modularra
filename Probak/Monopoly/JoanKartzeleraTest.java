package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.JoanKartzelera;
import Monopoly.Jokalaria;
import Monopoly.Kartzela;

public class JoanKartzeleraTest {
	private Jokalaria j1;
	private JoanKartzelera jk1;
	private Kartzela k1;
	private Tableroa t;
	
	@Before
	public void setUp() throws Exception {
		j1 = new Jokalaria("Kepa Sakolegi");
		jk1 = new JoanKartzelera("Joan Kartzelera",25);
		k1 = new Kartzela("Kartzela",9);
		t = Tableroa.getNireTableroa();
		t.sartuKasila(jk1);
		t.sartuKasila(k1);
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		jk1 = null;
	}

	@Test
	public void testJoanKartzelera() {
		assertNotNull(jk1);
	}

	@Test
	public void testKasilaEgikaritu() {
		//Partida hasierako egoera (kartzelatik kanpo); txandaKartzela = 0;
		assertEquals(j1.getTxandaKartzela(), 0);
		
		//Joan Kartzelara kasilan erori da (kartzelan); txandaKartzela = 1;
		jk1.kasilaEgikaritu(j1);
		assertEquals(j1.getTxandaKartzela(),1);
		
		//Oraindik kartzelan dihardu; txandaKartzela = 2;
		jk1.kasilaEgikaritu(j1);
		assertEquals(j1.getTxandaKartzela(),2);
	}
}
