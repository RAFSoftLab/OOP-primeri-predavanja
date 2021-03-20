package nasledjivanjedemo;

public class Zaposleni {
	
	private String ime;
	private String prezime;	
	private String jmbg;	
		
	
	public Zaposleni(String ime, String prezime) {		
		this.ime = ime;
		this.prezime = prezime;
	}
	
	
	public Zaposleni(String ime, String prezime, String jmbg) {		
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}	

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
	
	public void ispisiOpterecenje() {
		System.out.println("Nepoznato opterecenje");
	}
	
	public void ispisi(){
		System.out.println(this.ime+" "+this.prezime);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if(!(obj instanceof Zaposleni)) return false;
		return this.getJmbg().equals(((Zaposleni)obj).getJmbg());		
	}
	/*
	 * primer metode sa vidljivoscu protected - vidljiva u paketu i u potklasama, vidi klasu: objectdemo.MojZaposleni
	 */
	
	protected String vratiInicijale() {
		return ime.substring(0,1)+". "+prezime.substring(0,1)+".";
	}
	
	@Override
	public String toString() {
		return getIme()+" "+getPrezime()+": "+this.getJmbg();
	}
	

}
