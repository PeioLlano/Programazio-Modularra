package Monopoly;

import java.util.Scanner;

public class Teklatua {
	private static Teklatua nireTeklatua;
	private Scanner sc;
	
	private Teklatua() {
		sc = new Scanner(System.in);
	}
	
	public static Teklatua getNireTeklatua() {
		if (nireTeklatua == null) {
			nireTeklatua = new Teklatua();	
	   		}
	   		return nireTeklatua;
	}
	
	public String irakurriString(String pAurrekoMezua, int pKop) {
		System.out.print(pAurrekoMezua);
		boolean denaKtrlpean = false;
		int saiakerak = 0;
		String mezua = null;
		
		do {
			try {
				mezua = sc.nextLine();
				if(!mezua.equals("")){
					denaKtrlpean = true;
				}
				else {
					throw new IzenHutsaSalbuespena();
				}
			}
		
			catch(IzenHutsaSalbuespena s) {
				s.inprimatuMezua();
			}
			saiakerak = saiakerak + 1;
			} while(saiakerak <= 3 && !denaKtrlpean);
				if (!denaKtrlpean) {
					System.out.println("Saiakerak amaitu dira, zure izena defektuz jarri da.");
					mezua = "Jokalari" + (pKop + 1);
				}		
		return mezua;
	}
	
	public boolean irakurriBoolean(String pAurrekoMezua, String pBai, String pEz) {
		boolean emaitza = false;
		System.out.print(pAurrekoMezua);
		boolean denaKtrlpean = false;
		int saiakerak = 1;
		String mezua;
		
		do {
			try {
				mezua = sc.nextLine();
				if(mezua.equals(pBai)) {
					emaitza = true;
					denaKtrlpean = true;
				}
				else if(mezua.equals(pEz)) {
					emaitza = false;
					denaKtrlpean = true;
				}
				else {
					throw new BaiEzSalbuespena();
				}
			}
		
			catch(BaiEzSalbuespena s) {
				s.inprimatuMezua();
			}
			saiakerak = saiakerak + 1;
			} while(saiakerak <= 3 && !denaKtrlpean);
				if (!denaKtrlpean) {
					System.out.println("Saiakerak amaitu dira, zure erantzuna 'Ez' bezala hartu da.");
				}
		return emaitza;
	
	}
	
}
