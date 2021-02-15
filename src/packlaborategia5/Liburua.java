package packlaborategia5;

public class Liburua
{
	
	// atributuak
	private String titulua;
	private String idazlea;
	private int idLiburua;

	// eraikitzailea
	public Liburua(String pTitulua, String pIdazlea, int pIdLiburua)
	{
		this.titulua = pTitulua;
		this.idazlea = pIdazlea;
		this.idLiburua = pIdLiburua;
	} 
	
	// beste metodoak
	
	public boolean idHauDu(int pIdLiburua)
	{
		boolean berdina = false;
		if (this.idLiburua == pIdLiburua) {
			berdina = true;
		}
		return berdina;
	}
	
	public boolean idBerdinaDute (Liburua pLiburua)
	{
		boolean berdina = false;
		if (this.idLiburua == pLiburua.idLiburua) {
			berdina = true;
		}
		return berdina;
	}
	
	public void inprimatu() {
		System.out.println("Titulua: " + this.titulua);
		System.out.println("Idazlea: " + this.idazlea);
		System.out.println("ID Liburua: " + this.idLiburua);	
	}

	public int getIdLiburua() {
		return this.idLiburua;
	}
	
}

