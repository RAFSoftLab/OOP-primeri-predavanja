package anonimnaklasa;

public class IzracunljivTest {

	public static void main(String[] args) {		
		Izracunljiv drugi = (a,b)-> {return a;};		
		System.out.println(drugi.izracunaj(10, 12));
		test(drugi,20,30);
		test((a,b)-> a-b,100,10);
	}
	
	private static void test(Izracunljiv iz, int arg1, int arg2) {
		System.out.println(iz.izracunaj(arg1, arg2));
	}
	
	
	
	/*
	Izracunljiv prvi = new Izracunljiv() {			
		@Override
		public int izracunaj(int x1, int x2) {				
			return x1+x2;
		}
	};	
	System.out.println(prvi.izracunaj(2, 3));	
	
		*/
}


