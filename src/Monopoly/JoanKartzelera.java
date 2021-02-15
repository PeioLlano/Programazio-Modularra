package Monopoly;

public class JoanKartzelera extends Kasila{
	
	public JoanKartzelera(String pDeskribapena, int pZenbakia) {
		super(pDeskribapena, pZenbakia);
	}
	
	private void zoazKartzelera(Jokalaria pJokalaria, Kartzela pKartzela) {
		pKartzela.sartuKartzelan(pJokalaria);
		pJokalaria.aldatuPosizioa(9);
		pJokalaria.gehituTxandaKartzela();
	}
	
	//BAI
	public void kasilaEgikaritu(Jokalaria pJokalaria) {
		Kasila k1 = Tableroa.getNireTableroa().lortuKasilaZenbakiz(9);
		this.zoazKartzelera(pJokalaria, (Kartzela) k1);
	}
	
}
