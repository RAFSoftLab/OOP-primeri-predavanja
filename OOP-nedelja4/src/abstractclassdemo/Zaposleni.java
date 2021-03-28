package abstractclassdemo;

public abstract class Zaposleni {
	
	private String ime;
	private String prezime;
	private String jmbg;	
	
	public Zaposleni(String ime, String prezime) {		
		this.ime = ime;
		this.prezime = prezime;
	}	
	
	public abstract void ispisi();
	
	public abstract void ispisiOpterecenje();

	
	
	
	
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	

}




