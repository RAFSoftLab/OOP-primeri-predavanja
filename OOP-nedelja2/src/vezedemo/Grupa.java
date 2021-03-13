package vezedemo;

import java.util.ArrayList;

public class Grupa {
	
	private String oznakaGrupe;
	private Integer godinaStudija;
	private String studProgram;
	private ArrayList<Student> studenti;
	
	
	
	public Grupa(String oznakaGrupe) {		
		this.oznakaGrupe = oznakaGrupe;
	}
	
	public String getOznakaGrupe() {
		return oznakaGrupe;
	}
	public void setOznakaGrupe(String oznakaGruper) {
		this.oznakaGrupe = oznakaGruper;
	}
	
	
	public Integer getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(Integer godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}

	public String getStudProgram() {
		return studProgram;
	}

	public void setStudProgram(String studProgram) {
		this.studProgram = studProgram;
	}

	public boolean add(Student e) {   // listu instanciramo kada prvog studenta dodamo u listu
		if(studenti==null) {
			studenti = new ArrayList<Student>();
		}
		return studenti.add(e);
	}
	
	
	
	
	

}
