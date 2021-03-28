package factorypatterndemo.factorymethod;

public class KatalogKnjiga extends Katalog {

	
	@Override
	public Publikacija kreirajPublikaciju(String podaci) {	
		String[] podaciSplited = podaci.split(",");
		return new Knjiga(podaciSplited[0], podaciSplited[1], podaciSplited[2], podaciSplited[3]);
	}

}
