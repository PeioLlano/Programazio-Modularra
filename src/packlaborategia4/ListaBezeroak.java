package packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBezeroak {
    // atributuak

    private ArrayList<Bezeroa> lista;
    private static ListaBezeroak nireListaBezeroak;

    // eraikitzailea singleton patroia aplikatu
    private ListaBezeroak() {
   	 this.lista = new ArrayList<Bezeroa>();
    }

    public static ListaBezeroak getNireListaBezeroak() {
   	 if (nireListaBezeroak == null) {
   		 nireListaBezeroak = new ListaBezeroak();
   	 }
   	 return nireListaBezeroak;
    }

    private Iterator <Bezeroa> getIteradorea() {
   	 return ListaBezeroak.getNireListaBezeroak().lista.iterator();
    }

    public Bezeroa bilatuBezeroaIdz(int pBezId) {
   	 // jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
   	 // horrelakorik, bestela null.
   	 boolean topatua=false;
   	 Iterator <Bezeroa> it = this.getIteradorea();
   	 Bezeroa bezeroBat = null;
   	 while (!topatua && it.hasNext()) {
   		 bezeroBat = it.next();
   		 if (bezeroBat.idBerdinaDu(pBezId)){
   			 topatua = true;
   		 }
   	 }
   	 if (topatua) {
   		 return bezeroBat;
   	 }
   	 else {
   		 return null;
   	 }
    }

    // gainontzeko metodoak
    public int bezeroKopurua() {
   	 return this.lista.size();
    }

    public void gehituBezero(int pIdBezero, String pIzenAbizena,
   		 String pPasahitza, double pSaldoa, boolean pBerezia) {
   	 // bezeroen zerrendan jasotzen duen bezero bat gehitzen du. Bezero hori
   	 // jadanik sartuta balego, mezu bat aterako du abisatzeko.
   	 Bezeroa b1 = new Bezeroa(pIdBezero, pIzenAbizena, pIzenAbizena, pSaldoa, pBerezia);
   	 if (this.bilatuBezeroaIdz(pIdBezero) != null) {
   		 System.out.print("ezin da gehitu jadanik badagoelako");
   	 }
   	 else {
   		 this.lista.add(b1);
   	 }
    }

    public void erreseteatu() {
    	ListaBezeroak.getNireListaBezeroak().lista.clear();
    }

}
