package packlaborategia4;

public class Eragiketa {
	// atributuak
	private int id;
	private int idBezeroa;
	private String pasaHitza;
	private double diruKop;
	private static double komisioa = 0.0001;

	// eraikitzailea
	public Eragiketa(int pId, int pIdBezeroa, String pPasaHitza, double pDiruKop) {
   	 this.id = pId;
  	      this.idBezeroa = pIdBezeroa;
  	      this.pasaHitza = pPasaHitza;
  	      this.diruKop = pDiruKop;
	}
    
	public int getIdBezeroa() {
   	 return idBezeroa;
    }

    public void setIdBezeroa(int pIdBezeroa) {
   	 this.idBezeroa = pIdBezeroa;
    }

    public double getDiruKop() {
   	 return diruKop;
    }

    public void setDiruKop(double pDiruKop) {
   	 this.diruKop = pDiruKop;
    }

    public double getKomisioa() {
   	 return komisioa;
    }

    public static void setKomisioa(double pKomisioa) {
   	 Eragiketa.komisioa = pKomisioa;
    }

    public String getPasaHitza() {
      	 return pasaHitza;
       }

    public void setPasaHitza(String pPasaHitza) {
      this.pasaHitza = pPasaHitza;
    }
	// gainotzeko metodoak
	public boolean idBerdinaDu(int pId) {
   	 boolean emaitza=false;
   	 if (this.id == pId) {
   		 emaitza=true;
   	 }
   	 return emaitza;    
	}

	 public void eragiketaBurutu() {
	    	double diruKendu;
	    	if(ListaBezeroak.getNireListaBezeroak().bilatuBezeroaIdz(this.idBezeroa) == null) {
	    		System.out.println(this.id + " operazioan, bezeroa ez da existitzen");
	    	}
	    	else {
	    		if (ListaBezeroak.getNireListaBezeroak().bilatuBezeroaIdz(this.idBezeroa).bereziaDa()) {
	    			diruKendu = ListaBezeroak.getNireListaBezeroak().bilatuBezeroaIdz(idBezeroa).saldoaLortu(this.pasaHitza) - this.diruKop;	
	    		}
	    		else {
	    			diruKendu = ListaBezeroak.getNireListaBezeroak().bilatuBezeroaIdz(idBezeroa).saldoaLortu(this.pasaHitza) - this.diruKop - (this.diruKop*this.getKomisioa());
	    		}	
	    		if (diruKendu >= 0 ) {
	    			ListaBezeroak.getNireListaBezeroak().bilatuBezeroaIdz(this.idBezeroa).saldoaEguneratu(this.pasaHitza,diruKendu);
	    		}
	    	}
	    }
	}


