package packlaborategia6b;

import java.util.ArrayList;
import java.util.Iterator;

public class PcsEuskadi {
	private ArrayList <Langilea> lista;
	private static PcsEuskadi nirePcsEuskadi;
	
	private PcsEuskadi()
    { 
    	this.lista = new ArrayList <Langilea>();
    }
	
	public static PcsEuskadi getPcsEuskadi()
   	{
   		if (nirePcsEuskadi == null) {
   			nirePcsEuskadi = new PcsEuskadi();	
   		}
   		return nirePcsEuskadi;
   	}
	
	private Iterator<Langilea> getIteradorea()
   	{
   		return this.lista.iterator();
   	}
	
	public double difentziaMaximoaLortu() {
		double indMax = 0;
		double indMin = 0;
		Iterator<Langilea> itr = this.getIteradorea();
		Langilea l1 = null;
		while(itr.hasNext()) {
			l1 = itr.next();
			if(l1.kobratzenDuenaKalkulatu()>indMax) {
				indMax = l1.kobratzenDuenaKalkulatu();
			}
			if(l1.kobratzenDuenaKalkulatu()<indMin || indMin == 0) {
				indMin = l1.kobratzenDuenaKalkulatu();
			}
		}
		return indMax-indMin;
	}
}
