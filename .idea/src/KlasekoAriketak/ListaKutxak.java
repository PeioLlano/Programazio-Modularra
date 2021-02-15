package KlasekoAriketak;
import java.util.ArrayList;

public class ListaKutxak {
	private ArrayList<Kutxa> lista;
	private static ListaKutxak nireListaKutxak;
	
private ListaKutxak() {
	this.lista=new ArrayList<Kutxa>();
}
public static ListaKutxak getNireListaKutxak() {
	if(ListaKutxak.nireListaKutxak==null) {
		nireListaKutxak=new ListaKutxak();
	}
	return nireListaKutxak;
}
}
