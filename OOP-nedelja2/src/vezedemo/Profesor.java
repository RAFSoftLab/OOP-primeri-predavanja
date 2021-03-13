package vezedemo;

import java.util.ArrayList;

public class Profesor {
	private String ime;
	private String prezime;
	private String uzaNaucnaOblast;
	private String trenutnoZvanje;
	private ArrayList<Predmet> predmeti;
	
	
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
	public String getUzaNaucnaOblast() {
		return uzaNaucnaOblast;
	}
	public void setUzaNaucnaOblast(String uzaNaucnaOblast) {
		this.uzaNaucnaOblast = uzaNaucnaOblast;
	}
	public String getTrenutnoZvanje() {
		return trenutnoZvanje;
	}
	public void setTrenutnoZvanje(String trenutnoZvanje) {
		this.trenutnoZvanje = trenutnoZvanje;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	
}
