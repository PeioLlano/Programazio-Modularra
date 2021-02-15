package Monopoly;

public class Jokalaria {
	private String izena;
	private int diruKop = 1500;
	private ListaKaleak nireKaleak;
	private int posizioa = 1;
	private int txandaKartzela = 0;
	
	public Jokalaria(String pIzena) {
		this.izena = pIzena;
		this.nireKaleak = new ListaKaleak();
	}
	//BAI
	public int getTxandaKartzela() {
		return this.txandaKartzela;
	}
	
	//BAI
	public int getPosizioa() {
		return this.posizioa;
	}
	
	//BAI
	public void aldatuPosizioa(int pPos) {
		this.posizioa = pPos;
	}
	
	//BAI
	public void gehituPosizioa(int pZenb) {
		this.posizioa = this.posizioa + pZenb;
	}
		
	//BAI
	public void hasieratuTxandaKartzela() {
		this.txandaKartzela = 0;
	}
	
	//BAI
	public void gehituTxandaKartzela() {
		this.txandaKartzela = this.txandaKartzela + 1;
	}

	//BAI
	public void kobratu(int pKop) {
		this.diruKop = this.diruKop + pKop;
	}
	
	//BAI
	public void ordaindu(int pKop) {
		this.diruKop = this.diruKop - pKop;
	}
	
	//BAI
	public boolean negatiboanNago() {
		boolean emaitza = false;
		if(this.diruKop < 0) {
			emaitza = true;
		}
		return emaitza;
	}
	
	//BAI
	public void sartuNireKaleetara(Kalea pKalea) {
		this.nireKaleak.sartuNireKaleetara(pKalea);
	}
	
	//BAI
	public void ateraNireKaleetatik(Kalea pKalea) {
		this.nireKaleak.ateraNireKaleetatik(pKalea);
	}
	
	//BAI
	public int aberastasunaLortu() {
		return (this.diruKop + this.nireKaleak.kaleenBalioa());
	}
	
	//BAI
	public void koloreaInflazioa() {
		this.nireKaleak.koloreInflazioa();
	}
	
	//BAI
	public Kalea garestienaLortu() {
		return this.nireKaleak.garestienaBueltatu();
	}
	
	//Testua inprimatzeko bakarrik
	public void inprimatuJokalaria() {
		System.out.println("------");
		System.out.println("Jokalaria: " + this.izena);
		System.out.println("Dirua: " + this.diruKop + " €");
		System.out.println("Posizioa: " + this.posizioa);
		System.out.println("Txandak kartzelan: " + this.txandaKartzela);
		System.out.println("Propietate kopurua: " + this.nireKaleak.luzeraLortu());
		System.out.print("Propietateak: ");
		this.inprimatuKaleak();
		System.out.println();
		System.out.println("Zure aberastasuna hau da: " + this.aberastasunaLortu() + " €, " +  this.diruKop + " € eskudirutan eta " +
		this.nireKaleak.kaleenBalioa() + " € propietateetan");
		System.out.println("------");
	}
	
	private void inprimatuKaleak() {
		this.nireKaleak.inprimatuKaleak();
	}
	
	
	
	//GETTER ETA SETTER-AK (metodo)
	public String getIzena() {
		return izena;
	}
	
	public void setPosizioa(int pZenb) {
		this.posizioa = pZenb;	
	}	

	
	//GETTER ETA SETTER-AK (metodo + test)
	public int getDiruKop() {
		return this.diruKop;
	}
	
	public int propietateKopurua() {
		return this.nireKaleak.luzeraLortu();
	}

	
	//GETTER ETA SETTER-AK (test)
	public void setDiruKop(int pDiruKop) {
		this.diruKop = pDiruKop;
	}	
}