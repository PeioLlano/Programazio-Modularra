package Monopoly;

public class Hazienda extends Kasila{
	private int ordainduBeharrekoa = 100;
	
	public Hazienda(String pDeskribapena, int pZenbakia) {
		super(pDeskribapena, pZenbakia);
	}
	
	//BAI
	public void kasilaEgikaritu(Jokalaria pJokalaria) {
		pJokalaria.ordaindu(this.ordainduBeharrekoa);
		Kasila k1 = Tableroa.getNireTableroa().lortuKasilaZenbakiz(17);
		((Parking) k1).diruKopEguneratu(this.ordainduBeharrekoa);
	}
}
