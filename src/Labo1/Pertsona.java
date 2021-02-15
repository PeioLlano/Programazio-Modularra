package Labo1;

public class Pertsona {
	//atributuak
	private String izenOsoa;
	private int adina;
	private int idPertsona;
	private char sexua;
	private String nazionalitatea;
	private String odolMota;
	
	//metodo eraikitzailea
	public Pertsona(String pIzenOsoa,int pAdina,int pIdPertsona,char pSexua,String pNazionalitatea,String pOdolMota) {
		this.izenOsoa=pIzenOsoa;
		this.adina=pAdina;
		this.idPertsona=pIdPertsona;
		this.nazionalitatea=pNazionalitatea;
		this.sexua=pSexua;
		this.odolMota=pOdolMota;
	}
	
	//set eta get metodoak
	public String izenOsoa() {
		return izenOsoa;
	}
	
	public void setIzenOsoa(String pIzenOsoa) {
		this.izenOsoa=pIzenOsoa;
	}
	
	public int getAdina() {
		return adina;
	}
	
	public void setAdina(int pAdina) {
		this.adina=pAdina;
	}
	
	public int getIdPertsona() {
		return idPertsona;
	}
	
	public void setIdPertsona(int pIdPertsona) {
		this.idPertsona=pIdPertsona;
	}
	
	public String getNazionalitatea() {
		return nazionalitatea;
	}
	
	public void setNazionalitatea(String pNazionalitatea) {
		this.nazionalitatea=pNazionalitatea;
	}
	
	public String getOdolMota() {
		return odolMota;
	}
	
	public void setOdolMota(String pOdolMota) {
		this.odolMota=pOdolMota;
	}
	
	public char getSexua() {
		return sexua;
	}
	
	public void setSexua(char pSexua) {
		this.sexua=pSexua;
	}
	
	//gainontzeko metodoak
	public boolean idBerdinaDu(Pertsona pPerts) {
		boolean emaitza;
		if (pPerts.idPertsona == this.idPertsona)
			emaitza=true;
		else
			emaitza=false;
		return (emaitza);
	}

	public boolean gidatuDazake() {
		boolean emaitza=false;
		if (this.nazionalitatea =="Etiopia") { 
			if (this.adina >= 14) {
				emaitza=true;}}
		 else if (this.nazionalitatea =="Australia" || this.nazionalitatea =="Estatu Batuak") { 
			if (this.adina >= 16) {
				emaitza=true;}}
		 else if (this.nazionalitatea =="Erresuna Batua") {
			if (this.adina >= 17) {
				emaitza=true;}}
	    	 else {
	    		if (this.adina >= 18) {
	    			emaitza=true;}}
		return (emaitza);
	}
	
	public boolean odolaEmandiezaioke(Pertsona pPerts) {
		boolean emaitza=false;
		if (pPerts.odolMota =="AB+") {
			emaitza=true;}
		if (pPerts.odolMota=="AB-") {
			if(this.odolMota=="O-"|| this.odolMota=="A-"||this.odolMota=="B-"||this.odolMota=="AB-") {
				emaitza=true;}}
		if (pPerts.odolMota=="A+") {
			if(this.odolMota=="O-"|| this.odolMota=="O+"||this.odolMota=="A+"||this.odolMota=="A-") {
				emaitza=true;}}
		if (pPerts.odolMota=="A-") {
			if(this.odolMota=="O-"|| this.odolMota=="A-") {
				emaitza=true;}}
		if (pPerts.odolMota=="B+") {
			if(this.odolMota=="O-"|| this.odolMota=="O+"||this.odolMota=="B-"||this.odolMota=="B+") {
				emaitza=true;}}
		if (pPerts.odolMota=="B-") {
			if(this.odolMota=="O-"|| this.odolMota=="B-") {
				emaitza=true;}}
		if (pPerts.odolMota=="O+") {
			if(this.odolMota=="O-"|| this.odolMota=="O+") {
				emaitza=true;}}
		if (pPerts.odolMota=="O-") {
			if(this.odolMota=="O-") {
				emaitza=true;}}
		return (emaitza);
	}

public void getIzenarenIniziala() {  
		System.out.println(this.izenOsoa.charAt(0));
	}
	
	public void getAbizenarenIniziala() {
		int i = 1;
		while (this.izenOsoa.charAt(i) != ' ') {
			i = i + 1;
		}
		System.out.println(this.izenOsoa.charAt(i+1));
	}
	
}
