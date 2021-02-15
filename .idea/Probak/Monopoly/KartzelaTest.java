package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Jokalaria;
import Monopoly.Kartzela;

public class KartzelaTest {
    private Kartzela k1;
    private Jokalaria j1;
    private JoanKartzelera zk;
    private Tableroa t;
    
    @Before
    public void setUp() throws Exception {
    	k1 = new Kartzela("Kartzela",9);
    	zk = new JoanKartzelera("Zoaz Kartzelara", 25);
   	 	j1 = new Jokalaria("Ricky Rubio");
   	 	t = Tableroa.getNireTableroa();
   	 	t.sartuKasila(k1);
   	 	t.sartuKasila(zk);
    }

    @After
    public void tearDown() throws Exception {
   	 	k1 = null;
   	 	j1 = null;
   	 	zk = null;
    }

    @Test
    public void testKartzela() {
   	 	assertNotNull(k1);
    }
    
    @Test
    public void testSartuKartzelan() {
   	 	//Ez dago kartzelan; txandaKartzela = 0;
    	assertEquals(j1.getTxandaKartzela(),0);
    	
    	//Kartzelan bisita egiten...; txandaKartzela = 0;
    	k1.sartuKartzelan(j1);
    	k1.kasilaEgikaritu(j1);
    	assertEquals(j1.getTxandaKartzela(),0);
    	
   	 	//Zoaz Kartzelera kasilan erori da. txandaKartzela = 1;
   	 	zk.kasilaEgikaritu(j1);
   	 	assertEquals(j1.getTxandaKartzela(),1);
    }

    @Test
    public void testKasilaEgikaritu() {
    	//Kartzelan bisita egiten...; txandaKartzela = 0;
    	k1.sartuKartzelan(j1);
    	k1.kasilaEgikaritu(j1);
    	assertEquals(j1.getTxandaKartzela(),0);
    	
    	//TxandaKartzela < 4 (EZ atera)
    	//Zoaz Kartzelera kasilan erori da. txandaKartzela = 1;
   	 	zk.kasilaEgikaritu(j1);
   	 	assertEquals(j1.getTxandaKartzela(),1);

    	//Oraindik kartzelan dago
   	 	k1.kasilaEgikaritu(j1);
   	 	assertEquals(j1.getTxandaKartzela(),2);
   	 
   	 	//TxandaKartzela = 4 (BAI atera)
   	 	k1.kasilaEgikaritu(j1);
	 	assertEquals(j1.getTxandaKartzela(),3);
	 	k1.kasilaEgikaritu(j1);
	 	assertEquals(j1.getTxandaKartzela(),0);
    }
}
