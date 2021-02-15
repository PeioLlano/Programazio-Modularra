 package packlaborategia6b;

public class KontzeptuEstrak extends KontzeptuZergak{
	
	private int orduKop;
	private double soldataOrduko;
	private String lanarenJustifikapena;
	
	public KontzeptuEstrak(int pZenbatekoGordina, double pZerga, String pLanarenJustifikapena, int pOrduKop, double pSoldataOrduko) {
		super(pZenbatekoGordina, pZerga);
		this.lanarenJustifikapena = pLanarenJustifikapena;
		this.orduKop = pOrduKop;
		this.soldataOrduko = pSoldataOrduko;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		super.setZerga(0.1);
		return (this.orduKop*this.soldataOrduko)-(this.orduKop*this.soldataOrduko*super.getZerga());
	}

}
