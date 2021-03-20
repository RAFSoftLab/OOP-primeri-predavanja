package objectdemo;

import nasledjivanjedemo.Zaposleni;

public class MojZaposleni extends Zaposleni {

	public MojZaposleni(String ime, String prezime) {
		super(ime, prezime);		
	}
	
	public void ispisiInicicijale() {
		System.out.println(super.vratiInicijale()); // pristup protected elementu iz natklase u drugom paketu moze i bez super, a moze i sa this
	}

}
