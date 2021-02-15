package packlaborategia7;

/**
 * @author  aitziber
 */
public class KurtsoDantza
{

	/**
	 Singleton patroia aplikatu eraikitzailea, instantzia bakarraren get-a eta instantzia gordetzeko atributua ezarriz
	 */
	private static KurtsoDantza nireKurtsoDantza;
	
	private KurtsoDantza() {
		
	}

	public static KurtsoDantza getKurtsoDantza() {
		if (nireKurtsoDantza == null) {
			nireKurtsoDantza = new KurtsoDantza();	
		}
		return nireKurtsoDantza;
	}
	
	public void inskribatuBikotea(String pNAN1, String pNAN2)
	{
		ListaBikoteak Lb = ListaBikoteak.getListaBikoteak(); 
		ListaIkasleakKurtso Lik = ListaIkasleakKurtso.getListaIkasleakKurtso();
		Ikaslea i1, i2;
		i1 = Lik.bilatuIkasleaNANez(pNAN1);
		i2 = Lik.bilatuIkasleaNANez(pNAN2);
		if( i1 == null || i2 == null) {
			System.out.print("Ezin da bikotea sortu");
		}
		else {
			if (Lb.lortuHonenBikotea(i1) != null || Lb.lortuHonenBikotea(i2) != null || i1.getClass() == i2.getClass() ) {
				System.out.print("Ezin da bikotea sortu");
			}
			else{
				Bikotea b = new Bikotea(i1,i2);
				Lb.gehituBikoteaModuOrdenatuan(b);
			}
		}
			
		
	}

	public void gehituIkaslea(String pNAN, String pIzena, String pAbizena, int pAdina,  char pSexua)
	{
		ListaIkasleakKurtso Lik = ListaIkasleakKurtso.getListaIkasleakKurtso();
		Ikaslea i1;
		if (pSexua == 'M' || pSexua == 'm') {
			i1 = new Mutila(pNAN,pIzena,pAbizena,pAdina);
			Lik.gehituIkasleaKurtsoan(i1);
		}
		else if (pSexua == 'N' || pSexua == 'n'){
			i1 = new Neska(pNAN,pIzena,pAbizena,pAdina);
			Lik.gehituIkasleaKurtsoan(i1);
		}
		
	}
  
   public void gehituPreferentzia(String pIdNor, String pIdBerePreferentzia)
   {
	   ListaIkasleakKurtso Lik = ListaIkasleakKurtso.getListaIkasleakKurtso();
	   Ikaslea i1, i2;
	   i1 = Lik.bilatuIkasleaNANez(pIdNor);
	   i2 = Lik.bilatuIkasleaNANez(pIdBerePreferentzia);
	   i1.gehituPreferentzia(i2);
   }
  
   public void hasieratuKurtsoa()
   {
	  ListaIkasleakKurtso Lik = ListaIkasleakKurtso.getListaIkasleakKurtso();
	  ListaBikoteak Lb = ListaBikoteak.getListaBikoteak();
	  Lik.erreseteatu();
	  Lb.erreseteatu();
   }
	
   public void ajustatuBikoteakPreferentzienArabera()
   {
     ListaBikoteak Lb = ListaBikoteak.getListaBikoteak();
     ListaIkasleakKurtso Lik = ListaIkasleakKurtso.getListaIkasleakKurtso();
     if(!Lik.badagoIkaslerikBikoterikGabe()) {
    	 Lb.reajustatuBikoteak();
     }
   }
  
}
