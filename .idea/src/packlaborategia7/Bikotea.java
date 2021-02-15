package packlaborategia7;

/**
 * @author  aitziber
 */
public class Bikotea
{ 
	private Neska neska;
	private Mutila mutil;
	
  public Bikotea(Ikaslea pIkaslea1, Ikaslea pIkaslea2)
  {	 
	  
	  if (pIkaslea1 instanceof Mutila && pIkaslea2 instanceof Neska)
	  {
	     this.mutil = (Mutila)pIkaslea1;
	     this.neska = (Neska)pIkaslea2;
	  }
	  else{
		  if(pIkaslea1 instanceof Neska && pIkaslea2 instanceof Mutila) {
			  this.neska = (Neska)pIkaslea1;
			  this.mutil = (Mutila)pIkaslea2;
		  }
		  else {
			  this.neska = null;
			  this.mutil = null;
			  System.out.println("Ezin da bikotea sortu");
		  }
	  }
  }
  /**
 * @return
 * @uml.property  name="neska"
 */
public Neska getNeska()
  {
	return neska;
}

  public Mutila getMutila()
  {
	return mutil;
  }

public boolean badago(Ikaslea pIkaslea)
{
	boolean emaitza=false;
  	if(pIkaslea.equals(this.mutil) || pIkaslea.equals(this.neska)) {
  		emaitza = true;
  	}
    return emaitza;
}


}
