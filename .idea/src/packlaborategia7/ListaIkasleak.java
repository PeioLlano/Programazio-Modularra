package packlaborategia7;
import java.util.*;

/**
 * @author  aitziber
 */
public class ListaIkasleak
{
	/**
	 * @uml.property  name="lista"
	 */
	private ArrayList<Ikaslea> lista;

	public ListaIkasleak()
	{
		this.lista = new ArrayList<Ikaslea>();
	}

	/**
	 * @return
	 * @uml.property  name="lista"
	 */
	  	  
	public void gehituIkaslea(Ikaslea pIkaslea)
	{
		if(!this.badago(pIkaslea)) {
			this.lista.add(pIkaslea);	
		}
	}	

	public void kenduIkaslea(Ikaslea pIkaslea)
	{
		if(this.badago(pIkaslea)) {
			this.lista.remove(pIkaslea);	
		}
	}
	 
	public boolean badago(Ikaslea pIkaslea)
	{
		boolean badago = false;
		if(this.lista.contains(pIkaslea)) {
			badago = true;
		}
		return badago;
	}

        public int getTamaina()
	{
		return this.lista.size();
	}

    public Ikaslea getIkasleaPos(int pPos) {
       if (pPos < 0 || pPos >= this.getTamaina())
          {
             System.out.println("getIkasleaPos:: posizio okerra eskeine da");
             return null;
          }
          else
          {
             return this.lista.get(pPos);
          }
    }
}
