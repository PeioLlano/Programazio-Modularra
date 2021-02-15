package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EragiketaTest {
    
    private Eragiketa e1;
    private ListaBezeroak lb1;

    @Before
    public void setUp() throws Exception {
   	 e1 = new Eragiketa (24, 147, "asf78asd", 10000.00);
   	 lb1 = ListaBezeroak.getNireListaBezeroak();
    }

    @After
    public void tearDown() throws Exception {
   	 e1 = null;
    }

    @Test
    public void testEragiketa() {
   	 assertNotNull(e1);
   	 lb1.erreseteatu();
    }

    @Test
    public void testIdBerdinaDu() {
   	 //pId = e1.id;
   	 assertTrue(e1.idBerdinaDu(24));
   	 
   	 //pId != e1.id;
   	 assertFalse(e1.idBerdinaDu(85));
    }

    @Test
    public void testEragiketaBurutu() {
   	 //idBezeroa = null;
   	 e1.eragiketaBurutu();
   	 assertEquals(e1.getDiruKop(),10000.00,0.0);
   	 
   	lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, false);
   	e1.eragiketaBurutu();
   	assertEquals(lb1.bilatuBezeroaIdz(147).saldoaLortu("asf78asd"),22546.22,0.1);
   	
   	 //idBezeroa != null; berezia = True;
   	 e1 = new Eragiketa (24, 147, "asf78asd", 10000.00);
   	 lb1.gehituBezero(e1.getIdBezeroa(), "Julen Llano", "asf78asd", 22546.22, false);
   	 e1.eragiketaBurutu();
   	 assertEquals(lb1.bilatuBezeroaIdz(147).saldoaLortu("asf78asd"),12546.22,0.1);
   	    	 
    }

}
