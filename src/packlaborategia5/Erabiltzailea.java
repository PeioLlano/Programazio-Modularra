package packlaborategia5;


public class Erabiltzailea
{
	//atributuak
	private int idErabiltzailea;
	private String izenOsoa;
	private int maxLiburuak;
	private ListaLiburuak liburuMailegatuak;
	
	//eraikitzailea
	
	public Erabiltzailea(String pIzenOsoa, int pIdErabiltzaile)
	{
		this.idErabiltzailea = pIdErabiltzaile;
		this.izenOsoa = pIzenOsoa;
		this.maxLiburuak = 3;
		this.liburuMailegatuak = new ListaLiburuak();
	}
	
	//get eta set metodoak
	
	public int getIdErabiltzailea() {
		return idErabiltzailea;
	}

	public void setIdErabiltzailea(int pIdErabiltzailea) {
		this.idErabiltzailea = pIdErabiltzailea;
	}
	
	public ListaLiburuak getLiburuMailegatuak() {
		return liburuMailegatuak;
	}

	public void setLiburuMailegatuak(ListaLiburuak pLiburuMailegatuak) {
		this.liburuMailegatuak = pLiburuMailegatuak;
	}
	
	// beste metodoak
	
	public boolean idHauDu(int pId)
	{
		boolean emaitza = false;
		if(this.idErabiltzailea == pId) {
			emaitza = true;
		}
		return emaitza;
	}
	
	public boolean idBerdinaDute(Erabiltzailea pErabiltzailea)
	{
		
		return this.idHauDu(pErabiltzailea.idErabiltzailea);
	}
	
	public boolean mailegatzekoMaximoaGainditua()
	{
		boolean emaitza = false;
		if (this.liburuMailegatuak.getLista().size() == this.maxLiburuak) {
			emaitza = true;
		}
		return emaitza;
	}
	
	public void gehituLiburua(Liburua pLiburua)
	{
		this.liburuMailegatuak.gehituLiburua(pLiburua);
	}
	
	public void kenduLiburua(Liburua pLiburua)
	{
		this.liburuMailegatuak.kenduLiburua(pLiburua);
	}
	
	public boolean maileguanDu(Liburua pLiburua)
	{
		boolean maileguan = false;
		if(this.liburuMailegatuak.badago(pLiburua)) {
			maileguan = true;
		}
		return maileguan;
	}
	
	public void inprimatu()
	{
		System.out.println("ID Erabiltzailea: " + this.idErabiltzailea);
		System.out.println("Izen Abizenak" + this.izenOsoa);
		System.out.println("Liburu kopuru maximoa" + this.maxLiburuak);
		this.liburuMailegatuak.inprimatu();
	}

}
