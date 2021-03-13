package vezedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UcitavanjeGrupaStudenata {

	public static void main(String[] args) {
		List<Grupa> grupe = new ArrayList<>();
		List<Student> studenti = new ArrayList<>();
 		try {
			Scanner sc = new Scanner(new File("spisakpogrupama.txt"),"UTF-8");
			String linija;
			Grupa g = null;
			do {				
				linija = sc.nextLine();				
				String[] linijaParts =linija.split("[, /]");
				
				if(linijaParts.length==1) {
					g = new Grupa(linijaParts[0]);
					g.setGodinaStudija(Integer.parseInt(linijaParts[0].substring(0, 1)));					
					grupe.add(g);
				}else {					
					String studProgram = linijaParts[3];
					if(g.getStudProgram()==null) 
						g.setStudProgram(studProgram);
					Student s = new Student(linijaParts[1], linijaParts[2], studProgram, Integer.parseInt(linijaParts[4]), Integer.parseInt(linijaParts[5]));
					s.setGrupa(g);					
					studenti.add(s);					
				}				
			}while(sc.hasNext());
			
			// ispis po grupama
			
			for(Grupa gr:grupe) {
				System.out.println("Grupa "+gr.getOznakaGrupe() + ", Studijski program: "+gr.getStudProgram()+", Godina studija: "+gr.getGodinaStudija());
				for(Student s:gr.getStudenti()) {
					System.out.println(s.getBrojIndeksa()+"-"+s.getGodinaUpisa()+"-"+s.getSmer()+" "+s.getIme()+" "+s.getPrezime());
				}
			}
			
			// pronalazak grupe studenta na osnovu indeksa
			String smer = "RN";
			int brojIndeksa = 25;
			int godina = 20;
			
			for(Student s:studenti) {
				if(s.getBrojIndeksa()==brojIndeksa && s.getSmer().equals(smer) && s.getGodinaUpisa()==godina) {
					System.out.println("student "+s.getIme()+" "+s.getPrezime()+" pripada grupi "+s.getGrupa().getOznakaGrupe());
				}
			}		
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
