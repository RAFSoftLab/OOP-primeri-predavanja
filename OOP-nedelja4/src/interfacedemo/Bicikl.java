package interfacedemo;

public class Bicikl extends ProsirivoVozilo {

	public Bicikl(int brojTockova) {
		super(brojTockova);		
	}
	
	
	// ...

	@Override
	public void idiNapred() {
		System.out.println("Okretanje pedala sa ispravljenim kormanom");

	}

	@Override
	public void idiNazad() {
		return;

	}

	@Override
	public void idiGore() {
		return;

	}

	@Override
	public void idiDole() {
		return;

	}

	@Override
	public void idiLevo() {
		System.out.println("Okretanje pedala sa kormanom okrenutim na levo");

	}

	@Override
	public void idiDesno() {
		System.out.println("Okretanje pedala sa kormanom okrenutim na desno");

	}
	
	public void dodajTockove(int brojTockova) {
		dodaj("tocak", brojTockova);
		
	}

}
