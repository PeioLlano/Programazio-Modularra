package packlaborategia7;

public class Mutila extends Ikaslea
{

	public Mutila(String pNAN, String pIzena, String pAbizena, int pAdina)
	{
		super(pNAN, pIzena, pAbizena, pAdina);
	}
	
	public boolean onartu(Neska pNeska)
	{
		boolean onartu = false;
		if(this.getListaPreferentziak().badago(pNeska)) {
			onartu = true;
		}
		return onartu;
	}
	
	@Override
	public void gehituPreferentzia(Ikaslea pIkaslea) {
		if(pIkaslea instanceof Neska) {
			this.getListaPreferentziak().gehituIkaslea(pIkaslea);
		}
		else {
			System.out.println("Ezin da bikotea sortu.");
		}
	}
}
