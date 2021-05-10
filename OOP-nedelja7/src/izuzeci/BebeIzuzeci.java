package izuzeci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BebeIzuzeci {
	
	public static void main(String[] args) {
		File f = new File("bebe.txt");   // citamo fajl bez gresaka, sve prolazi kako treba, ako stavimo bebeC.txt program puca jer neke linije imaju gresku
		Map<Integer, Integer> brojBebaPoGodini = new TreeMap<Integer, Integer>();		
		Scanner in = null;
		try {
			in = new Scanner(f);
			while(in.hasNext()) {				
				String brojevi[] = in.nextLine().split(" ");
				int godina = Integer.parseInt(brojevi[1]);
				int brDecaka = Integer.parseInt(brojevi[2]);
				int brDevojcica = Integer.parseInt(brojevi[3]);			
				if(brojBebaPoGodini.containsKey(godina)) {
					brojBebaPoGodini.put(godina, brojBebaPoGodini.get(godina)+brDecaka+brDevojcica);
				}else {
					brojBebaPoGodini.put(godina,brDecaka+brDevojcica);
				}				
			}
			System.out.println(brojBebaPoGodini);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}finally{			
			in.close();
		}	
		
		    
		
		
			
		
			
}

}
