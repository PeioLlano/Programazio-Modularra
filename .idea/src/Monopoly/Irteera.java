package Monopoly;

public class Irteera extends Kasila {
	private int kobraketa = 200;

	public Irteera(String pDeskribapena, int pZenbakia) {
		super(pDeskribapena, pZenbakia);
	}

	//BAI
	public void kasilaEgikaritu(Jokalaria pJokalaria) {
		pJokalaria.kobratu(this.kobraketa);
	}
}
