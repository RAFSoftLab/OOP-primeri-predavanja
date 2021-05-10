package anonimnaklasa;

public class AnonimniObjekat {

	public static void main(String[] args) {
		
		Object o = new Object(){
			
			public String toString() {
				return "Objekat anonimne klase";
			};
		};
		
		System.out.println(o.toString());
	}
}
