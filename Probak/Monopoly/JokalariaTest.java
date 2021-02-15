package Monopoly;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Jokalaria;
import Monopoly.Kalea;
import Monopoly.Tableroa;

public class JokalariaTest {
	private Jokalaria j1,j2;
	private Kalea k10, k11, k12, k16;
	private Tableroa t;

	@Before
	public void setUp() throws Exception {
		j1 = new Jokalaria("Jokalaria1");
		t = Tableroa.getNireTableroa();
		k10 = new Kalea("Glorieta de Bilbao", 10, 140, 10, "Urdina");
		k11 = new Kalea("Alberto Aguilera", 11, 140, 10, "Urdina");
		k12 = new Kalea("Fuencarral", 12, 160, 12, "Urdina");
		k16 = new Kalea("Calle Serrano", 16, 200, 16, "Horia");
		t.sartuKasila(k10);
		t.sartuKasila(k16);
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		j2 = null;	
		t = null;
		k10 = null;
		k11 = null;
		k12 = null;
		k16 = null;
	}

	@Test
	public void testJokalaria() {
		assertNotNull(j1);
		assertNull(j2);
	}

	@Test
	public void testGetTxandaKartzela() {
		//Ez dago kartzelan; txandaKartzela = 0;
		assertEquals(0,j1.getTxandaKartzela());
		
		//Kartzelan 1. dado jaurtiketa; txandaKartzela = 1;
		j1.gehituTxandaKartzela();
		assertEquals(1,j1.getTxandaKartzela());
		
		//Kartzelatik atera da; txandaKartzela = 0;
		j1.hasieratuTxandaKartzela();
		assertEquals(0,j1.getTxandaKartzela());
	}

	@Test
	public void testGetPosizioa() {
		//Hasierako posizioan; posizioa = 1;
		assertEquals(1,j1.getPosizioa());
		
		//Dadoan 5 bota; posizioa = 1 + 5 = 6;
		j1.gehituPosizioa(5);
		assertEquals(6,j1.getPosizioa());
		
		//Tableroko 32.zenbakitik aurrera ListaJokalariak klaseak
		//kudeatuko du egoera
	}

	@Test
	public void testAldatuPosizioa() {
		//Hasierako posizioan; posizioa = 1;
		assertEquals(1,j1.getPosizioa());
		
		//ZoazKartzelara kasilan erori; posizioa = 25
		j1.aldatuPosizioa(25);
		assertEquals(25,j1.getPosizioa());
		
		//Ondorioz Kartzela kasilara joan; posizioa = 9;
		j1.aldatuPosizioa(9);
		assertEquals(9,j1.getPosizioa());
	}

	@Test
	public void testGehituPosizioa() {
		//Hasierako posizioan; posizioa = 1;
		assertEquals(1,j1.getPosizioa());
		
		//Dadoan 5 bota; posizioa = 1 + 5 = 6;
		j1.gehituPosizioa(5);
		assertEquals(6,j1.getPosizioa());
		
		//Dadoan 8 bota; posizioa = 6 + 8 = 14;
		j1.gehituPosizioa(8);
		assertEquals(14,j1.getPosizioa());
	}

	@Test
	public void testHasieratuTxandaKartzela() {
		//Ez dago kartzelan; txandaKartzela = 0;
		assertEquals(0,j1.getTxandaKartzela());
				
		//Kartzelan 1. dado jaurtiketa; txandaKartzela = 1;
		j1.gehituTxandaKartzela();
		assertEquals(1,j1.getTxandaKartzela());
		
		//Kartzelan 2. dado jaurtiketa; txandaKartzela = 2;
		j1.gehituTxandaKartzela();
		assertEquals(2,j1.getTxandaKartzela());
				
		//Kartzelatik atera da; txandaKartzela = 0;
		j1.hasieratuTxandaKartzela();
		assertEquals(0,j1.getTxandaKartzela());
	}

	@Test
	public void testGehituTxandaKartzela() {
		//Ez dago kartzelan; txandaKartzela = 0;
		assertEquals(0,j1.getTxandaKartzela());
		
		//Kartzelan 1. dado jaurtiketa; txandaKartzela = 1;
		j1.gehituTxandaKartzela();
		assertEquals(1,j1.getTxandaKartzela());
	}

	@Test
	public void testKobratu() {
		//Partida hasierako egoera; diruKop = 1500; 
		assertEquals(1500,j1.getDiruKop());
		
		//500€ irabazi ditu jokalariak; diruKop = 2000;
		j1.kobratu(500);
		assertEquals(2000,j1.getDiruKop());
	}

