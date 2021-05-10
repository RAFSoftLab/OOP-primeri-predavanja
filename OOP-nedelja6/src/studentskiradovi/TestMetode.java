package studentskiradovi;

import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TestMetode {
	


	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
	    ArrayList<StudentskiRad> radovi = new ArrayList<StudentskiRad>();
	    Student s1 = new Student("Maja", "Mirkovic", "RN-45/2016");
	    Student s2 = new Student("Milan", "Petrovic", "RN-41/2019");
	    Student s3 = new Student("Sanja", "Djukic", "RN-32/2019");
	    
	    ArrayList<String> komisija = new ArrayList<String>();
	    komisija.add("Marko Markovic");
	    komisija.add("Marija Mitic");
	    
	    ArrayList<Student> autori = new ArrayList<Student>();	    
	    autori.add(s2);
	    autori.add(s3);
	    
	    radovi.add(new DiplomskiRad("Naslov1", "Petar Petrovic", sdf.parse("2020-02-02"), komisija, 10, s1));
	    radovi.add(new SeminarskiRad("Naslov2", "Petar Petrovic", sdf.parse("2020-01-10"), 10, autori));
	    radovi.add(new DiplomskiRad("Naslov3", "Marija Mitic", sdf.parse("2020-02-02"), komisija, 10, s2));
	    radovi.add(new MasterRad("Naslov4", "Petar Petrovic", sdf.parse("2020-02-02"), komisija, s2));	
	    
	    ispisiMentor("Petar Petrovic", radovi);
	    System.out.println("---------------------------------");
	    ispisiStudent(s2, radovi);
	}
	
	
	// ne OOP rešenje - upotreba instanceof i kastovanja
	private static void ispisiMentor1(String profesor, ArrayList<StudentskiRad> radovi) {
		for(StudentskiRad sr:radovi) {
			if(sr.getMentor().equals(profesor)) {				
				System.out.print("Naslov: "+sr.getNaslov()+", ");				
				if(sr instanceof SeminarskiRad) {
					SeminarskiRad semRad = (SeminarskiRad)sr ;
					System.out.print("autori: ");
					for(Student s:semRad.getAutori()) {
						System.out.print(s.getIme()+" "+s.getPrezime()+", ");						
					}
					System.out.print("vrsta rada: seminarski");
					
				}else if(sr instanceof DiplomskiRad) {
					System.out.print("autor: "+ ((DiplomskiRad) sr).getAutor().getIme()+ " "+((DiplomskiRad) sr).getAutor().getPrezime()+", ");
					System.out.print("vrsta rada: diplomski");
				}else if(sr instanceof MasterRad) {
					System.out.print("autor: "+ ((MasterRad) sr).getAutor().getIme() + " "+((MasterRad) sr).getAutor().getPrezime()+", ");
					System.out.print("vrsta rada: master");
				}				
				System.out.println();
			}		
		}	
	}
	
	
	// bolje OOP rešenje
	
	private static void ispisiMentor(String profesor, ArrayList<StudentskiRad> radovi) {
		for(StudentskiRad sr:radovi) {
			if(sr.getMentor().equals(profesor)) {
				System.out.println(sr.vratiIspisZaMentora());
			}		
		}	
	}
	
	private static void ispisiStudent(Student s, ArrayList<StudentskiRad> radovi) {
		for(StudentskiRad sr:radovi) {
			if(sr.isAutor(s)) {
				System.out.println(sr.vratiIspisZaStudenta());
			}		
		}	
	}

}
