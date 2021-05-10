package izuzeci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BebeIzuzeciC {

	public static void main(String[] args) {
		File f = new File("bebeC.txt");    // obrada fajla koji ima gresaka 
		Map<Integer, Integer> brojBebaPoGodini = new TreeMap<Integer, Integer>();
		File ferr = new File("greske.txt");   // u ovaj fajl zapisujemo pogresne linije 
		PrintWriter pwerr = null;
		Scanner in = null;		
		try {
			in = new Scanner(f);
			pwerr = new PrintWriter(ferr);
			int linijaBr = 0;
			while(in.hasNext()) {
				String line = in.nextLine();
				linijaBr++;
				try {
					String brojevi[] = line.split(" ");					
					int godina = Integer.parseInt(brojevi[1]);
					int brDecaka = Integer.parseInt(brojevi[2]);
					int brDevojcica = Integer.parseInt(brojevi[3]);			
					if(brojBebaPoGodini.containsKey(godina)) {
						brojBebaPoGodini.put(godina, brojBebaPoGodini.get(godina)+brDecaka+brDevojcica);
					}else {
						brojBebaPoGodini.put(godina,brDecaka+brDevojcica);
					}
				}catch(Exception e) {
					// ako linija ne moze da se parsira, zapisuje se u fajl sa greskama
					pwerr.println("Linja "+linijaBr+": "+line + "  ["+e.getClass()+"]");
				}				
			}
			System.out.println(brojBebaPoGodini);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}finally{			
			in.close();
			pwerr.close();
		}		

	}

}
