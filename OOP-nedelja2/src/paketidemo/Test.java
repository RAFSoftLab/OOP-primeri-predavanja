package paketidemo;

import paketidemo.mojpaket.Brojac;  // ime Brojac dodajemo u prostor imena klase

public class Test {

	public static void main(String[] args) {
		initblok.Brojac brojac = new initblok.Brojac();   // primer kada koristmo celo kvalifikono ime klase, bez importa
		brojac.ispisi(); 
		Brojac br = new Brojac();
		br.test();
	}

}
