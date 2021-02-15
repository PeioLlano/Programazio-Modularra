package packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEragiketak {

    //atributuak
    private ArrayList<Eragiketa> lista;
    private static ListaEragiketak nireListaEragiketak;

    // eraikitzailea
    private ListaEragiketak() {
   	 this.lista = new ArrayList<Eragiketa>();
    }

    // gainontzeko metodoak
    public static ListaEragiketak getListaEragiketak() {
   	 if (nireListaEragiketak == null) {
   		 nireListaEragiketak = new ListaEragiketak();
   	 }
   	 return nireListaEragiketak;
    }

    private Iterator<Eragiketa> getIteradorea() {
   	 return ListaEragiketak.getListaEragiketak().lista.iterator();
    }

    public int eragiketaKopurua() {
   	 return this.lista.size();
    }

    public void gehituEragiketa(int pId, int pIdBezeroa, String pPasaHitza,
   		 double pDiruKop) {
    	Eragiketa e1= new Eragiketa(pId,pIdBezeroa,pPasaHitza,pDiruKop);
    	if(bilatuEragiketaIdz(pId)==null) {
    		this.lista.add(e1);
    	}
    }
   	 

    public void erreseteatu() {
   	 ListaEragiketak.nireListaEragiketak = null;
    }

    public void eragiketaGuztiakBurutu() {
   	 Iterator <Eragiketa> it = this.getIteradorea();
   	 Eragiketa eragiketaBat = null;
   	 while (it.hasNext()) {
   		 eragiketaBat = it.next();
   		 eragiketaBat.eragiketaBurutu();
   	 }
    }

    public Eragiketa bilatuEragiketaIdz(int pEragId) {
   	 // jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
   	 // horrelakorik, bestela null.
   	 boolean topatua=false;
   	 Iterator <Eragiketa> it = this.getIteradorea();
   	 Eragiketa eragiketaBat = null;
   	 while (!topatua && it.hasNext()) {
   		 eragiketaBat = it.next();
   		 if (eragiketaBat.idBerdinaDu(pEragId)){
   			 topatua = true;
   		 }
   	 }
   	 if (topatua) {
   		 return eragiketaBat;
   	 }
   	 else {
   		 return null;
   	 }
    }
}

