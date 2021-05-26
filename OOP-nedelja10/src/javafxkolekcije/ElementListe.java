package javafxkolekcije;

public class ElementListe {
	
	private String nazivElementa;	
	

	public ElementListe(String nazivElementa) {
		super();
		this.nazivElementa = nazivElementa;
	}

	public String getNazivElementa() {
		return nazivElementa;
	}

	public void setNazivElementa(String nazivElementa) {
		this.nazivElementa = nazivElementa;
	}

	@Override
	public String toString() {
		return  nazivElementa;
	}

		
	
	

}
