package studentskiradovi;

import java.util.ArrayList;
import java.util.Date;

public class SeminarskiRad extends StudentskiRad {
	
	private int ocena;
	private ArrayList<Student> autori;	
	
	
	public SeminarskiRad(String naslov, String mentor, Date datumOdbrane, int ocena, ArrayList<Student> autori) {
		super(naslov, mentor, datumOdbrane);
		this.ocena = ocena;
		this.autori = autori;
	}
	
	
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ArrayList<Student> getAutori() {
		return autori;
	}
	public void setAutori(ArrayList<Student> autori) {
		this.autori = autori;
	}
	
	@Override
	public String vratiIspisZaMentora() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.vratiIspisZaMentora());
		sb.append(", autori: ");
		for(Student s:autori) {
			sb.append(s.getIme()+" "+s.getPrezime());
			sb.append(", ");
		}
		sb.append("vrsta rada: seminarski");
		
		return sb.toString();
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", autori: ");
		for(Student s:autori) {
			sb.append(s.getIme()+" "+s.getPrezime());
			sb.append(", ");
		}
		sb.append("vrsta rada: seminarski");
		
		return sb.toString();
	}
	
	@Override
	public boolean isAutor(Student s) {		
		return autori.contains(s);
	}
	
	@Override 
	public String vratiIspisZaStudenta(){
		StringBuilder sb = new StringBuilder();
		sb.append(super.vratiIspisZaStudenta());		
		sb.append(ocena);
		sb.append(", vrsta rada: seminarski");
		
		return sb.toString();
	}
	
}
