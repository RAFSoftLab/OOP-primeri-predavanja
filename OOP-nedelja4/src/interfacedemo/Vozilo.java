package interfacedemo;

public abstract class Vozilo implements Pokretljiv {
	
	private int brojTockova;
	
	public Vozilo(int brojTockova) {	
		
		this.brojTockova = brojTockova;
	}

	public int getBrojTockova() {		
		return brojTockova;
	}

	public void setBrojTockova(int brojTockova) {
		this.brojTockova = brojTockova;
	}
		
	
	
}