	@Test
	public void testOrdaindu() {
		//Partida hasierako egoera; diruKop = 1500; 
		assertEquals(1500,j1.getDiruKop());
		
		//500€ galdu ditu jokalariak; diruKop = 1000;
		j1.ordaindu(500);
		assertEquals(1000,j1.getDiruKop());
	}

	@Test
	public void testNegatiboanNago() {
		//Partida hasierako egoera; diruKop = 1500 (POSITIBOA);
		assertEquals(1500,j1.getDiruKop());
		assertFalse(j1.negatiboanNago());
		
		//1600€ galdu ditu jokalariak; diruKop = -100 (NEGATIBOA);
		j1.ordaindu(1600);
		assertEquals(-100,j1.getDiruKop());
		assertTrue(j1.negatiboanNago());
	}
	
	@Test
	public void testSartuNireKaleetara() {
		//Partida hasierako egoera; propietateKop = 0;
		assertEquals(0,j1.propietateKopurua());
				
		//Calle Serrano erosi; propietateKop = 1;
		j1.sartuNireKaleetara(k16);
		assertEquals(1,j1.propietateKopurua());
				
		//Glorieta de Bilbao erosi; propietateKop = 2;
		j1.sartuNireKaleetara(k10);
		assertEquals(2,j1.propietateKopurua());
	}
	
	@Test
	public void testAteraNireKaleetatik() {
		//Partida hasierako egoera;  propietateKop = 0;`
		assertEquals(0,j1.propietateKopurua());
		
		//Hainbat propietate erosi; propietateKop = 2;
		j1.sartuNireKaleetara(k16);
		j1.sartuNireKaleetara(k10);
		assertEquals(2,j1.propietateKopurua());
		
		//Propietate bat saldu; propietateKop = 1;
		j1.ateraNireKaleetatik(k10);
		assertEquals(1,j1.propietateKopurua());
	}
	
	@Test
	public void testAberastasunaLortu() {
		//Partida hasierako egoera; diruKop = 1500€; propietateKop = 0 (0€);
		//Guztira 1500€;
		assertEquals(1500,j1.aberastasunaLortu());
		
		//Hainbat propietate erosi; diruKop = 1160€; propietateKop = 2 (340€);
		//Guztira 1500€; Bietan BAI erantzun
		k10.kasilaEgikaritu(j1);
		k16.kasilaEgikaritu(j1);
		assertEquals(1500,j1.aberastasunaLortu());
		
		//2000€ izango bagenitu; diruKop = 2000€; propietateKop = 2 (340€);
		//Guztira 2340€;
		j1.setDiruKop(2000);
		assertEquals(2,j1.propietateKopurua());
		assertEquals(2340,j1.aberastasunaLortu());
	}
	
	@Test
	public void testKoloreaInflazioa() {
		//Partida hasierako egoera; diruKop = 1500€; propietateKop = 0;
		j1.koloreaInflazioa();
		assertEquals(1500,j1.getDiruKop());
		
		//Hainbat propietate erosi; diruKop = 1220€; propietateKop = 2; 
		//KOLORE BEREKOAK baina 1 falta oraindik;
		k10.kasilaEgikaritu(j1);
		k11.kasilaEgikaritu(j1);
		j1.koloreaInflazioa();
		assertEquals(1220,j1.getDiruKop());
		assertEquals(10,k10.getOrdainduBeharrekoa());
		assertEquals(10,k11.getOrdainduBeharrekoa());
		
		//Propietate bat gehiago erosi; diruKop = 1060€; propietateKop = 3
		//KOLORE BEREKOAK, propietate guztiak erosita (*2 irabazi);
		k12.kasilaEgikaritu(j1);
		j1.koloreaInflazioa();
		assertEquals(1060,j1.getDiruKop());
		assertEquals(20,k10.getOrdainduBeharrekoa());
		assertEquals(20,k11.getOrdainduBeharrekoa());
		assertEquals(24,k12.getOrdainduBeharrekoa());
	}
	
	@Test
	public void testGarestienaLortu() {
		//Propietate bat erosi; diruKop = 1360€; propietateKop = 1;
		k10.kasilaEgikaritu(j1);
		assertEquals(1360,j1.getDiruKop());
		assertEquals(k10,j1.garestienaLortu());
		
		//Beste propietate bat erosi; diruKop = 1220€; propietateKop = 2;
		//Balio berekoak --> listan dagoen 1.a itzuli
		k11.kasilaEgikaritu(j1);
		assertEquals(1220,j1.getDiruKop());
		assertEquals(k10,j1.garestienaLortu());
		
		//Beste propietate bat erosi; diruKop = 1020€; propietateKop = 2;
		//k16 garestiagoa --> k16 itzuli
		k16.kasilaEgikaritu(j1);
		assertEquals(1020,j1.getDiruKop());
		assertEquals(k16,j1.garestienaLortu());	
	}
}
