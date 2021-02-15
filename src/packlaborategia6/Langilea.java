package packlaborategia6;

public class Langilea {
	private int idLangile;
	private String izenAbizenak;
	private ListaKontzeptuak lista;
	
	public Langilea(int pIdLangilea, String pIzenAbizenak) {
		this.idLangile = pIdLangilea;
		this.izenAbizenak = pIzenAbizenak;
		this.lista = new ListaKontzeptuak();
	}
	
	public double kobratzenDuenaKalkulatu() {
		return this.lista.kontzeptuenBatura();
	}
}
