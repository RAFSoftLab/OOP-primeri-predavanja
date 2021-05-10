package izuzeci;

import java.util.Scanner;

public class Primer9 {

	public static void main(String[] args) {		
			
		try {		
			int ocena = ucitajOcenu();
		}catch(OpsegOceneException e) {
			e.printStackTrace();
		}
				
			
	}
	
	
	public static int ucitajOcenu() throws OpsegOceneException {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ocenu:");
		int ocena = in.nextInt();
		in.close();
		if(ocena<5 || ocena>10)			
			throw new OpsegOceneException(ocena);	 // ispaljivanje kreiranog izuzetka
		return ocena;
	}

}
