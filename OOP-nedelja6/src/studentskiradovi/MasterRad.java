package studentskiradovi;

import java.util.ArrayList;
import java.util.Date;

public class MasterRad extends StudentskiRad {
	
	private ArrayList<String> clanoviKomisije;
	private Student autor;
	
	public MasterRad(String naslov, String mentor, Date datumOdbrane, ArrayList<String> clanoviKomisije,
			Student autor) {
		super(naslov, mentor, datumOdbrane);
		this.clanoviKomisije = clanoviKomisije;
		this.autor = autor;
	}
	public ArrayList<String> getClanoviKomisije() {
		return clanoviKomisije;
	}
	public void setClanoviKomisije(ArrayList<String> clanoviKomisije) {
		this.clanoviKomisije = clanoviKomisije;
	}
	public Student getAutor() {
		return autor;
	}
	public void setAutor(Student autor) {
		this.autor = autor;
	}
	
	@Override
	public String vratiIspisZaMentora() {
		return super.vratiIspisZaMentora() + ", autor:" + autor.getIme()+" "+autor.getPrezime() + ", vrsta rada: master" ;
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
		sb.append("vrsta rada: master");
		
		return sb.toString();
	}
	
}
