package packlaborategia5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaLiburuak
{
	// atributuak
	private ArrayList <Liburua> lista;
	
	// eraikitzailea
	public ListaLiburuak()
	{
		this.lista = new ArrayList <Liburua>();
	}

	//get eta set metodoak
	public ArrayList<Liburua> getLista() {
		return this.lista;
	}

	public void setLista(ArrayList<Liburua> pLista) {
		this.lista = pLista;
	}

	// beste metodoak
	public int listarenTamaina()
	{  
		return this.lista.size();
	}
	 
	private Iterator<Liburua> getIteradorea()
	{
		return this.lista.iterator();
	}
  
	public Liburua bilatuLiburuaIdz(int pIdLiburua)
	{
		Iterator <Liburua>itr = this.getIteradorea();
		boolean topatua = false;
		Liburua l1 = null;
		while (itr.hasNext() && !topatua) {
			l1 = itr.next();
			if (l1.idHauDu(pIdLiburua)) {
				topatua = true;
			}
		}
		if (topatua) {
			return l1;
		}
		else {
			return null;
		}
	}
  
	public boolean badago(Liburua pLiburua)
	{
		boolean aurkitua = false;
		if (this.lista.contains(pLiburua)) {
			aurkitua = true;
		}
		return aurkitua;
	}
	
	public boolean idBerdinekoLibururikBaAlDa(Liburua pLiburua)
	{
		boolean aurkitua = false;
		Liburua l1 = null;
		Iterator <Liburua> itr = getIteradorea();
		while(itr.hasNext() && !aurkitua) {
			l1 = itr.next();
			if(l1.getIdLiburua() == pLiburua.getIdLiburua()) {
				aurkitua=true;
			}
		}
		return aurkitua;
	}
	
	public void gehituLiburua(Liburua pLiburua)
   {
		if (!this.badago(pLiburua)) {
			this.lista.add(pLiburua);
		}
   }
	
	public void kenduLiburua(Liburua pLiburua)
    {
		if(!this.badago(pLiburua)) {
			System.out.println("Liburu hori ez dago listan");
		}
		else {
			this.lista.remove(pLiburua);
		}
	}
	
	public void inprimatu()
	{
		Liburua l1 = null;
		Iterator <Liburua> itr = getIteradorea();
		while(itr.hasNext()) {
			l1 = itr.next();
			l1.inprimatu();		
		}
	}
 }

