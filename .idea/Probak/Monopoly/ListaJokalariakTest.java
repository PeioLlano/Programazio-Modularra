package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Hazienda;
import Monopoly.Irteera;
import Monopoly.JoanKartzelera;
import Monopoly.Jokalaria;
import Monopoly.Kalea;
import Monopoly.Kartzela;
import Monopoly.ListaJokalariak;
import Monopoly.Parking;
import Monopoly.Tableroa;

public class ListaJokalariakTest {

	private ListaJokalariak lj;
	private Jokalaria j1;
	private Jokalaria j2;
	private Jokalaria j3;
	private Jokalaria j4;
	private Tableroa t;
	private Irteera k1;
	private Kalea k2;
	private Kalea k3;
	private Hazienda k4;
	private Kalea k5;
	private Kalea k6;
	private Kalea k7;
	private Kalea k8;
	private Kartzela k9;
	private Kalea k10;
	private Kalea k11;
	private Kalea k12;
	private Kalea k13;
	private Kalea k14;
	private Kalea k15;
	private Kalea k16;
	private Parking k17;
	private Kalea k18;
	private Kalea k19;
	private Kalea k20;
	private Kalea k21;
	private Kalea k22;
	private Kalea k23;
	private Kalea k24;
	private JoanKartzelera k25;
	private Kalea k26;
	private Kalea k27;
	private Kalea k28;
	private Kalea k29;
	private Kalea k30;
	private Hazienda k31;
	private Kalea k32;

	@Before
	public void setUp() throws Exception {
		lj = ListaJokalariak.getNireListaJokalariak();
		j1 = new Jokalaria("Markel Rubiños");
		j2 = new Jokalaria("Julen Fuentes");
		j3 = new Jokalaria("Markel Aguirre");
		j4 = new Jokalaria("Peio Llano");
		lj.setJokalariKop(0);
		t = Tableroa.getNireTableroa();
		k1 = new Irteera("Irteera", 1);
		k2 = new Kalea("Ronda de Valencia", 2, 60, 2, "Gorria");
		k3 = new Kalea("Plaza de Lavapiés", 3, 60, 4, "Gorria");
		k4 = new Hazienda("Hazienda Forua 1", 4);
		k5 = new Kalea("Goya Tren Geltokia", 5, 200, 25, "Geltokia");
		k6 = new Kalea("Glorieta Cuatro Caminos", 6, 100, 6, "Berdea");
		k7 = new Kalea("Avenida Reina Victoria", 7, 100, 6, "Berdea");
		k8 = new Kalea("Calle Bravo Murillo", 8, 120, 8, "Berdea");
		k9 = new Kartzela("Kartzela", 9);
		k10 = new Kalea("Glorieta de Bilbao", 10, 140, 10, "Urdina");
		k11 = new Kalea("Alberto Aguilera", 11, 140, 10, "Urdina");
		k12 = new Kalea("Fuencarral", 12, 160, 12, "Urdina");
		k13 = new Kalea("Delicias Tren Geltokia", 13, 200, 25, "Geltokia");
		k14 = new Kalea("Avenida Felipe II", 14, 180, 14, "Horia");
		k15 = new Kalea("Calle Velazquez", 15, 180, 14, "Horia");
		k16 = new Kalea("Calle Serrano", 16, 200, 16, "Horia");
		k17 = new Parking("Parking-a", 17);
		k18 = new Kalea("Avenida de América", 18, 220, 18, "Morea");
		k19 = new Kalea("María de Molina", 19, 220, 18, "Morea");
		k20 = new Kalea("Cea Bermudez", 20, 240, 20, "Morea");
		k21 = new Kalea("Mediodía Tren Geltokia", 21, 200, 25, "Geltokia");
		k22 = new Kalea("Avenida Reyes Católicos", 22, 260, 22, "Laranja");
		k23 = new Kalea("Bailén", 23, 260, 22, "Laranja");
		k24 = new Kalea("Plaza España", 24, 280, 24, "Laranja");
		k25 = new JoanKartzelera("Zoaz Kartzelara", 25);
		k26 = new Kalea("Puerta del Sol", 26, 300, 26, "Granatea");
		k27 = new Kalea("Calle Alcalá", 27, 300, 26, "Granatea");
		k28 = new Kalea("Gran Vía", 28, 320, 28, "Granatea");
		k29 = new Kalea("Norte Tren Geltokia", 29, 200, 25, "Geltokia");
		k30 = new Kalea("Paseo de la Castellana", 30, 380, 32, "Arrosa");
		k31 = new Hazienda("Hazienda Forua 2", 31);
		k32 = new Kalea("Museo del Prado", 32, 400, 34, "Arrosa");	
		t.sartuKasila(k1);
		t.sartuKasila(k2);
		t.sartuKasila(k3);
		t.sartuKasila(k4);
		t.sartuKasila(k5);
		t.sartuKasila(k6);
		t.sartuKasila(k7);
		t.sartuKasila(k8);
		t.sartuKasila(k9);
		t.sartuKasila(k10);
		t.sartuKasila(k11);
		t.sartuKasila(k12);
		t.sartuKasila(k13);
		t.sartuKasila(k14);
		t.sartuKasila(k15);
		t.sartuKasila(k16);
		t.sartuKasila(k17);
		t.sartuKasila(k18);
		t.sartuKasila(k19);
		t.sartuKasila(k20);
		t.sartuKasila(k21);
		t.sartuKasila(k22);
		t.sartuKasila(k23);
		t.sartuKasila(k24);
		t.sartuKasila(k25);
		t.sartuKasila(k26);
		t.sartuKasila(k27);
		t.sartuKasila(k28);
		t.sartuKasila(k29);
		t.sartuKasila(k30);
		t.sartuKasila(k31);
		t.sartuKasila(k32);
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		j2 = null;
		j3 = null;
		j4 = null;
		lj.erreseteatu();
		k1 = null;
		k2 = null;
		k3 = null;
		k4 = null;
		k5 = null;
		k6 = null;
		k7 = null;
		k8 = null;
		k9 = null;
		k10 = null;
		k11 = null;
		k12 = null;
		k13 = null;
		k14 = null;
		k15 = null;
		k16 = null;
		k17 = null;
		k18 = null;
		k19 = null;
		k20 = null;
		k21 = null;
		k22 = null;
		k23 = null;
		k24 = null;
		k25 = null;
		k26 = null;
		k27 = null;
		k28 = null;
		k29 = null;
		k30 = null;
		k31 = null;
		k32 = null;
		t.erreseteatu();
	}

