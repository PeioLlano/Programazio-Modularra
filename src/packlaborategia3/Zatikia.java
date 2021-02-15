package packlaborategia3;

public class Zatikia implements IZatikia
{       //atributuak
	private int zenbakitzailea;
	private int izendatzailea;
	
	public Zatikia(int pZenb, int pIzen)
	{
		this.zenbakitzailea = pZenb;
		this.izendatzailea = pIzen;
		if (pIzen != 0)
			{
				this.sinplifikatu();
			}
		else
		{
			System.out.println("Ezin daiteke izendatzailearen balioa 0 izan dezakeen zatikirik sortu ...");
		}
	}
	
	public int getIzendatzailea() {
		return izendatzailea;
	}
	
	public int getZenbakitzailea() {
		return zenbakitzailea;
	}
		
	// metodo hau ezkutatzea komeni da, pribatua egitea!
	private int zkh()
	{/**
         /* zatitzaile komunetako handiena topatu*/
		int zkh = 0;
        for(int i = 1; i <= this.izendatzailea; i++)
        {
            if(this.izendatzailea % i == 0 && this.zenbakitzailea % i == 0) {
            	zkh = i;
            }
        }
        return(zkh);
	}
	
	public void sinplifikatu()
	{
		int zkh;
		if (this.izendatzailea < 0 && this.zenbakitzailea < 0) {
			this.zenbakitzailea = this.zenbakitzailea * (-1);
			this.izendatzailea = this.izendatzailea * (-1);
			zkh = this.zkh();
			this.zenbakitzailea = this.zenbakitzailea / zkh;
			this.izendatzailea = this.izendatzailea / zkh;
		}
		else if (this.zenbakitzailea < 0) {
			this.zenbakitzailea = this.zenbakitzailea * (-1);
			zkh = this.zkh();
			this.zenbakitzailea = this.zenbakitzailea * (-1) / zkh;
			this.izendatzailea = this.izendatzailea / zkh;
		}
		else if (this.izendatzailea < 0) {
			this.izendatzailea = this.izendatzailea * (-1);
			zkh = this.zkh();
			this.zenbakitzailea = this.zenbakitzailea * (-1) / zkh;
			this.izendatzailea = this.izendatzailea / zkh;
		}
		else {
			zkh = this.zkh();
			this.zenbakitzailea = this.zenbakitzailea / zkh;
			this.izendatzailea = this.izendatzailea / zkh;
		}
	}
		
	public Zatikia gehitu(Zatikia pZatikia)
	{
		Zatikia emaitza = new Zatikia(1,1);
		emaitza.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		this.zenbakitzailea = this.zenbakitzailea * (emaitza.izendatzailea / this.izendatzailea);
		pZatikia.zenbakitzailea = pZatikia.zenbakitzailea * (emaitza.izendatzailea / pZatikia.izendatzailea);
		emaitza.zenbakitzailea = this.zenbakitzailea + pZatikia.zenbakitzailea;
		emaitza.sinplifikatu();
		return(emaitza);
	}
	
	
	public Zatikia kendu(Zatikia pZatikia)
	{
		Zatikia emaitza = new Zatikia(1,1);
		emaitza.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		this.zenbakitzailea = this.zenbakitzailea * (emaitza.izendatzailea / this.izendatzailea);
		pZatikia.zenbakitzailea = pZatikia.zenbakitzailea * (emaitza.izendatzailea / pZatikia.izendatzailea);
		emaitza.zenbakitzailea = this.zenbakitzailea - pZatikia.zenbakitzailea;
		emaitza.sinplifikatu();
		return(emaitza);
	}
	
	public Zatikia biderkatu(Zatikia pZatikia)
	{
		Zatikia emaitza = new Zatikia(1,1);
		emaitza.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		emaitza.zenbakitzailea = this.zenbakitzailea * pZatikia.zenbakitzailea;
		emaitza.sinplifikatu();
		return(emaitza);
	}
	
	public Zatikia zatitu(Zatikia pZatikia)
	{
		Zatikia emaitza = new Zatikia(1,1);
		emaitza.izendatzailea = this.izendatzailea * pZatikia.zenbakitzailea;
		emaitza.zenbakitzailea = this.zenbakitzailea * pZatikia.izendatzailea;
		emaitza.sinplifikatu();
		return(emaitza);	
	}
	
	public boolean berdinaDa(Zatikia pZatikia)
	{
		boolean emaitza = false;
		Zatikia zat = new Zatikia(1,1);
		zat.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		this.zenbakitzailea = this.zenbakitzailea * (zat.izendatzailea / this.izendatzailea);
		pZatikia.zenbakitzailea = pZatikia.zenbakitzailea * (zat.izendatzailea / pZatikia.izendatzailea);
		this.izendatzailea = zat.izendatzailea;
		pZatikia.izendatzailea = zat.izendatzailea;
		if (this.zenbakitzailea == pZatikia.zenbakitzailea) {
			emaitza = true;
		}
		return emaitza;
	}
			
	public boolean handiagoaDa(Zatikia pZatikia)
	{
		boolean emaitza = false;
		Zatikia zat = new Zatikia(1,1);
		zat.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		this.zenbakitzailea = this.zenbakitzailea * (zat.izendatzailea / this.izendatzailea);
		pZatikia.zenbakitzailea = pZatikia.zenbakitzailea * (zat.izendatzailea / pZatikia.izendatzailea);
		this.izendatzailea = zat.izendatzailea;
		pZatikia.izendatzailea = zat.izendatzailea;
		if (this.zenbakitzailea > pZatikia.zenbakitzailea) {
			emaitza = true;
		}
		return emaitza;
	}
	
	public boolean txikiagoaDa(Zatikia pZatikia)
	{
		boolean emaitza = false;
		Zatikia zat = new Zatikia(1,1);
		zat.izendatzailea = this.izendatzailea * pZatikia.izendatzailea;
		this.zenbakitzailea = this.zenbakitzailea * (zat.izendatzailea / this.izendatzailea);
		pZatikia.zenbakitzailea = pZatikia.zenbakitzailea * (zat.izendatzailea / pZatikia.izendatzailea);
		this.izendatzailea = zat.izendatzailea;
		pZatikia.izendatzailea = zat.izendatzailea;
		if (this.zenbakitzailea < pZatikia.zenbakitzailea) {
			emaitza = true;
		}
		return emaitza;
	}
	
    public boolean izendatzaileBerdinaDu(Zatikia pZatikia){
        boolean emaitza = false;	
    	if (this.izendatzailea == pZatikia.izendatzailea){
			emaitza = true;
		}
    	return emaitza;
	}	
    public boolean zenbakitzaileBerdinaDu(Zatikia pZatikia){
        boolean emaitza = false;	
    	if (this.zenbakitzailea == pZatikia.zenbakitzailea){
			emaitza = true;
		}
    	return emaitza;
	}	
    
}

