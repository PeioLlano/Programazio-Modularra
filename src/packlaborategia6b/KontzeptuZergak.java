package packlaborategia6b;

public class KontzeptuZergak extends Kontzeptua {
	private double zerga;
	
	public KontzeptuZergak(int pZenbatekoGordina, double pZerga) {
		super(pZenbatekoGordina);
		this.zerga= pZerga;
	}
	
	public double getZerga() {
		return zerga;
	}
	
	public void setZerga(double pZerga) {
		this.zerga = pZerga;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		return this.getZenbatekoGordina()-this.getZenbatekoGordina()*0.05;
	}
}
