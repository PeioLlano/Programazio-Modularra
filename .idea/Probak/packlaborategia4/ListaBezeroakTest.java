package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaBezeroakTest {
    
    private ListaBezeroak lb1;
    private Bezeroa b1, b2, b3;

    @Before
    public void setUp() throws Exception {
   	 lb1 = ListaBezeroak.getNireListaBezeroak();
   	 b1 = new Bezeroa (147, "Julen Llano", "asf78asd", 22546.22, true);
   	 b2 = new Bezeroa (255, "Peio Fuentes", "jafd445a", 45416.85, true);
   	 b3 = new Bezeroa (458, "Kepa Sakolegi", "adf85dda", 168570.47, false);
    }

    @After
    public void tearDown() throws Exception {
   	 lb1.erreseteatu();
   	 b1 = null;
   	 b2 = null;
   	 b3 = null;
    }

    @Test
    public void testGetNireListaBezeroak() {
   	 assertNotNull(lb1);
    }

    @Test
    public void testBilatuBezeroaIdz() {
   	 //emaitza = null;
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 assertNull(lb1.bilatuBezeroaIdz(125));
   	 
   	 //emaitza != null;
   	 assertNotNull(lb1.bilatuBezeroaIdz(147));
   	 
    }

    @Test
    public void testBezeroKopurua() {
   	 //ListaBezeroak = Hutsik;
   	 assertEquals(lb1.bezeroKopurua(),0);
   	 
   	 //ListaBezeroak = EZ Hutsik;
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 lb1.gehituBezero(255, "Peio Fuentes", "jafd445a", 45416.85, true);
   	 lb1.gehituBezero(458, "Kepa Sakolegi", "adf85dda", 168570.47, false);
   	 assertEquals(lb1.bezeroKopurua(),3);
    }
   	 
   	 

    @Test
    public void testGehituBezero() {
   	 //b1 dagoeneko lista barruan;
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 assertEquals(lb1.bezeroKopurua(),1);
   	 
   	 //b1 EZ dago lista barruan;
   	 lb1.gehituBezero(255, "Peio Fuentes", "jafd445a", 45416.85, true);
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 assertEquals(lb1.bezeroKopurua(),2);
    }

    @Test
    public void testErreseteatu() {
    	lb1.erreseteatu();
    	assertEquals(lb1.bezeroKopurua(),0);
    }

}
