package utilitycollections;

import java.time.LocalDate;


public class Student {
	
	private String ime;
	private String prezime;
	private LocalDate datumRodjenja;
	private int brojIndeksa;
	private String smer;
	private int godinaUpisa;
	private int godinaStudija;
	
	
			
	public Student(int brojIndeksa, String smer, int godinaUpisa) {
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
	}
	
	public Student(String ime, String prezime, int brojIndeksa, 
			String smer, int godinaUpisa) {		
		this.ime = ime;
		this.prezime = prezime;		
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;		
	}


	public Student(String ime, String prezime, LocalDate datumRodjenja, int brojIndeksa, 
			String smer, int godinaUpisa, int godinaStudija) {		
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
		this.godinaStudija = godinaStudija;
	}

	
	
	
	
	public void povecajGodinuStudija(){
	    this.godinaStudija++;
	}
	
	public void promeniSmer(String noviSmer){
		this.smer = noviSmer;		
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

	
	
	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
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
	
	public String getIndexFull(){		
		return this.brojIndeksa+"/"
				+this.smer 
				+ "-"+this.godinaUpisa;
	}
	
	
	@Override
	public String toString() {	
		return this.prezime +" "+ this.ime + ", indeks: "+getIndexFull()+", godina studija: "+this.godinaStudija;
				
	}
	
}
