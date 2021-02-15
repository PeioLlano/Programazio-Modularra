package packlaborategia7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IkasleaTest {
	Mutila m1,m2;
	Neska n1,n2;
	
	@Before
	public void setUp() throws Exception {
		m1 = new Mutila("55","Peio","Llano",18);
		m2 = new Mutila("54","Julen","Fuentes",20);
		n1 = new Neska("50","Jone","Albizabal",28);
		n2 = new Neska("77","Itziar","Belaustegigoitia",21);
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		m2 = null;
		n1 = null;
		n2 = null;
	}

	@Test
	public void testIkaslea() {
		assertNotNull(m1);
		assertNotNull(m2);
		assertNotNull(n1);
		assertNotNull(n2);
		
	}

}