	@Test
	public void testPartidaBatJolastu() {
		lj.partidaBatJolastu();
	}

	@Test
	public void testGetNireListaJokalariak() {
		//Jokalari kop 1-4 tartekoa izango da
		lj = ListaJokalariak.getNireListaJokalariak();
		assertNotNull(lj);
	}

	
	//Gainontzeko metodoak public bezala jarri genituen probatzeko, 
	//eta ondo funtzionatzen zuela ziurtatzerakoan berriro pribatu
	//jarri genuen
	
	
	//@Test
	//public void testGehituJokalaria() {
		//lj.setJokalariKop(0);
	
		////JokalariKop = 0;
		//assertEquals(lj.getJokalariKop(),0);
		
		////JokalariKop = 1;
		//lj.gehituJokalaria(j1);
		//assertEquals(lj.getJokalariKop(),1);
		
		////JokalariKop = 2;
		//lj.gehituJokalaria(j2);
		//assertEquals(lj.getJokalariKop(),2);
		
		////JokalariKop = 3;
		//lj.gehituJokalaria(j3);
		//assertEquals(lj.getJokalariKop(),3);
		
		////JokalariKop = 4;
		//lj.gehituJokalaria(j4);
		//assertEquals(lj.getJokalariKop(),4);
	//}

	
	//@Test
	//public void testKenduJokalaria() {
		//lj.setJokalariKop(0);
	
		////JokalariKop = 4;
		//lj.gehituJokalaria(j1);
		//lj.gehituJokalaria(j2);
		//lj.gehituJokalaria(j3);
		//lj.gehituJokalaria(j4);
		//assertEquals(lj.getJokalariKop(),4);
		
		////JokalariKop = 3;
		//lj.kenduJokalaria(j1);
		//assertEquals(lj.getJokalariKop(),3);
		
		////JokalariKop = 2;
		//lj.kenduJokalaria(j2);
		//assertEquals(lj.getJokalariKop(),2);
		
		////JokalariKop = 1;
		//lj.kenduJokalaria(j3);
		//assertEquals(lj.getJokalariKop(),1);
		
		////JokalariKop = 0;
		//lj.kenduJokalaria(j4);
		//assertEquals(lj.getJokalariKop(),0);
	//}

	
	//@Test
	//public void testTxanda() {
		////2 JOKALARI
		//lj.setJokalariKop(0);
		
		//lj.gehituJokalaria(j1);
		//lj.gehituJokalaria(j2);
		
			///Txanda (Lehenengo ronda): j1
		//lj.setTxandaJok(0);
		//assertEquals(lj.getJokalariKop(),2);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j2
		//lj.setTxandaJok(1);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
		
			///Txanda (Bosgarren ronda): j1
		//lj.setTxandaJok(8);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Bosgarren ronda): j2
		//lj.setTxandaJok(9);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
		
		
		////3 JOKALARI
		
		
		//lj.gehituJokalaria(j3);
		
