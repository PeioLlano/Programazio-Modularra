package Monopoly;

import java.util.ArrayList;

public class Kartzela extends Kasila {
	private ArrayList<Jokalaria> kartzelatuak;
	private int txandak = 3;
	
	public Kartzela(String pDeskribapena, int pZenbakia) {
		super(pDeskribapena, pZenbakia);
		this.kartzelatuak = new ArrayList<Jokalaria>();	
	}
	
	//BAI
	public void sartuKartzelan(Jokalaria pJokalaria) {
		if(!this.kartzelanDago(pJokalaria)) {
			this.kartzelatuak.add(pJokalaria);
		}
	}
	
	private boolean kartzelanDago(Jokalaria pJokalaria) {
		return this.kartzelatuak.contains(pJokalaria);
	}
	
	//BAI
	public void kasilaEgikaritu(Jokalaria pJokalaria) {
		if(this.txandak == pJokalaria.getTxandaKartzela()) {
			this.kartzelatuak.remove(pJokalaria);
			pJokalaria.hasieratuTxandaKartzela();
		}
		else if(0 == pJokalaria.getTxandaKartzela()) {
			System.out.println("Kartzelan bisita egiten...");
		}
		else {
			pJokalaria.gehituTxandaKartzela();
		}
	}
}
