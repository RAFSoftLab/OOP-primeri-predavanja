package factorypatterndemo.factorymethod;

public class KatalogElektronskihPublikacija extends Katalog {

	public KatalogElektronskihPublikacija() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Publikacija kreirajPublikaciju(String podaci) {	
		String[] podaciSplited = podaci.split(",");		
		return new ElektronskaPublikacija(podaciSplited[0], podaciSplited[1]);
	}

}
