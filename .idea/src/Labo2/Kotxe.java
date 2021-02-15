package Labo2;

public class Kotxe {
	//atributuak
	private String matrikula;
	private String markaMatrikula;
	private Pertsona jabea;
	
	//metodo eraikitzailea
	public Kotxe(String pMatrikula,String pMarkaMatrikula,Pertsona pJabea) {
		this.matrikula=pMatrikula;
		this.markaMatrikula=pMarkaMatrikula;
		this.jabea=pJabea;
	}
	
	//gainontzeko metodoak
	public void aldatuJabea(Pertsona pJabea) {
		this.jabea=pJabea;
	}
	
	public boolean jabeaAlDa(Pertsona pJabePosible) {
		boolean jabeaDa=false;
		if (this.jabea == pJabePosible) {
			jabeaDa=true;}
		return(jabeaDa);
	}
public static void main(String[] args) {
	Pertsona p1,p2;
	p1= new Pertsona("Peio", 12, 210,'G',"Etiopia","B+");
	p2= new Pertsona("Julen", 18, 21,'G',"Espainia","O+");
	Kotxe k1;
	k1= new Kotxe("1234 BCD","Seat Ibiza",p1);
	k1.aldatuJabea(p2);
	System.out.print(k1.jabeaAlDa(p2));
}
}
