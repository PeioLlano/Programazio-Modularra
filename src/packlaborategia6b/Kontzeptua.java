package packlaborategia6b;

public abstract class Kontzeptua {
	// atributuak
		private double zenbatekoGordina;
		
		// eraikitzailea
		public Kontzeptua(int pZenbatekoGordina)
		{
			this.zenbatekoGordina = pZenbatekoGordina;
		}

		public double getZenbatekoGordina() {
			return zenbatekoGordina;
		}
		
		protected abstract double ZenbatekoGarbiaKalkulatu() ;
}
