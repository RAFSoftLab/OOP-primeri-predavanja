package stud;

public class Student {
	
	
	// atributi (polja) klase student 
	private String ime;
	private String prezime;
	private int brojIndeksa;
	private String smer;	
	private int godinaUpisa;
	private int godinaStudija;
	
	// konstruktor - opercija koja se koristi za kreiranje objekata klase student	
	public Student(String ime, String prezime, int brojIndeksa, String smer,
			int godinaUpisa, int godinaStudija) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;		
		this.godinaUpisa = godinaUpisa;
		this.godinaStudija = godinaStudija;
	}
	
	// set i get metode za svako polje, koriste se za pristup poljima
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
	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public String getSmer() {
		return smer;
	}
	public void setSmer(String smer) {
		this.smer = smer;
	}	
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	// ostale operacije nad studentom
	
	public void povecajGodinuStudija() {
		this.godinaStudija++;
	}	
	
	public void ispisiStudenta() {
		System.out.printf("ime: %s, prezime: %s, godina studija: %d\n", this.ime, this.prezime, this.godinaStudija);
	}
	

}
