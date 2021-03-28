package factorypatterndemo.factorymethod;

public class KatalogCasopisa extends Katalog {

	
	@Override
	public Publikacija kreirajPublikaciju(String podaci) {	
		String[] splited = podaci.split(",");
		return new Casopis(splited[0],splited[1],splited[2]);
	}

}



