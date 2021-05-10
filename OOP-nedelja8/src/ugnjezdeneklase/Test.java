package ugnjezdeneklase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;



public class Test {
	
	public static void main(String[] args){
		
		/*
		 *  kreiraje objekta unutrašnje statičke klase
		 */
		
		StatickaKlasaPrimer.StatickaUnutrasnjaKlasa kls = 
				new StatickaKlasaPrimer.StatickaUnutrasnjaKlasa();
		
		
		
		// dodatak - rad sa datumima
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date datum = sdf.parse("2010.09.01");
			Date danas = new Date();
			if(datum.before(danas)){
				System.out.println("Prosao datum");
			}
			String strDanasnji = sdf.format(danas);
			System.out.println("Danas je "+strDanasnji);
			
		} catch (ParseException e) {		
			e.printStackTrace();
		}
		
		LocalDate ld = LocalDate.now();
		LocalDate prviDan_2015 = LocalDate.of(2015, Month.JANUARY, 1);
		System.out.println("Prvi dan 2015-e godine: "+prviDan_2015);
		LocalDate stotiDan2021 = LocalDate.ofYearDay(2021, 100);
		System.out.println("100-i dan u 2021-oj godini: "+stotiDan2021);
		

		
	}
}

