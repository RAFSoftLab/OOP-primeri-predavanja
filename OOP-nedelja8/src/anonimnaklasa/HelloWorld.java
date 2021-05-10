package anonimnaklasa;

public class HelloWorld {
	
	public static void main(String[] args){
		
		MojInterfejs miAnonimna1 = new MojInterfejs() {			
			@Override
			public void ispisi() {
				System.out.println("Ovo je prva anonimna klasa");				
			}
		};	
		
		MojInterfejs miAnonimna2 = new MojInterfejs() {			
			@Override
			public void ispisi() {
				System.out.println("Ovo je druga anonimna klasa");				
			}
		};	
		test(miAnonimna1);
		test(miAnonimna2);
		test(new MojInterfejs() {			
			@Override
			public void ispisi() {
				System.out.println("Ovo je anonimna klasa argument funkcije");				
			}
		});	
	}
	
	public static void test(MojInterfejs mi) {
		mi.ispisi();
	}

}
