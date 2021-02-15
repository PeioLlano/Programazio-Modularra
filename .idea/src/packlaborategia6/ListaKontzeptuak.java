package packlaborategia6;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaKontzeptuak {
	// atributuak
	private ArrayList <Kontzeptua> lista;
		
	//eraikitzailea	
	public ListaKontzeptuak()
	{
		this.lista = new ArrayList <Kontzeptua>();
	}
	
	private Iterator<Kontzeptua> getIteradorea()
	{
		return this.lista.iterator();
	}
	
	public double kontzeptuenBatura() {
		Kontzeptua k1 = null;
		Iterator<Kontzeptua> itr = this.getIteradorea();
		double akum = 0;
		while(itr.hasNext()) {
			k1 = itr.next();
			akum = akum + k1.getZenbatekoGordina();
		}
		return akum;
	}
}
