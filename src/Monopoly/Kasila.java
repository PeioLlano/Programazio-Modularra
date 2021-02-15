package Monopoly;

public abstract class Kasila {
	private String deskribapena;
	private int zenbakia;
	
	public Kasila(String pDeskribapena, int pZenbakia) {
		this.deskribapena = pDeskribapena;
		this.zenbakia = pZenbakia;
	}
	
	public int getZenbakia() {
		return this.zenbakia;
	}
	
	public String getDeskribapena() {
		return this.deskribapena;
	}
	
	protected abstract void kasilaEgikaritu(Jokalaria pJokalaria);
}
