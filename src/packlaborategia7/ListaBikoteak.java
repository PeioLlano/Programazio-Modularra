package packlaborategia7;
import java.util.*;

/**
 * @author  aitziber
 */
public class ListaBikoteak
{
	private ArrayList <Bikotea> lista;
	private static ListaBikoteak nireListaBikoteak;
		
	private ListaBikoteak()
    { 
    	this.lista = new ArrayList <Bikotea>();
    }
	
	public static ListaBikoteak getListaBikoteak(){
		if (nireListaBikoteak == null) {
			nireListaBikoteak = new ListaBikoteak();	
	   	}
	   	return nireListaBikoteak;
	}		

		private void setListaBikoteak(ArrayList<Bikotea> pLista) {
			this.lista = pLista;
			
		}
		
		private Iterator<Bikotea> getIteradorea(){
			return this.lista.iterator();
		}
		
		private int bilatuTxertatzekoPos(int pAdina)
        {
                Iterator<Bikotea> it = this.getIteradorea();
                boolean topatua = false;
                int pos=0;
            while (it.hasNext() && !topatua)
            {
              Bikotea bikoteBat = it.next();
              if (bikoteBat.getNeska().getAdina()<= pAdina)
              {
                  topatua = true;
              }
              else
              {
                   pos= pos+1;
              }
            }
            return pos;
        }


		// aurre: bikoteen zerrenda, neskaren adinaren arabera ordenatuta dago
		// post: bikote bat gehitu da neskaren adinaren arabera txartatuz
		public void gehituBikoteaModuOrdenatuan(Bikotea pBikotea)
		{
		int pos = 0;
		pos = this.bilatuTxertatzekoPos(pBikotea.getNeska().getAdina());
		this.lista.add(pos, pBikotea);	
		}


		public Ikaslea lortuHonenBikotea(Ikaslea pIkaslea)
		{
			Iterator<Bikotea> itr = this.getIteradorea();
			boolean topatua = false;
			Bikotea b1 = null;
			Ikaslea i1 = null;
			while(itr.hasNext() && !topatua) {
				b1 = itr.next();
				if(b1.getMutila()==pIkaslea) {
					topatua = true;
					i1 = b1.getNeska();
				}
				if(b1.getNeska()==pIkaslea) {
					topatua = true;
					i1 = b1.getMutila();
				}
			}
			if (topatua) {
				return i1;
			}
			else {
				return null;
			}
		}
		
		public void reajustatuBikoteak()
		{
			boolean posibleDa=true;
			
			ArrayList<Bikotea> bikoteakAux=new ArrayList<Bikotea>();
			ListaIkasleak mutilAtzigarriak = this.sortuBakarrikMutilenLista();
			Iterator<Bikotea> itr = ListaBikoteak.getListaBikoteak().getIteradorea();
			Bikotea b1 = null;
			while(itr.hasNext() && posibleDa) {
				b1 = itr.next();
				if(b1.getNeska().enparejatu(mutilAtzigarriak) != null){
					bikoteakAux.add(new Bikotea(b1.getNeska(),b1.getNeska().enparejatu(mutilAtzigarriak)));
					mutilAtzigarriak.kenduIkaslea(b1.getNeska().enparejatu(mutilAtzigarriak));
				}
				else {
					posibleDa = false;
				}
			}
			
			if (posibleDa)
			{
				this.setListaBikoteak(bikoteakAux);	
			}
			else
			{
				System.out.println("Ezin izan dira bikote berriak sortu...");
			}
			
		}


		private ListaIkasleak sortuBakarrikMutilenLista()
		{
			Iterator<Bikotea> itr = ListaBikoteak.getListaBikoteak().getIteradorea();
			Bikotea b1 = null;
			ListaIkasleak emaitza = new ListaIkasleak();
			while(itr.hasNext()) {
				b1 = itr.next();
				emaitza.gehituIkaslea(b1.getMutila());
			}
			return emaitza;
			
		}

		public void erreseteatu()
		{
			getListaBikoteak().lista.clear();		
		}
	
}


