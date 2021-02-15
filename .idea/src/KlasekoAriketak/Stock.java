package KlasekoAriketak;
import java.util.ArrayList;

public class Stock {
	//atributuak
	private ArrayList<Produktua> lista;
	private static Stock nireStock=null;
	
	//eraikitzaile pribatua
	private Stock() {
		this.lista=new ArrayList<Produktua>();
	}
	
	//stock bakarra sortzeko metodoa
	public static synchronized Stock getNireStock(){
		if(nireStock==null) {
			nireStock.lista=new ArrayList<Produktua>();
		}
		return nireStock;
	}
}
