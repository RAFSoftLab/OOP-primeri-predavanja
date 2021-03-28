package interfacedemo;

public abstract class ProsirivoVozilo extends Vozilo implements Prosiriv {

	public ProsirivoVozilo(int brojTockova) {		
		super(brojTockova);		
		System.out.println("konst ="+ Prosiriv.KONST);  // primer poziva konstante koja se nalazi u oba implementirana interfejsa
	}
	
	//...
	
	
	@Override
	public void dodaj(String nazivElementa, int broj) {
		// TODO Auto-generated method stub

	}

}
