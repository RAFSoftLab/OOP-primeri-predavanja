package factorypatterndemo.factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		Katalog katalog = new KatalogKnjiga();
		katalog.dodajPublikaciju("Ana Karenjna,Laguna,Tolstoj,567-678-903");
		katalog.dodajPublikaciju("Besnilo,Laguna,Borislav Pekic,4757575-567");
		katalog.dodajPublikaciju("Zlocin i kazna,Prosveta,Dostojevski,885858585858");
		
		katalog.ispisiKatalog();
		
		
		Katalog katalogEl = new KatalogElektronskihPublikacija();
		
		katalogEl.dodajPublikaciju("Skripta,www.primer.oop/skripta");
		katalogEl.ispisiKatalog();
		
		
		
	}

}
