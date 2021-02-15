package packlaborategia6b;

public class ZergaErantzunkizuna extends KontzeptuZergak{
	private String erantzukizuna;
	
	public ZergaErantzunkizuna(int pZenbatekoGordina, double pZerga, String pErantzukizuna) {
		super(pZenbatekoGordina, pZerga);
		this.erantzukizuna = pErantzukizuna;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		return (this.getZenbatekoGordina()-this.getZenbatekoGordina()*super.getZerga())-20;
	}
}
