package trkaciUML.trke;

import java.util.Date;

public class Trkac extends Ucesnik {
	
	private String ime;
	private String prezume;
	private String drzava;
	private Date datumRodjenja;
	private char pol;  // moze i enum
	
	public Trkac(String ime, String prezume, String drzava, Date datumRodjenja, char pol) {
		
		this.ime = ime;
		this.prezume = prezume;
		this.drzava = drzava;
		this.datumRodjenja = datumRodjenja;
		this.pol = pol;
	}	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezume() {
		return prezume;
	}
	public void setPrezume(String prezume) {
		this.prezume = prezume;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public char getPol() {
		return pol;
	}
	public void setPol(char pol) {
		this.pol = pol;
	}

	@Override
	public String toString() {
		return super.toString() +" - "+ ime + " " + prezume + ", drzava=" + drzava + ", datumRodjenja=" + datumRodjenja;
	}
	
	
	
	
}
