package factorypatterndemo.factorymethod;

import java.util.ArrayList;

public abstract class Katalog {
	
	private ArrayList<Publikacija> listaPublikacija;	
	
	public void ispisiKatalog(){
		for(Publikacija pub:listaPublikacija)
			System.out.println(pub.getIspisPublikacije());
	}
	
	public void dodajPublikaciju(String podaci){
		if(listaPublikacija==null)
			listaPublikacija = new ArrayList<>();
		listaPublikacija.add(kreirajPublikaciju(podaci));
	}
	
	abstract public Publikacija kreirajPublikaciju(String tekst);
}



