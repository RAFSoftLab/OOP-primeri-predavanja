package studentskiradovi;

import java.util.Date;

public abstract class StudentskiRad {
	private String naslov;
	private String mentor;
	private Date datumOdbrane;
	
		
	public StudentskiRad(String naslov, String mentor, Date datumOdbrane) {
		super();
		this.naslov = naslov;
		this.mentor = mentor;
		this.datumOdbrane = datumOdbrane;
	}
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public Date getDatumOdbrane() {
		return datumOdbrane;
	}
	public void setDatumOdbrane(Date datumOdbrane) {
		this.datumOdbrane = datumOdbrane;
	}

	
	public String vratiIspisZaMentora() {
		return "Naslov: " + naslov;
	}
	
	public String vratiIspisZaStudenta() {
		return "Naslov: " + naslov+", mentor: "+mentor+", ";
	}
	
	abstract public boolean isAutor(Student s);
	

	
	
	
	
	

}
