package packlaborategia3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTest {
	private Data data1;

	@Before
	public void setUp() throws Exception {
		data1 = new Data(2020,01,20);
	}

	@After
	public void tearDown() throws Exception {
		data1 = null;
	}

	@Test
	public void testData() {
		assertNotNull(data1);
	}

	@Test
	public void testDataGehitu() {
		data1.dataGehitu();
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		assertEquals(data1.toString(),"2020/01/21");
		data1 = new Data (2020,01,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/02/01");
		
		//Test bat hilabetearen erdian, beste bat urte bisustu batean eta azkena bisustua ez den urte batean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,02,20);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/02/21");
		data1 = new Data (2020,02,28);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/02/29");
		data1 = new Data (2019,02,28);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2019/03/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,03,18);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/03/19");
		data1 = new Data (2020,03,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/04/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,04,11);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/04/12");
		data1 = new Data (2020,04,30);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/05/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,05,07);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/05/08");
		data1 = new Data (2020,05,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/06/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,06,11);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/06/12");
		data1 = new Data (2020,06,30);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/07/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,07,8);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/07/09");
		data1 = new Data (2020,07,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/08/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,8,24);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/08/25");
		data1 = new Data (2020,8,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/09/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,9,22);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/09/23");
		data1 = new Data (2020,9,30);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/10/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,10,15);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/10/16");
		data1 = new Data (2020,10,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/11/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, hilabetez pasatzeko asmoz
		data1 = new Data (2020,11,03);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/11/04");
		data1 = new Data (2020,11,30);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/12/01");
		
		//Test bat hilabetearen erdian eta beste test bat hilabetearen azken egunean, urtez pasatzeko asmoz
		data1 = new Data (2020,12,18);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2020/12/19");
		data1 = new Data (2020,12,31);
		data1.dataGehitu();
		assertEquals(data1.toString(),"2021/01/01");
	}

	@Test
	public void testDataKendu() {
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, urte bat atzera egiteko asmoz
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/01/19");
		data1 = new Data (2020,01,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2019/12/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,02,20);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/02/19");
		data1 = new Data (2020,02,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/01/31");
		
		//Test bat hilabetearen erdian, beste bat lehenengo egunean aurreko hilabetea bisustua izanda eta azkena bisustua ez izanda, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,03,18);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/03/17");
		data1 = new Data (2020,03,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/02/29");
		data1 = new Data (2019,03,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2019/02/28");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,04,11);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/04/10");
		data1 = new Data (2020,04,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/03/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,05,07);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/05/06");
		data1 = new Data (2020,05,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/04/30");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,06,11);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/06/10");
		data1 = new Data (2020,06,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/05/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,07,8);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/07/07");
		data1 = new Data (2020,07,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/06/30");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,8,24);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/08/23");
		data1 = new Data (2020,8,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/07/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,9,22);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/09/21");
		data1 = new Data (2020,9,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/08/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,10,15);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/10/14");
		data1 = new Data (2020,10,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/09/30");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,11,03);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/11/02");
		data1 = new Data (2020,11,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/10/31");
		
		//Test bat hilabetearen erdian eta beste bat lehenengo egunean, hilabete bat atzera egiteko asmoz
		data1 = new Data (2020,12,18);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/12/17");
		data1 = new Data (2020,12,01);
		data1.dataKendu();
		assertEquals(data1.toString(),"2020/11/30");
	}

}
