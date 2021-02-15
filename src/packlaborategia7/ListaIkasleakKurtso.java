package packlaborategia7;

import java.util.*;

/**
 * @author  aitziber
 */
public class ListaIkasleakKurtso
{
	/**
	 * @uml.property  name="lista"
	 */
	private ArrayList<Ikaslea> lista; 
	private static ListaIkasleakKurtso nireListaIkasleakKurtso = new ListaIkasleakKurtso();

	private ListaIkasleakKurtso()
	{
		this.lista = new ArrayList<Ikaslea>();
	}
			
	public static ListaIkasleakKurtso getListaIkasleakKurtso()
	{
		return nireListaIkasleakKurtso;
	}

	/**
	 * @return
	 * @uml.property  name="lista"
	 */
			
	public void gehituIkasleaKurtsoan(Ikaslea pIkaslea)
	{
		if (null == this.bilatuIkasleaNANez(pIkaslea.getNAN())) {
			this.lista.add(pIkaslea);
		}
	}

	private Iterator<Ikaslea> getIteradorea()
	{
		return(this.lista.iterator());
	}

	public void erreseteatu()
	{
		this.lista.clear();
	}

	public Ikaslea bilatuIkasleaNANez(String pNAN)
    {
            Iterator<Ikaslea> it = this.getIteradorea();
            boolean bilatua = false;
            Ikaslea ikasleBat=null;
            while (!bilatua && it.hasNext())
            {
                    ikasleBat = it.next();
                    if (ikasleBat.getNAN() == pNAN)
                    {
                            bilatua = true;
                }
            }
            if (bilatua)
            {
               return ikasleBat;
            }
            else
            {
               return null;
            }
    }
	
	public boolean badagoIkaslerikBikoterikGabe()
    {
        Iterator<Ikaslea> it = ListaIkasleakKurtso.getListaIkasleakKurtso().getIteradorea();
        boolean guztiakBikotearekin = true;
        while(guztiakBikotearekin && it.hasNext())
           {
              Ikaslea ikasleBat = it.next();
              if(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(ikasleBat) == null)
                {
                  guztiakBikotearekin = false;
                }
           }
           return !guztiakBikotearekin;
    }
}
