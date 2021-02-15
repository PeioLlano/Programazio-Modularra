package packlaborategia8;

public class MailegatuGabeSalbuespena extends Exception {

	public MailegatuGabeSalbuespena(){
		super();
	}
	
	public void inprimatuMezua(Liburua pLiburua) {
		System.out.println("Ezin izan da itzuli, erabiltzailea ez baitago "
				+ "mailegatuta...");
	}
	
}
