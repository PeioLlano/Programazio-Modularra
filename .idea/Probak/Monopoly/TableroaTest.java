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
import Monopoly.Parking;
import Monopoly.Tableroa;

public class TableroaTest {
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
	Jokalaria j1,j2;

	@Before
	public void setUp() throws Exception {
		t = Tableroa.getNireTableroa();
		j1 = new Jokalaria("Jokalaria1");
		j2 = new Jokalaria("Jokalaria2");
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
	public void testGetNireTableroa() {
		assertNotNull(t);
	}


	@Test
	public void testLortuKasilaZenbakiz() {
		//Sartutako zenbakiak kasilen zenbakiekin bat datoz
		assertEquals(t.lortuKasilaZenbakiz(9).getDeskribapena(),k9.getDeskribapena());
		assertEquals(t.lortuKasilaZenbakiz(13).getDeskribapena(),k13.getDeskribapena());
		assertEquals(t.lortuKasilaZenbakiz(2).getDeskribapena(),k2.getDeskribapena());
		assertEquals(t.lortuKasilaZenbakiz(31).getDeskribapena(),k31.getDeskribapena());
		
		//Sartutako zenbakiak ez datoz bat kasilen zenbakiekin
		assertNotEquals(t.lortuKasilaZenbakiz(7).getDeskribapena(),k4.getDeskribapena());
		assertNotEquals(t.lortuKasilaZenbakiz(20).getDeskribapena(),k12.getDeskribapena());
		assertNotEquals(t.lortuKasilaZenbakiz(3).getDeskribapena(),k13.getDeskribapena());
		assertNotEquals(t.lortuKasilaZenbakiz(2).getDeskribapena(),k14.getDeskribapena());
		assertNotEquals(t.lortuKasilaZenbakiz(1).getDeskribapena(),k5.getDeskribapena());
	}
}
