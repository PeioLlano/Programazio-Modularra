package packlaborategia3;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data implements IData{
	
	//atributuak
	private int eguna;
	private int hilabetea;
	private int urtea;
	
	
	//eraikitzaileak
	public Data(int pUrtea, int pHilabetea, int pEguna){
		this.eguna = pEguna;
		this.hilabetea = pHilabetea;
		this.urtea = pUrtea;
		
		if (!this.dataZuzenaDa()){
			Calendar c = new GregorianCalendar();
			this.eguna = c.get(Calendar.DATE);
			this.hilabetea = c.get(Calendar.MONTH)+1;
			this.urtea = c.get(Calendar.YEAR);			
		}
		
	}
		
	//beste metodoak

	@Override
	public String toString(){
		String strUrtea = String.format("%04d", this.urtea); 
		String strHilabetea = String.format("%02d", this.hilabetea);
		String strEguna = String.format("%02d", this.eguna);
		
		return strUrtea + "/" + strHilabetea + "/" + strEguna;
	}
	
	
	private boolean dataZuzenaDa(){
		
		//objektuaren data egokia den ala ez itzultzen du.
		
		boolean egokia=true;
		
		if (this.urtea < 0){
			egokia=false;}
		else if (this.hilabetea < 0 || this.hilabetea > 12 ) {
			egokia=false;}
		else if ((this.eguna < 0) || (this.azkenEguna(this.hilabetea) < this.eguna)) {
			egokia=false;}
		return egokia;
	}
	
	private boolean bisustua(){
		boolean bisustua=false;
		if ((this.urtea % 4 == 0 && this.urtea % 100 != 0) || (this.urtea % 400 == 0)) {
			bisustua=true;
			}
		return bisustua;
	}

	@Override
	public void dataGehitu() {
	    if ((this.hilabetea == 12) && ((this.azkenEguna(this.hilabetea)) == this.eguna)) {
	    	this.urtea= this.urtea + 1;
	    	this.hilabetea = 1;
	    	this.eguna = 1;
	    }
	    else if ((this.azkenEguna(this.hilabetea)) == this.eguna) {
	    	this.hilabetea = this.hilabetea + 1;
	    	this.eguna = 1;
	    }
	    else {
	    	this.eguna = this.eguna + 1;
	    }
	}
	
	@Override
	public void dataKendu() {
	    if ((this.hilabetea == 1) && (this.eguna == 1)) {
	    	this.urtea= this.urtea - 1;
	    	this.hilabetea = 12;
	    	this.eguna = 31;
	    }
	    else if (this.eguna == 1) {
	    	this.hilabetea = this.hilabetea - 1;
	    	this.eguna = this.azkenEguna(this.hilabetea);
	    }
	    else {
	    	this.eguna = this.eguna - 1;
	    }
	}
	
	private int azkenEguna(int pHilabetea){
		//metodo honek hilaabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna;
		if ((this.hilabetea==1) || (this.hilabetea==3) || (this.hilabetea==5) || (this.hilabetea==7) || (this.hilabetea==8) || (this.hilabetea==10) || (this.hilabetea==12)) {
			azkenEguna=31;}
		else if ((this.hilabetea==4) || (this.hilabetea==6) || (this.hilabetea==8) || (this.hilabetea==9) || (this.hilabetea==11)) {
			azkenEguna=30;}
		else if ((this.bisustua())) {
			azkenEguna=29;}
		else {
			azkenEguna=28;}
		return azkenEguna;
	}
}
