package packlaborategia8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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

 	public void itzuliLiburua(int pIdLiburua){

        Liburua lib = this.lista.bilatuLiburuaIdz(pIdLiburua);
        try{
        Erabiltzailea erab = 
ListaErabiltzaileak.getListaErabiltzaileak().norkDaukaMaileguan(lib);
        if (erab != null){
                erab.kenduLiburua(lib);
        }else{
                System.out.println("Ezin izan da itzuli, erabiltzailea ez baitago mailegatuta...");
                throw new MailegatuGabeSalbuespena();
        }
        }catch(MailegatuGabeSalbuespena e){
                e.inprimatuMezua(lib);
                lib.inprimatu();
        }
}

 	
 	public void katalogatuLiburua(Liburua pLiburua){		
 		Scanner sc = new Scanner(System.in);
 		 	int saiakerak = 0;
 		 	boolean denaKtrlpean = false;
 		 	int i;
 		 		do {
 		 		try {
 		 			if (this.bilatuLiburuaIdz(pLiburua.getIdLiburua()) == null) {
 		 					this.lista.gehituLiburua(pLiburua);
 		 				denaKtrlpean = true;
 		 			}
 		 			else{
 		 				if(saiakerak < 3) {
 		 					System.out.println("Ezin da liburu hori katalogatu...");
 		 					throw new IdBerdinaSalbuespena();
 		 				}
 		 						
 		 			}
 		 		}
 		 		catch(IdBerdinaSalbuespena e){
 		 			e.inprimatuMezua();
 		 			System.out.println("Sartu beste zenbaki bat: ");
 		 			i = sc.nextInt();
 		 			pLiburua.liburuarenIdAldatu(i);
 		 		}
 		 		saiakerak = saiakerak + 1;
 		 		} while(saiakerak <= 3 && !denaKtrlpean);
 		 		if (!denaKtrlpean) {
 		 			System.out.println("Saiakerak amaitu dira, ezin izan da liburua katalogatu...");
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