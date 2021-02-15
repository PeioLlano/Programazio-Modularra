package Monopoly;

import java.util.Random;

public class Dadoa {
	private static Dadoa nireDadoa;
	private int nAldeak = 6;
	
	private Dadoa() {
		
	}
	
	public static Dadoa getNireDadoa() {
		if (nireDadoa == null) {
			nireDadoa = new Dadoa();	
	   		}
	   		return nireDadoa;
	}
	
	//BAI
	public int botaDadoa() {
		Random r = new Random();
		int tirada = r.nextInt(nAldeak)+1;
		return tirada;
	}
}
