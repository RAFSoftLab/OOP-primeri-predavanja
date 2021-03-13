package vezedemo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
	
	private String ime;
	private String prezime;
	private LocalDate datumRodjenja;
	private int brojIndeksa;
	private String smer;
	private int godinaUpisa;
	private int godinaStudija;	
	private Grupa grupa;
	
	
	
	
	public Student(){
			
	}
		
	public Student(int brojIndeksa, String smer, int godinaUpisa) {
		this.brojIndeksa = brojIndeksa;
		this.smer = smer;
		this.godinaUpisa = godinaUpisa;
	}
	
	public Student(String ime, String prezime, String smer, int brojIndeksa,  int godinaUpisa) {
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
	
	public void dodeliOcenuZaPredmet(Predmet p, int ocena){
		// TODO
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

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {	
		this.grupa = grupa;
		grupa.add(this);      // kada studentu postavimpo grupu, azuriramo i drugu stranu veze, odnosno studenta dodajemo u listu studenata za grupu
	}
	
	
	
}
