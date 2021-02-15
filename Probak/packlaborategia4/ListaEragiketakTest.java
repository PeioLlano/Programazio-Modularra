package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaEragiketakTest {
    
    private ListaEragiketak le1;
    private Eragiketa e1, e2, e3;
    private Bezeroa b1;
    private ListaBezeroak lb1;

    @Before
    public void setUp() throws Exception {
   	 le1 = ListaEragiketak.getListaEragiketak();
   	 e1 = new Eragiketa (24, 147, "asf78asd", 22546.22);
   	 e2 = new Eragiketa (47, 255, "jafd445a", 45416.85);
   	 e3 = new Eragiketa (71, 458, "adf85dda", 168570.47);
   	 b1 = new Bezeroa (147, "Julen Llano", "asf78asd", 22546.22, true);
   	 lb1 = ListaBezeroak.getNireListaBezeroak();
    }

    @After
    public void tearDown() throws Exception {
   	 //le1.erreseteatu();
   	 //lb1.erreseteatu();
   	 e1 = null;
   	 e2 = null;
   	 e3 = null;
   	 b1 = null;
    }

    @Test
    public void testGetListaEragiketak() {
   	 assertNotNull(le1);
    }

    @Test
    public void testEragiketaKopurua() {
   	 //ListaEragiketak = Hutsik;
   	 assertEquals(le1.eragiketaKopurua(),0);
   	 
   	 //ListaBezeroak = EZ Hutsik;
   	 le1.gehituEragiketa(24, 147, "asf78asd", 22546.22);
   	 le1.gehituEragiketa(47, 255, "jafd445a", 45416.85);
   	 le1.gehituEragiketa(71, 458, "adf85dda", 168570.47);
   	 assertEquals(le1.eragiketaKopurua(),3);
   	 le1.erreseteatu();
    }

    @Test
    public void testGehituEragiketa() {
   	 //e1 dagoeneko lista barruan;
   	 le1.gehituEragiketa(24, 147, "asf78asd", 22546.22);
   	 le1.gehituEragiketa(24, 147, "asf78asd", 22546.22);
   	 assertEquals(le1.eragiketaKopurua(),1);
   	 le1.erreseteatu();
   			 
   	 //e1 EZ dago lista barruan;
   	 le1.gehituEragiketa(24, 147, "asf78asd", 22546.22);
   	 le1.gehituEragiketa(47, 255, "jafd445a", 45416.85);
   	 assertEquals(le1.eragiketaKopurua(),2);
    }

    @Test
    public void testErreseteatu() {
   	 le1.erreseteatu();
   	 assertEquals(le1.eragiketaKopurua(),0);
    }

    @Test
    public void testEragiketaGuztiakBurutu() {
   	 lb1.gehituBezero(147, "Julen Llano", "asf78asd", 22546.22, true);
   	 double hasSaldB1 = b1.saldoaLortu("asf78asd");
   	 e1.eragiketaBurutu();
   	 assertTrue(b1.saldoaLortu("asf78asd")<hasSaldB1);
   	 
    }

    @Test
    public void testBilatuEragiketaIdz() {
   	 //emaitza = null;
   	 le1.gehituEragiketa(24, 147, "asf78asd", 22546.22);
   	 assertNull(le1.bilatuEragiketaIdz(47));
   	 
   	 //emaitza != null;
   	 assertNotNull(le1.bilatuEragiketaIdz(24));
    }

}

