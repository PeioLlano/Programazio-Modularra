package packlaborategia4;

import java.text.DecimalFormat;

public class Bezeroa {
    // atributuak
    private int idBezeroa;
    private String izenAbizena;
    private String pasaHitza;
    private double saldoa;
    private boolean berezia;
    
    // eraikitzailea
    public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza, double pSaldoa, boolean pBerezia) {
  	      this.idBezeroa = pId;
   	 this.izenAbizena = pIzenAbizena;
   	 this.pasaHitza = pPasaHitza;
   	 this.saldoa = pSaldoa;
   	 this.berezia = pBerezia;
    }

    public int getIdBezeroa() {
   	 return idBezeroa;
    }

    public void setIdBezeroa(int pIdBezeroa) {
   	 this.idBezeroa = pIdBezeroa;
    }

    public boolean bereziaDa() {
   	 boolean emaitza=false;
   	 if (this.berezia) {
   		 emaitza = true;
   	 }
   	 return emaitza;
    }

    public boolean idBerdinaDu(int pIdBezero) {
   	 boolean emaitza=false;
   	 if (this.idBezeroa == pIdBezero) {
   		 emaitza = true;
   	 }
    return emaitza;
    }

    public double saldoaLortu(String pPasaHitza) {
   	 // Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
   	 // konprobatzen du. PasaHitza okerra bada 0.0 bueltatuko du
   	 if (this.pasaHitzaBaieztatu(pPasaHitza)) {
   		 System.out.print(this.izenAbizena + ", zure saldoa " + this.saldoa + " da" );
   		 return this.saldoa;
   	 }
   	 else {
  		      System.out.print(this.izenAbizena + ", pasahitza okerra");
   		 return 0.0;
   	 }
    }

    // gainontzeko metodoak
    private boolean pasaHitzaBaieztatu(String pPasaHitza) {
   	 // gorago komentatu denez boolear bat bueltatuko du, jasotzen duen
   	 // pasahitza eta bezeroarena kointzidentzien dutenean.
   	 boolean emaitza=false;
   	 if (this.pasaHitza == pPasaHitza) {
   		 emaitza=true;
   	 }
   	 return emaitza;
    }

    public void saldoaEguneratu(String pPasaHitza, double pDiruKop) {
    	// Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
    	// konprobatzen du. Gero, parametro bezala duen diru kopurua bezeroaren
    	// saldoa baino handiagoa ez izatea baieztatzen du, eta horrela ez
    	// balitz, saldoa ez luke ukituko. Edozein kasutan, pantailatik mezu bat
    	// bueltatuko du burutu den eragiketa ondo ala txartu bukatu den
    	// adierazteko. Ondo burutu bada,zure saldo berria XXX da
    	// pantailaratuz, eta gaizki burutu bada, saldoa ezin izan da aldatu
    	// inprimatuko luke.
    	// double dirua = pDiruKop;
   	 if (this.saldoaLortu(pPasaHitza) >= pDiruKop) {
   		 DecimalFormat df = new DecimalFormat("######.00");
   		 this.saldoa = pDiruKop;
   		 System.out.println(df.format(this.saldoa));
   	 }
   	 else {
   		 System.out.println("Saldoa ezin izan da aldatu");
   	 }
	}


}
    



