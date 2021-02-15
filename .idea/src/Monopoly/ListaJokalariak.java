package Monopoly;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJokalariak {
	////
	private int jokalariKop = 0;
	////
	private int rondaKop = 0;
	private int txandaJok = 0;
	private ArrayList<Jokalaria> lista;
	private static ListaJokalariak nireListaJokalariak;
	
	private ListaJokalariak() {
		this.lista = new ArrayList<Jokalaria>();
	}
	
	public static ListaJokalariak getNireListaJokalariak() {
		if (nireListaJokalariak == null) {
			nireListaJokalariak = new ListaJokalariak();	
	   		}
	   		return nireListaJokalariak;
	}
	
	private Iterator<Jokalaria> getIteradorea()
   	{
   		return this.lista.iterator();
   	}
	
	public static void main(String[] args) {
		Tableroa t = Tableroa.getNireTableroa();
		Irteera k1 = new Irteera("Irteera", 1);
		Kalea k2 = new Kalea("Ronda de Valencia", 2, 60, 2, "Gorria");
		Kalea k3 = new Kalea("Plaza de Lavapiés", 3, 60, 4, "Gorria");
		Hazienda k4 = new Hazienda("Hazienda Forua 1", 4);
		Kalea k5 = new Kalea("Goya Tren Geltokia", 5, 200, 25, "Geltokia");
		Kalea k6 = new Kalea("Glorieta Cuatro Caminos", 6, 100, 6, "Berdea");
		Kalea k7 = new Kalea("Avenida Reina Victoria", 7, 100, 6, "Berdea");
		Kalea k8 = new Kalea("Calle Bravo Murillo", 8, 120, 8, "Berdea");
		Kartzela k9 = new Kartzela("Kartzela", 9);
		Kalea k10 = new Kalea("Glorieta de Bilbao", 10, 140, 10, "Urdina");
		Kalea k11 = new Kalea("Alberto Aguilera", 11, 140, 10, "Urdina");
		Kalea k12 = new Kalea("Fuencarral", 12, 160, 12, "Urdina");
		Kalea k13 = new Kalea("Delicias Tren Geltokia", 13, 200, 25, "Geltokia");
		Kalea k14 = new Kalea("Avenida Felipe II", 14, 180, 14, "Horia");
		Kalea k15 = new Kalea("Calle Velazquez", 15, 180, 14, "Horia");
		Kalea k16 = new Kalea("Calle Serrano", 16, 200, 16, "Horia");
		Parking k17 = new Parking("Parking-a", 17);
		Kalea k18 = new Kalea("Avenida de América", 18, 220, 18, "Morea");
		Kalea k19 = new Kalea("María de Molina", 19, 220, 18, "Morea");
		Kalea k20 = new Kalea("Cea Bermudez", 20, 240, 20, "Morea");
		Kalea k21 = new Kalea("Mediodía Tren Geltokia", 21, 200, 25, "Geltokia");
		Kalea k22 = new Kalea("Avenida Reyes Católicos", 22, 260, 22, "Laranja");
		Kalea k23 = new Kalea("Bailén", 23, 260, 22, "Laranja");
		Kalea k24 = new Kalea("Plaza España", 24, 280, 24, "Laranja");
		JoanKartzelera k25 = new JoanKartzelera("Zoaz Kartzelara", 25);
		Kalea k26 = new Kalea("Puerta del Sol", 26, 300, 26, "Granatea");
		Kalea k27 = new Kalea("Calle Alcalá", 27, 300, 26, "Granatea");
		Kalea k28 = new Kalea("Gran Vía", 28, 320, 28, "Granatea");
		Kalea k29 = new Kalea("Norte Tren Geltokia", 29, 200, 25, "Geltokia");
		Kalea k30 = new Kalea("Paseo de la Castellana", 30, 380, 32, "Arrosa");
		Hazienda k31 = new Hazienda("Hazienda Forua 2", 31);
		Kalea k32 = new Kalea("Museo del Prado", 32, 400, 34, "Arrosa");	
		t.sartuKasila(k1);
		t.sartuKasila(k2);
		t.sartuKasila(k3);
		t.sartuKasila(k4);
		t.sartuKasila(k5);
		t.sartuKasila(k6);
		t.sartuKasila(k7);
		t.sartuKasila(k8);
		t.sartuKasila(k9);
		t.sartuKasila(k10);
		t.sartuKasila(k11);
		t.sartuKasila(k12);
		t.sartuKasila(k13);
		t.sartuKasila(k14);
		t.sartuKasila(k15);
		t.sartuKasila(k16);
		t.sartuKasila(k17);
		t.sartuKasila(k18);
		t.sartuKasila(k19);
		t.sartuKasila(k20);
		t.sartuKasila(k21);
		t.sartuKasila(k22);
		t.sartuKasila(k23);
		t.sartuKasila(k24);
		t.sartuKasila(k25);
		t.sartuKasila(k26);
		t.sartuKasila(k27);
		t.sartuKasila(k28);
		t.sartuKasila(k29);
		t.sartuKasila(k30);
		t.sartuKasila(k31);
		t.sartuKasila(k32);
		ListaJokalariak.getNireListaJokalariak().partidaBatJolastu();
	}
	
	//BAI
	private void gehituJokalaria(Jokalaria pJokalaria) {
		if(!this.lista.contains(pJokalaria)) {
			this.lista.add(pJokalaria);
			this.jokalariKop = this.jokalariKop + 1;	
		}
	}
	
	//BAI
	private void kenduJokalaria(Jokalaria pJokalaria) {
		if(this.lista.contains(pJokalaria)) {
			this.lista.remove(pJokalaria);
			this.jokalariKop = this.jokalariKop - 1;
		}
	}
	
	public void partidaBatJolastu() {
		//Erreseteatu, kolore beltza defektuz
        final String ANSI_RESET = "\u001B[0m";

        //Hizkien kolorea
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        //Azpimarratzeko
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        
		boolean amaitua = false;
		Jokalaria j1 = null;
		Dadoa d1 = Dadoa.getNireDadoa();
		int i = 0;
		
		this.inprimatuGoiburua();
		this.itxaron(2);
		
		this.partidaHasi();
		System.out.println("------");
		while(rondaKop<50 && !amaitua) {
			j1 = this.txanda();
			i = d1.botaDadoa();
			System.out.println(ANSI_GREEN + j1.getIzena()+"-(r)en txanda" + ANSI_RESET);
			this.itxaron(1);
			System.out.println("Gogoratu! Zure aberastasuna hau da: " + j1.aberastasunaLortu() + " €, " +  j1.getDiruKop() + " € eskudirutan eta " +
			(j1.aberastasunaLortu() - j1.getDiruKop()) + " € propietateetan");
			this.itxaron(1);
			System.out.println("Dadoan " + ANSI_RED + i + ANSI_RESET +" atera du");
			this.itxaron(1);
			if(j1.getTxandaKartzela() == 0) {
				j1.gehituPosizioa(i);
			}
			
			if (j1.getPosizioa()>32) {
				((Irteera)Tableroa.getNireTableroa().lortuKasilaZenbakiz(1)).kasilaEgikaritu(j1);
				j1.setPosizioa(j1.getPosizioa()-32);
			}
			
			System.out.println(ANSI_BLUE + Tableroa.getNireTableroa().lortuKasilaZenbakiz(j1.getPosizioa()).getDeskribapena()+ ANSI_RESET + "-n erori zara");
			this.itxaron(1);
			
			if(Tableroa.getNireTableroa().lortuKasilaZenbakiz(j1.getPosizioa()) instanceof Kalea) {
				System.out.println(Tableroa.getNireTableroa().lortuKasilaZenbakiz(j1.getPosizioa()).getDeskribapena() 
						+ "-k " + ANSI_PURPLE + ((Kalea)Tableroa.getNireTableroa().lortuKasilaZenbakiz(j1.getPosizioa())).getPrezioa()
						+ "€ " + ANSI_RESET + "balio du");
				this.itxaron(1);
			}
			
			if (j1.getPosizioa() != 1) {
				Tableroa.getNireTableroa().lortuKasilaZenbakiz(j1.getPosizioa()).kasilaEgikaritu(j1);
			}
			
			j1.koloreaInflazioa();
			
			j1.inprimatuJokalaria();
			this.itxaron(2);
			
			this.honekGalduDu(j1);
			
			if(this.norbaitekIrabaziDu()) {
				amaitua = true;
			}
			
			this.txandaJok = this.txandaJok + 1;
			this.rondaKalkulatu();
		}
		j1 = this.irabazleaLortu();
		System.out.print(ANSI_GREEN_BACKGROUND + ANSI_WHITE + j1.getIzena()+"-(e)k irabazi du. ZORIONAK!" + ANSI_RESET);
	}
	//BAI
	private void partidaHasi() {
		boolean bagaude = false;
		Teklatua t1 = Teklatua.getNireTeklatua();
		String izena = null;
		boolean denaKtrlpean = false;
		int saiakerak = 0;
		
		while(!bagaude) {
	
			do {
				try {
					izena = t1.irakurriString("Sartu erabiltzaile izena: ", this.jokalariKop);
					if(!this.izenBerdina(izena)) {
						denaKtrlpean = true;
					}
					else {
						throw new IzenBerdinaSalbuespena();
					}
				}
				catch(IzenBerdinaSalbuespena s) {
					s.inprimatuMezua();
				}
				saiakerak = saiakerak + 1;
				
			} while(saiakerak <= 3 && !denaKtrlpean);
				if (!denaKtrlpean) {
					System.out.println("Saiakerak amaitu dira, zure izena defektuz jarri da.");
					izena = "Jokalari" + (this.getLuzera() + 1);
				}
				
			saiakerak = 0;	
			denaKtrlpean = false;
			Jokalaria j1 = new Jokalaria(izena);
			this.gehituJokalaria(j1);
			if (this.jokalariKop==4) {
				bagaude = true;
			}
			else if(this.jokalariKop>= 2 && t1.irakurriBoolean("Jokalari guztiak sartu dira? ", "Bai", "Ez")) {
				bagaude = true;
			}
			ListaJokalariak.getNireListaJokalariak();
		}
	}
	
	private boolean izenBerdina(String pIzena) {
		boolean berdinaDa = false;
		Iterator<Jokalaria> itr = this.getIteradorea();
		Jokalaria j1 = null;
		
		while(itr.hasNext() && !berdinaDa){
			j1 = itr.next();
			if(j1.getIzena().equals(pIzena)) {
				berdinaDa = true;
			}
		}
		return berdinaDa;
	}
	
	//BAI
	private void honekGalduDu(Jokalaria pJokalaria) {
		Kalea k1;
		final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
		
		if(pJokalaria.negatiboanNago()) {
			if(pJokalaria.propietateKopurua() == 0) {
				System.out.println(ANSI_RED + "Negatiboan zaude eta ez duzu propietaterik. Jokotik kanporatua izan zara." + ANSI_RESET);
				this.itxaron(2);
				this.kenduJokalaria(pJokalaria);
			}
			else {
				while(pJokalaria.propietateKopurua() != 0 && pJokalaria.getDiruKop() < 0) {
					k1 = pJokalaria.garestienaLortu();
					k1.jabeaKendu(pJokalaria);
					pJokalaria.kobratu(k1.getPrezioa());
				}
				if(pJokalaria.negatiboanNago()) {
						System.out.println(ANSI_RED + "Negatiboan zaude eta ez duzu propietaterik. Jokotik kanporatua izan zara." + ANSI_RESET);
						this.itxaron(2);
						this.kenduJokalaria(pJokalaria);
				}
			}
		}
	}
	
	private void rondaKalkulatu() {
		if((this.txandaJok % this.jokalariKop) == 0) {
			this.rondaKop = this.rondaKop + 1;
		}
	}
	
	//BAI
	private Jokalaria txanda() {
		Jokalaria j1 = null;
		int i = (this.txandaJok % this.jokalariKop);
		j1 = this.lista.get(i);
		return j1;
	}
	
	//BAI
	private Jokalaria irabazleaLortu() {
		Iterator<Jokalaria> itr = getIteradorea();
		Jokalaria j1,j2 = null;
		int i = 0; 
		
		while(itr.hasNext()) {
			j1 = itr.next();
			if(j1.aberastasunaLortu()>i) {
				j2 = j1;
				i = j2.aberastasunaLortu();
			}
		}
		return j2;
	}
	
	private boolean norbaitekIrabaziDu() {
		boolean emaitza = false;
		if(this.jokalariKop == 1) {
			emaitza = true;
		}
		return emaitza;
	}
	
	//Test eta metodoentzako metodo laguntzaileak
	public void setTxandaJok(int pTxandaJok) {
		this.txandaJok = pTxandaJok;
	}
	
	public int getJokalariKop(){
		return this.jokalariKop;
	}
	
	public int getLuzera() {
		return this.lista.size();
	}
	
	public void setJokalariKop(int pJokalariKop) {
		this.jokalariKop = pJokalariKop;
	}
	
	public void erreseteatu() {
 		this.lista.clear();
 	}
	
	//Jokoaren fluxua kontrolatzeko (atzerapen denbora mezuentzat)
	public void itxaron(int pZenb) {
		try {
            Thread.sleep(pZenb*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
	}
	
	//Jokoaren goiburuaren inprimaketa
	private void inprimatuGoiburua() {
		final String ANSI_BLUE = "\u001B[34m";
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_RED_BACKGROUND = "\u001B[41m";
		
		
		System.out.println("");
        System.out.println("");
        System.out.println(ANSI_BLUE + "        ##     ##  #######  ##    ##  #######  ########   #######  ##       ##    ## \r\n" + 
                "        ###   ### ##     ## ###   ## ##     ## ##     ## ##     ## ##        ##  ##  \r\n" + 
                "        #### #### ##     ## ####  ## ##     ## ##     ## ##     ## ##         ####   \r\n" + 
                "        ## ### ## ##     ## ## ## ## ##     ## ########  ##     ## ##          ##    \r\n" + 
                "        ##     ## ##     ## ##  #### ##     ## ##        ##     ## ##          ##    \r\n" + 
                "        ##     ## ##     ## ##   ### ##     ## ##        ##     ## ##          ##    \r\n" + 
                "        ##     ##  #######  ##    ##  #######  ##         #######  ########    ##    \r\n" + 
                "" + ANSI_RESET);
        System.out.println("");
        System.out.println("");
		
        this.itxaron(2);
		System.out.println(ANSI_GREEN + "Arauak: Joko hau ahalik eta diru zein propietate gehien izatean datza. Hasieran 1500€-rekin hasiko zara,"
				+ " eta kaleak erosteko aukera izango duzu. Txandak pasa ahala gero");
		System.out.println("eta kale libre gutxiago geratuko dira, beraz saiatu beste jokalarien kaleetan ez erortzen, honek dirua"
				+ " kenduko baitizu. Gainera, saiatu ez erortzen 'Joan Kartzelera' ");
		System.out.println("edo 'Hazienda'-n, lehenengoak 3 txanda bidaliko zaitu kartzelera eta bigarrenak 100€ kenduko dizkizu. 'Parking' kasilan eroriz gero,"
				+ " 'Haziendan' lortutako dirua");
		System.out.println("bereganatuko duzu, beraz aukera paregabea da dirua lortzeko. Diru kopuru negatiboa baduzu, jokoak automatikoaki kale garestiena salduko dizu, KONTUZ. Kolore berdineko");
		System.out.println("kale guztiak izanez gero, beste jokalariak honetan erortzen badira bikoitza ordaindu behar izango dute $€$€." + ANSI_RESET);
		this.itxaron(2);
		System.out.println("");
		System.out.println(ANSI_CYAN + "Irabazteko moduak: Diru positiboa duen bakarra bazara edo 50 txandaren buruan diru gehien duen jokalaria"
				+ " bazara, partida irabaziko duzu." + ANSI_RESET);
		this.itxaron(1);
		System.out.println("");
		System.out.println(ANSI_RED_BACKGROUND + " " + ANSI_RESET + ANSI_RED + " Jokoa hastera doa, ondo pasa! " + ANSI_RESET + ANSI_RED_BACKGROUND + " " + ANSI_RESET);
		System.out.println("");
	}
}