			///Txanda (Lehenengo ronda): j1
		//lj.setTxandaJok(0);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j2
		//lj.setTxandaJok(1);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j3
		//lj.setTxandaJok(2);
		//assertEquals(j3.getIzena(),lj.txanda().getIzena());
		
			///Txanda (Bosgarren ronda): j1
		//lj.setTxandaJok(12);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Bosgarren ronda): j2
		//lj.setTxandaJok(13);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
			///Txanda (Bosgarren ronda): j3
		//lj.setTxandaJok(14);
		//assertEquals(j3.getIzena(),lj.txanda().getIzena());
		
		
		////4 JOKALARI
		
		
		//lj.gehituJokalaria(j4);
		
			///Txanda (Lehenengo ronda): j1
		//lj.setTxandaJok(0);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j2
		//lj.setTxandaJok(1);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j3
		//lj.setTxandaJok(2);
		//assertEquals(j3.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j4
		//lj.setTxandaJok(3);
		//assertEquals(j4.getIzena(),lj.txanda().getIzena());
		
			///Txanda (Bosgarren ronda): j1
		//lj.setTxandaJok(16);
		//assertEquals(j1.getIzena(),lj.txanda().getIzena());
			///Txanda (Bosgarren ronda): j2
		//lj.setTxandaJok(17);
		//assertEquals(j2.getIzena(),lj.txanda().getIzena());
			///Txanda (Lehenengo ronda): j3
		//lj.setTxandaJok(18);
		//assertEquals(j3.getIzena(),lj.txanda().getIzena());
			///Txanda (Bosgarren ronda): j4
		//lj.setTxandaJok(19);
		//assertEquals(j4.getIzena(),lj.txanda().getIzena());
	//}

	
	//@Test
	//public void testIrabazleaLortu() {
		//lj.gehituJokalaria(j1);
		//lj.gehituJokalaria(j2);
		//lj.gehituJokalaria(j3);
		//lj.gehituJokalaria(j4);
		
		////j1-ek irabazi (bakoitzak 0 kale erosita)
		//j1.setDiruKop(1200);
		//j2.setDiruKop(450);
		//j3.setDiruKop(800);
		//j4.setDiruKop(210);
		//assertEquals(lj.irabazleaLortu(),j1);
		
		//j2-k irabazi (diru gutxiago, baina jabetza gehiago)
		//k28.kasilaEgikaritu(j2); //BAI erantzun
		//j1.setDiruKop(1200);
		//j2.setDiruKop(1100);
		//j3.setDiruKop(600);
		//j4.setDiruKop(210);
		//assertEquals(lj.irabazleaLortu(),j2);
	//}
	
	
	//@Test
	//public void testHonekGalduDu() {
		//lj.gehituJokalaria(j1);
		
		//j1.setDiruKop(650);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(26), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(28), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		
		//lj.honekGalduDu(j1);
		
		//j1.inprimatuJokalaria();
		
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		
		//lj.honekGalduDu(j1);
		
		//j1.inprimatuJokalaria();
		
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		//t.kasilarenEkintza(t.lortuKasilaZenbakiz(4), j1);
		
		//lj.honekGalduDu(j1);
		
		//System.out.println("Ya lo ha echado");
		//j1.inprimatuJokalaria();
	//}
	
	
	//@Test
	//public void testPartidaHasi() {
		//lj.setJokalariKop(0);
		
		//2, 3 eta 4 jokalari sartzen badituzu funtzionatzen du.
		//Izen hutsa sartzen badugu 3 aldiz defektuzko izena jartzen dizu.
		//2 jokalari sartu ostean guztiak dauden galdetzen hasten da (OK).
		//4 jokalari sartu ostean metodoa amaitzen da.
		
		// Test hau pasatzeko orden honetan sartu behar dira izenak
		//"Markel Rubiños","Julen Fuentes","Markel Aguirre","Peio Llano".
		//lj.partidaHasi();
		//assertEquals(lj.getJokalariKop(),4);
		
		//lj.setTxandaJok(0);

		//assertEquals("Markel Rubiños" ,lj.txanda().getIzena());
		
		//lj.setTxandaJok(1);
		
		//assertEquals("Julen Fuentes" ,lj.txanda().getIzena());
		
		//lj.setTxandaJok(2);
		
		//assertEquals("Markel Aguirre" ,lj.txanda().getIzena());
		
		//lj.setTxandaJok(3);
		
		//assertEquals("Peio Llano" ,lj.txanda().getIzena());
		
		//lj.setTxandaJok(4);
		
		//assertEquals("Markel Rubiños" ,lj.txanda().getIzena());
	//}

}
