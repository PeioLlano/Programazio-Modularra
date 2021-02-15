package packlaborategia7;

public class Neska extends Ikaslea
{
	public Neska(String pNAN, String pIzena, String pAbizena, int pAdina)
	{
		super(pNAN, pIzena, pAbizena, pAdina);
	}
	
	@Override
	public void gehituPreferentzia(Ikaslea pIkaslea)
	{
		if(pIkaslea instanceof Mutila) {
			this.getListaPreferentziak().gehituIkaslea(pIkaslea);
		}
		else {
			System.out.println("Ezin da bikotea sortu.");
		}
	}

	public Mutila enparejatu(ListaIkasleak pMutilAtzigarriak)
    {
            Ikaslea ikasleBat = null;
            int ind = 0;
            boolean enparejatua = false;
            while ((ind <= this.getListaPreferentziak().getTamaina()) && !enparejatua) {
                    ikasleBat = this.getListaPreferentziak().getIkasleaPos(ind);
                    if(pMutilAtzigarriak.badago(ikasleBat)) {
                            if(((Mutila) ikasleBat).onartu(this)) {
                                    enparejatua = true;
                            }
                    }
                    ind = ind + 1;
            }
            if (enparejatua) {
                    return (Mutila)ikasleBat;
            }
            else {
                    return null;
            }

    }

}
