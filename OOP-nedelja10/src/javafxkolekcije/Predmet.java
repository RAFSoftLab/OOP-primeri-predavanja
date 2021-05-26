package javafxkolekcije;

public class Predmet {
	
	private String nazivPredmeta;
	
	

	public Predmet(String nazivPredmeta) {
		super();
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	@Override
	public String toString() {
		return  nazivPredmeta;
	}
	
	
	
	

}
