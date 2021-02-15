package Monopoly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Monopoly.Irteera;
import Monopoly.Jokalaria;

public class IrteeraTest {
    private Irteera i1;
    private Jokalaria j1;
    
    @Before
    public void setUp() throws Exception {
    	i1 = new Irteera("irteera",1);
   	 	j1 = new Jokalaria ("Markel");
    }

    @After
    public void tearDown() throws Exception {
   	 	i1 = null;
   	 	j1 = null;
    }

    @Test
    public void testIrteera() {
    	assertNotNull(i1);
    }

    @Test
    public void testKasilaEgikaritu() {
    	//Partida hasierako egoera; diruKop = 1500€
    	assertEquals(j1.getDiruKop(),1500);
    	
    	//Irteera kasilatik pasa; diruKop = 1500 + 200 = 1700€
   	 	i1.kasilaEgikaritu(j1);;
   	 	assertEquals(j1.getDiruKop(),1700);
    }
}