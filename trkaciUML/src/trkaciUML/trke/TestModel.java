package trkaciUML.trke;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

public class TestModel {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		
		for(String str:args)
			System.out.println(str);
		
		Trkac t1 = new Trkac("Matteo", "Galvan", "ITA", sdf.parse("1988-09-01"), 'm');
		Trkac t2 = new Trkac("Usain", "Bolt", "USA", sdf.parse("1986-09-01"), 'm');
		Trkac t3 = new Trkac("Mehboob", "Ali", "PAK", sdf.parse("1988-09-01"), 'm');
		Trkac t4 = new Trkac("Anas", "Beshir", "Srbija", sdf.parse("1988-09-01"), 'm');
		
		Trka trka1 = new Trka(VrstaTrke.INDIVIDUALNA);
		trka1.setDuzinaStaze(400);
		trka1.addUcesnici(t1,t2,t3,t4);
		
		Rezultat rez1 = new Rezultat(trka1, t1, 23.12, 0);
		Rezultat rez2 = new Rezultat(trka1, t2, 22.10, 0);
		Rezultat rez3 = new Rezultat(trka1, t3, 24.3, 0);
		Rezultat rez4 = new Rezultat(trka1, t4, 20.56, 0);
		
		System.out.println("Rezultati trke");
		Collections.sort(trka1.getUcesniciTrke(),
				(u1,u2)->{if (u1.getRez().getVreme()>u2.getRez().getVreme()) return 1; else return -1;});
		for(Ucesnik u:trka1.getUcesniciTrke()) {
			u.getRez().setPozicija(trka1.getUcesniciTrke().indexOf(u)+1);
			System.out.println(u);
		}
		
		
		
	}

}
