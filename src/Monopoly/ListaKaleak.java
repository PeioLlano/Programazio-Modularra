package Monopoly;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaKaleak {
	private ArrayList<Kalea> nireKaleak;
	private ArrayList<String> nireKoloreak;
	
	public ListaKaleak() {
		this.nireKaleak = new ArrayList<Kalea>();
		this.nireKoloreak = new ArrayList<String>();
		this.nireKoloreak.add("Gorria");
		this.nireKoloreak.add("Geltokia");
		this.nireKoloreak.add("Berdea");
		this.nireKoloreak.add("Urdina");
		this.nireKoloreak.add("Horia");
		this.nireKoloreak.add("Morea");
		this.nireKoloreak.add("Laranja");
		this.nireKoloreak.add("Granatea");
		this.nireKoloreak.add("Arrosa");
	}
	
	private Iterator<Kalea> getIteradorea(){
		return this.nireKaleak.iterator();
	}
	
	private Iterator<String> getIteradoreaK(){
		return this.nireKoloreak.iterator();
	}
	
	//BAI
	public void sartuNireKaleetara(Kalea pKalea) {
		if(!this.nireKaleak.contains(pKalea)) {
			this.nireKaleak.add(pKalea);
		}
	}
	
	//BAI
	public void ateraNireKaleetatik(Kalea pKalea) {
		if(this.nireKaleak.contains(pKalea)) {
			this.nireKaleak.remove(pKalea);
		}
	}
	
	//BAI
	public int luzeraLortu() {
		return this.nireKaleak.size();
	}
	
	//BAI
	public int kaleenBalioa() {
		Kalea k1 = null;
		int i = 0;
		Iterator<Kalea> itr = this.getIteradorea();
		
		while(itr.hasNext()) {
			k1 = itr.next();
			i = i + k1.getPrezioa();					
		}
		return i;
	}
	
	//BAI
	public void koloreInflazioa() {
		Kalea k1 = null;
		String Kolorea;
		int i = 0;
		Iterator<String> itrK = this.getIteradoreaK();
		Iterator<Kalea> itr = this.getIteradorea();
		
		while(itrK.hasNext()) {
			Kolorea = itrK.next();
			while(itr.hasNext()) {
				k1 = itr.next();
				if(k1.getKolorea() == Kolorea) {
					i = i + 1;
				}
			}
			if(i == this.zenbatKolore(Kolorea)) {
				itr = this.getIteradorea();
				while(itr.hasNext()) {
					k1 = itr.next();
					if(k1.getKolorea() == Kolorea) {
						k1.setOrdainduBeharrekoa(k1.getOrdainduBeharrekoa()*2);
					}
				}
			}
			itr = this.getIteradorea();
			i = 0;
		}
	}
	
	private int zenbatKolore(String pKolorea) {
		int i = 0;
		if (pKolorea == "Gorria" || pKolorea == "Arrosa") {
			i = 2;
		}
		else if (pKolorea == "Geltokia") {
			i = 4;
		}
		else {
			i = 3;
		}
		return i;
	}
	//BAI
	public Kalea garestienaBueltatu() {
		Kalea k1,k2 = null;
		int i = 0;
		Iterator<Kalea> itr = this.getIteradorea();
		
		while(itr.hasNext()) {
			k1 = itr.next();
			if(k1.getPrezioa()>i) {
				k2 = k1;
				i = k2.getPrezioa();
			}
		}
		return k2;
	}
	
	public void erreseteatu() {
		this.nireKaleak.clear();
		this.nireKoloreak.clear();
	}
	
	//Testua inprimatzeko bakarrik
	public void inprimatuKaleak() {
		Kalea k1 = null;
		Iterator<Kalea> itr = this.getIteradorea();
		
		while(itr.hasNext()) {
			k1 = itr.next();
			System.out.print(k1.getDeskribapena()+", ");					
		}
	}
}
