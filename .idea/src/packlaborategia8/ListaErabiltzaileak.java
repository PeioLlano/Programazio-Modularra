package packlaborategia8;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaErabiltzaileak
{
	// atributuak
	private ArrayList <Erabiltzailea> lista;
	private static ListaErabiltzaileak nireListaErabiltzaileak;
	
	// eraikitzailea
	
    private ListaErabiltzaileak()
    { 
    	this.lista = new ArrayList <Erabiltzailea>();
    }
   	
    // beste metodoak
    
   	public static ListaErabiltzaileak getListaErabiltzaileak()
   	{
   		if (nireListaErabiltzaileak == null) {
   		nireListaErabiltzaileak = new ListaErabiltzaileak();	
   		}
   		return nireListaErabiltzaileak;
   	}
   	
	public int erabiltzaileKopurua()
   	{
		return ListaErabiltzaileak.getListaErabiltzaileak().lista.size();
   	}
   	
   	private Iterator<Erabiltzailea> getIteradorea()
   	{
   		return this.lista.iterator();
   	}
    
   	public Erabiltzailea bilatuErabiltzaileaIdz(int pId)
   	{
   		Iterator <Erabiltzailea> itr = this.getIteradorea();
		boolean topatua = false;
		Erabiltzailea e1 = null;
		while (itr.hasNext() && !topatua) {
			e1 = itr.next();
			if (e1.idHauDu(pId)) {
				topatua = true;
			}
		}
		if (topatua) {
			return e1;
		}
		else {
			return null;
		}
   	}
   	
   	public boolean badagoIdBerdinekoErabiltzailerik(Erabiltzailea pErabiltzailea)
   	{
   		Iterator <Erabiltzailea> itr = this.getIteradorea();
		boolean topatua = false;
		Erabiltzailea e1 = null;
		while (itr.hasNext() && !topatua) {
			e1 = itr.next();
			if (e1.idBerdinaDute(pErabiltzailea)) {
				topatua = true;
			}
		}
		return topatua;
   	}
   	
   	public void erabiltzaileariAltaEman(Erabiltzailea pErabiltzailea)
   	{   		
   		if (!this.badagoIdBerdinekoErabiltzailerik(pErabiltzailea)) {
   			ListaErabiltzaileak.getListaErabiltzaileak().lista.add(pErabiltzailea);
   		}
   	}

	public void erabiltzaileaBajaEman(int pIdErabiltzailea)
	{
		try {
			if (this.badagoIdBerdinekoErabiltzailerik(this.bilatuErabiltzaileaIdz(pIdErabiltzailea))) {
				ListaErabiltzaileak.getListaErabiltzaileak().lista.remove(this.bilatuErabiltzaileaIdz(pIdErabiltzailea));
			}
			else{
				System.out.println("Ezin da erabiltzaile horri baja eman...");
				throw new AltaGabeSalbuespena();
			}
		}
		catch(AltaGabeSalbuespena e){
			e.inprimatuMezua();
		}
	}


   	public Erabiltzailea norkDaukaMaileguan(Liburua pLiburu)
   	{
   		boolean aurkitua = false;
   		Erabiltzailea e1 = null;
   		Iterator <Erabiltzailea> itr = getIteradorea();
   		while(itr.hasNext() && !aurkitua) {
   			e1 = itr.next();
   			if(e1.maileguanDu(pLiburu)) {
   				aurkitua = true;
   			}
   		}
   		if (aurkitua) {
   			return e1;
   		}
   		else {
   			return null;
   		}
   	}

   	public void inprimatu()
   	{	
   		System.out.println("Erabiltzaile kopurua: " + erabiltzaileKopurua());
   		Erabiltzailea e1 = null;
		Iterator <Erabiltzailea> itr = getIteradorea();
		while(itr.hasNext()) {
			e1 = itr.next();
			e1.inprimatu();		
		}
   	}
   
   	public void erreseteatu()
   	{
   		ListaErabiltzaileak.getListaErabiltzaileak().lista.clear();
   	}
}


