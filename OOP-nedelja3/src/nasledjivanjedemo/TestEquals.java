package nasledjivanjedemo;

public class TestEquals {
	
	public static void main(String[] args){
		
		Nastavnik n = new Nastavnik("Milan", "Miric","1234567890");
		Nastavnik n1 = new Nastavnik("Milan", "Miric","1234567890");
		System.out.println(n.equals(n1));	
	}

}
