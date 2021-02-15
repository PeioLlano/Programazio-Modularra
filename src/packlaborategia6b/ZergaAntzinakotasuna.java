package packlaborategia6b;

public class ZergaAntzinakotasuna extends KontzeptuZergak{
	private int urteKop;
	
	public ZergaAntzinakotasuna(int pZenbatekoGordina, double pZerga, int pUrteKop) {
		super(pZenbatekoGordina, pZerga);
		this.urteKop = pUrteKop;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		return ((this.getZenbatekoGordina()-this.getZenbatekoGordina()*super.getZerga())-10)*(this.urteKop/10);
	}
}
