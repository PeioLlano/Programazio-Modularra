package Monopoly;

public class Kalea extends Kasila {
	private int prezioa;
	private int ordainduBeharrekoa;
	private Jokalaria jabea;
	private String kolorea;
	
	public Kalea(String pDeskribapena, int pZenbakia, int pPrezioa, int pOrdainduBeharrekoa, String pKolorea) {
		super(pDeskribapena, pZenbakia);
		this.ordainduBeharrekoa = pOrdainduBeharrekoa;
		this.prezioa = pPrezioa;
		this.jabea = null;
		this.kolorea = pKolorea;
	}
	
	//BAI
	public void jabeaKendu(Jokalaria pJokalaria) {
		this.jabea = null;
		pJokalaria.ateraNireKaleetatik(this);
	}
	
	//BAI
	public void kasilaEgikaritu (Jokalaria pJokalaria) {
		if (this.erositaDago()) {
			this.ordainduErosiaDuenari(pJokalaria);
		}
		else {
			if (pJokalaria.getDiruKop() >= this.prezioa) {
				if (this.erosiGaldetu(this)) {
					this.jabeaGehitu(pJokalaria);
				}
			}
			else {
				System.out.println("Ez duzu dirurik propietate hau erosteko.");
			}
		}
	}
	
	private void jabeaGehitu(Jokalaria pJokalaria) {
        this.jabea = pJokalaria;
        pJokalaria.sartuNireKaleetara(this);
        pJokalaria.ordaindu(this.prezioa);
    }
	
	private boolean erositaDago() {
		boolean emaitza = false;
		if(this.jabea != null) {
			emaitza = true;
		}
		return emaitza;
	}
	
	private void ordainduErosiaDuenari(Jokalaria pJokalaria) {
		pJokalaria.ordaindu(this.ordainduBeharrekoa);
		this.jabea.kobratu(this.ordainduBeharrekoa);
	}
	
	private boolean erosiGaldetu(Kalea pKalea) {
		boolean erosi = false;
		Teklatua t1 = Teklatua.getNireTeklatua();
		
		if(t1.irakurriBoolean(pKalea.getDeskribapena() + " erosi nahi duzu? ", "Bai", "Ez")){
			erosi = true;
		}
		return erosi;
	}
	
	//GETTER ETA SETTER-AK (test)
	public Jokalaria getJabea() {
		return jabea;
	}
	
	//GETTER ETA SETTER-AK (metodo)
	public int getPrezioa() {
		return prezioa;
	}
	
	public String getKolorea() {
		return kolorea;
	}
	
	public int getOrdainduBeharrekoa() {
		return ordainduBeharrekoa;
	}
	
	public void setOrdainduBeharrekoa(int pOrdainduBeharrekoa) {
		this.ordainduBeharrekoa = pOrdainduBeharrekoa;
	}
	
	
	
}

