package packlaborategia6b;

public class ZergaHelbidea extends KontzeptuZergak{
	private String hiria;
	private int sukurtsalarenId;
	
	public ZergaHelbidea(int pZenbatekoGordina, double pZerga, String pHiria, int pSukurtsalarenId) {
		super(pZenbatekoGordina, pZerga);
		this.hiria = pHiria;
		this.sukurtsalarenId = pSukurtsalarenId;
	}
	
	public double ZenbatekoGarbiaKalkulatu() {
		return (this.getZenbatekoGordina()-this.getZenbatekoGordina()*super.getZerga())-50;
	}

}
