package anonimnaklasa;

public class AnonimnaKlasaPozdrav {
	
		  
	    interface Pozdravljanje {
	        public void pozdrav();
	        public void pozdraviNekog(String ime);
	    }
	    
	    
	  
	    public void pozdravNaJezicima() {
	    	
	        // unutrašnja klasa - imeniovana (nije anonimna) 
	    	
	        class PozdravEngleski implements Pozdravljanje {
	            String ime = "world";
	            
	            public void pozdrav() {
	            	pozdraviNekog("world");
	            }
	            public void pozdraviNekog(String nekoIme) {
	                ime = nekoIme;
	                System.out.println("Hello " + ime);
	            }
	        }
	      
	        Pozdravljanje pozdravEngleski = new PozdravEngleski();
	        
	        // kreiranje anonimne klase i njenog objekta
	        
	        Pozdravljanje pozdravFrancuski = new Pozdravljanje() {
	            String ime = "tout le monde";
	            public void pozdrav() {
	            	pozdraviNekog("tout le monde");
	            }
	            public void pozdraviNekog(String nekoIme) {
	                ime = nekoIme;
	                System.out.println("Salut " + ime);
	            }
	        };
	        
	    	// kreiranje anonimne klase i njenog objekta
	        
	        Pozdravljanje pozdravSpanski = new Pozdravljanje() {
	            String ime = "mundo";
	            public void pozdrav() {
	                pozdraviNekog("mundo");
	            }
	            public void pozdraviNekog(String nekoIme) {
	                ime = nekoIme;
	                System.out.println("Hola, " + ime);
	            }
	        };
	        pozdravEngleski.pozdrav();;
	        pozdravFrancuski.pozdraviNekog("Marko");
	        pozdravSpanski.pozdrav();
	    }

	    public static void main(String... args) {
	        AnonimnaKlasaPozdrav ap = new AnonimnaKlasaPozdrav();
	        ap.pozdravNaJezicima();
	    }            
}


