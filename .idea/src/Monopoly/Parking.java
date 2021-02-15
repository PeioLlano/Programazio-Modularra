package Monopoly;

public class Parking extends Kasila {
	private int diruKop = 0;

	public Parking(String pDeskribapena, int pZenbakia) {
		super(pDeskribapena, pZenbakia);
	}

	//BAI
	public void diruKopEguneratu(int pDiru) {
		this.diruKop = this.diruKop + pDiru;
	}
	
	//BAI
	public void kasilaEgikaritu(Jokalaria pJokalaria) {
		pJokalaria.kobratu(this.diruKop);
		this.diruKop = 0;
	}
	
	//GETTER ETA SETTER-AK (test)
	public void setDiruKop(int pDiruKop) {
		this.diruKop = pDiruKop;
	}
	
	public int getDiruKop() {
		return this.diruKop;
	}
	
}
