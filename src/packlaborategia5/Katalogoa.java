package packlaborategia5;

import java.util.ArrayList;
import java.util.Iterator;

public class Katalogoa
{
	// atributuak
	private ListaLiburuak lista;
    private static Katalogoa nireKatalogoa;
	
	// eraikitzailea
	
	private Katalogoa() {
		this.lista = new ListaLiburuak();	    	
	}

 	// otros métodos
 	
	public static Katalogoa getKatalogoa() 
	{
	if (nireKatalogoa == null) {
		nireKatalogoa = new Katalogoa();	
	}
	return nireKatalogoa;
	}
	
 	public int liburuKopuru()
 	{
 		return this.lista.listarenTamaina();
 	}
 	 	
 	public Liburua bilatuLiburuaIdz(int pIdLiburua)
 	{
 		return this.lista.bilatuLiburuaIdz(pIdLiburua); 	
 	}
 	
 	public void mailegatuLiburua(int pIdLiburua, int pIdErabiltzailea)
 	{
 		if (!ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea).mailegatzekoMaximoaGainditua() && ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(bilatuLiburuaIdz(pIdLiburua)) == null) {
 			ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea).gehituLiburua(bilatuLiburuaIdz(pIdLiburua));
 			ListaErabiltzaileak.getListaErabiltzaileak().bilatuErabiltzaileaIdz(pIdErabiltzailea).maileguanDu(bilatuLiburuaIdz(pIdLiburua));
 		}
 		else {
 			System.out.println("Liburua ez dago eskuragarri");
 		}
	}

 	public void itzuliLiburua(int pIdLiburua)
	{
 		ListaErabiltzaileak listaE= ListaErabiltzaileak.getListaErabiltzaileak();
 		Liburua liburuBat = this.bilatuLiburuaIdz(pIdLiburua);
 		Erabiltzailea erabiltzaileBat = listaE.norkDaukaMaileguan(liburuBat);
 		if (erabiltzaileBat.maileguanDu(liburuBat)) {
 			erabiltzaileBat.kenduLiburua(liburuBat);
 		}
	}
 	
 	public void katalogatuLiburua(Liburua pLiburua)
 	{		
 		if (this.bilatuLiburuaIdz(pLiburua.getIdLiburua()) == null) {
 			this.lista.getLista().add(pLiburua);
 		}
 	}

 	public void deskatalogatuLiburua(int pIdLiburua)
 	{
 		this.lista.kenduLiburua(this.lista.bilatuLiburuaIdz(pIdLiburua));
 	}

 	public void inprimatu()
 	{
 		System.out.println("Katalogoko liburu kopurua: " + this.liburuKopuru());
 		this.lista.inprimatu();
 	}

 	public void erreseteatu()
 	{
 		this.lista.getLista().clear();
 	}
 	
}	