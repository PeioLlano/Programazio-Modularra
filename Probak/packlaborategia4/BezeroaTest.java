package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BezeroaTest {

    private Bezeroa b1;
    
    @Before
    public void setUp() throws Exception {
   	 b1 = new Bezeroa (147, "Julen Llano", "asf78asd", 22546.22, true);
    }

    @After
    public void tearDown() throws Exception {
   	 b1 = null;
    }

    @Test
    public void testBezeroa() {
   	 assertNotNull(b1);
    }

    @Test
    public void testBereziaDa() {
   	 //berezia = true;
   	 assertTrue(b1.bereziaDa());
   	 
   	 //berezia = false;
   	 b1 = new Bezeroa (147, "Julen Llano", "asf78asd", 22546.22, false);
   	 assertFalse(b1.bereziaDa());
    }

    @Test
    public void testIdBerdinaDu() {
   	 //pIdBezero = b1.idBezeroa;
   	 assertTrue(b1.idBerdinaDu(147));
   	 
   	 //pIdBezero != b1.idBezeroa;
   	 assertFalse(b1.idBerdinaDu(250));
    }

    @Test
    public void testSaldoaLortu() {
   	 //pasaHitzaBaieztatu = false; saldoa = 0.0;
   	 b1 = new Bezeroa (147, "Julen Llano", "asf78asd", 22546.22, true);
   	 assertEquals(b1.saldoaLortu("jad789ld"),0.0,0.0);
   	 
   	 //pasaHitzaBaieztatu = true; saldoa = 22546.22;
   	 assertEquals(b1.saldoaLortu("asf78asd"),22546.22,0.0);
    }

    @Test
    public void testSaldoaEguneratu() {
   	 //b1.saldoa >= pDiruKop;
   	 b1.saldoaEguneratu("asf78asd", 10000.00);
   	 assertEquals(b1.saldoaLortu("asf78asd"),12546.22,0.1);
   	 
   	 //b1.saldoa < pDiruKop;
   	 b1 = new Bezeroa(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 b1.saldoaEguneratu("asf78asd", 25200.22);
   	 assertEquals(b1.saldoaLortu("asf78asd"),22546.22,0.0);
    }
    
}
