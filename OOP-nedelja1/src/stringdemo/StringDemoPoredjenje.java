package stringdemo;

public class StringDemoPoredjenje {
	
	
	
	public static void main(String[] args) {
	
		// poredjenje stringova - string literali
		
		System.out.println("--------String literali - poredjenje");
		
		// kreiramo dva string literala
	
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);  // true - nalaze se na istoj memorijskoj adresi - string pool
		
		
		
		
		s1+="";    // kada izvrsimo bilo koju operaciju nad literalom, on postaje novi objekat 
		System.out.println(s1.equals(s2));  // true, stringovi imaju isti sadrzaj
		System.out.println(s1==s2);  // false, iako su istog sadrzaja, nisu na istoj memorijskoj adresi
		
		
		System.out.println("abc" == s2);   // true - poredjenje adresa dva jednaka literala
		
		
		
		//poredjenje stringova - string objekti
		
		System.out.println("--------String objekti - poredjenje");
		
		String s3 = new String("abc");  // pravimo novi string objekat
		String s4 = new String("abc");  // pravimo novi string objekat
		System.out.println(s4==s3);   // false - nisu na istoj adresi
		System.out.println(s4.equals(s3));  // true - jednaki po sadrzaju
		
		
	    System.out.println("abc" == s3);  // false - poredjenje adresa literala i objekta
		
		System.out.println("abc".equals(s3));  // true - poredi se sadrzaj
		
		
		String s5 = s3;   // s4 pokazuje na isti objekat kao i s3
		 
		System.out.println(s5==s3);  // true - iste adrese objekata
		
		
		
			
	}


}
