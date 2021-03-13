package vezedemo;

import java.util.ArrayList;

public class Predmet {
	
	private String naziv;
	private int semestar;
	private int fondPredavanja;
	private int fondVezbe;
	private int ESPB;
	private ArrayList<Profesor> profesori;
	
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSemestar() {
		return semestar;
	}
	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}
	public int getFondPredavanja() {
		return fondPredavanja;
	}
	public void setFondPredavanja(int fondPredavanja) {
		this.fondPredavanja = fondPredavanja;
	}
	public int getFondVezbe() {
		return fondVezbe;
	}
	public void setFondVezbe(int fondVezbe) {
		this.fondVezbe = fondVezbe;
	}
	public int getESPB() {
		return ESPB;
	}
	public void setESPB(int eSPB) {
		ESPB = eSPB;
	}
	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}
	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	
	
}
