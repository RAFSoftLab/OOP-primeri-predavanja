package studentpredmetcheckbox;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String imeIPrezime;	
	private List<Predmet> predmeti = new ArrayList<Predmet>();
	
	public Student(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	public void addPredmet(Predmet p){
		predmeti.add(p);
		
	}
	
	
	
	
}
