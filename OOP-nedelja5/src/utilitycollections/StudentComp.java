package utilitycollections;

import java.time.LocalDate;

public class StudentComp implements Comparable<StudentComp> {	
	
	private String ime;
	private String prezime;
	private LocalDate datumRodjenja;
	private int brojIndeksa;
	private String smer;
	private int godinaUpisa;
	private int godinaStudija;
	
	public StudentComp(){
		
	}
		
	public StudentComp(int brojIndeksa, String smer, int godinaUpisa) {
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
	}

	public StudentComp(String ime, String prezime, LocalDate datumRodjenja, int brojIndeksa, 
			String smer, int godinaUpisa, int godinaStudija) {		
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
		this.godinaStudija = godinaStudija;
	}
	
	
	
	public StudentComp(String ime, String prezime, int brojIndeksa, String smer, int godinaUpisa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
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
	
	@Override
	public String toString() {	
		return this.godinaUpisa + "-" + this.smer + "-"+this.brojIndeksa;
	}

	@Override
	public int compareTo(StudentComp s) {		
		if (this.godinaUpisa==s.getGodinaUpisa()){
			if(this.smer.equals(s.getSmer()))
				return this.brojIndeksa - s.getBrojIndeksa();
			else
				return this.smer.compareTo(s.getSmer());
			
		}else
			return this.godinaUpisa - s.getGodinaUpisa();
	}

	}
