package studentskiradovi;

import java.util.ArrayList;
import java.util.Date;

public class DiplomskiRad extends StudentskiRad {
	
	private ArrayList<String> clanoviKomisije;
	private int ocena; 
	private Student autor;
	
	public DiplomskiRad(String naslov, String mentor, Date datumOdbrane, ArrayList<String> clanoviKomisije, int ocena,
			Student autor) {
		super(naslov, mentor, datumOdbrane);
		this.clanoviKomisije = clanoviKomisije;
		this.ocena = ocena;
		this.autor = autor;
	}
	public ArrayList<String> getClanoviKomisije() {
		return clanoviKomisije;
	}
	public void setClanoviKomisije(ArrayList<String> clanoviKomisije) {
		this.clanoviKomisije = clanoviKomisije;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public Student getAutor() {
		return autor;
	}
	public void setAutor(Student autor) {
		this.autor = autor;
	}
	
	@Override
	public String vratiIspisZaMentora() {
		return super.vratiIspisZaMentora() + ", autor:" + autor.getIme()+" "+autor.getPrezime() + ", vrsta rada: diplomski" ;
	}
	@Override
	public boolean isAutor(Student s) {		
		return autor.equals(s);
	}
	
	@Override 
	public String vratiIspisZaStudenta(){
		StringBuilder sb = new StringBuilder();
		sb.append(super.vratiIspisZaStudenta());
		for(String str:clanoviKomisije) {
			sb.append(str);
			sb.append(", ");
		}
		sb.append(ocena);
		sb.append(", vrsta rada: diplomski");
		
		return sb.toString();
	}
	
	
	
}
