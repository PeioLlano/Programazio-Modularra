package packlaborategia6b;

public class KontzeptuLibrea extends Kontzeptua {
	private String deskribapena;
	private double orduKop;
	
	public KontzeptuLibrea(int pZenbatekoGordina, String pDeskribapena, double pOrduKop) {
		super(pZenbatekoGordina);
		this.deskribapena = pDeskribapena;
		this.orduKop = pOrduKop;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		return this.orduKop*super.getZenbatekoGordina();
	}

}
