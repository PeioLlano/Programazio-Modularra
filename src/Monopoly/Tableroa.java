package Monopoly;

import java.util.ArrayList;
import java.util.Iterator;


public class Tableroa {
	private ArrayList<Kasila> lista;
	private static Tableroa nireTableroa;

	private Tableroa() {
		this.lista = new ArrayList<Kasila>();
	}
	
	public static Tableroa getNireTableroa() {
		if (nireTableroa == null) {
			nireTableroa = new Tableroa();	
	   		}
	   	return nireTableroa;
	}
	
	private Iterator<Kasila> getIteradorea() {
   		return this.lista.iterator();
	}
	
	//BAI
	public Kasila lortuKasilaZenbakiz(int pZenb) {
		Kasila k1 = null; 
		Iterator <Kasila> itr = getIteradorea();
		boolean aurkitua = false;
		
		while(itr.hasNext() && !aurkitua) {
			k1 = itr.next();
			if(k1.getZenbakia() == pZenb) {
				aurkitua = true;
			}
		}
		return k1;
	}

	//Ez dugu testeatu, Java-n dagoeneko inplementatuta dagoen metodo bat
	//besterik ez dugulako erabili
	public void sartuKasila(Kasila pKasila) {
		this.lista.add(pKasila);
	}
	
	//Ez dugu testeatu, Java-n dagoeneko inplementatuta dagoen metodo bat
	//besterik ez dugulako erabili
	public void erreseteatu() {
		this.lista.clear();
	}
}
