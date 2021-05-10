package izuzeci;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KvizProba {
	
	public static void main(String[] args) {		
			Scanner in = new Scanner(System.in);
			System.out.println("Unesite tri broja sa razmakom:");
			String brojevi[] = in.nextLine().split(" ");    
			List<Integer> listaInt = new ArrayList<Integer>();				
			for(int i=0;i<3;i++){	
				try {
					listaInt.add(Integer.parseInt(brojevi[i]));					
				}catch(NumberFormatException e2){
					System.out.println("Pogresan format broja");				
				}
				finally{
					System.out.println("Blok finally....");
					in.close();
				}			
				System.out.println(listaInt);
			}
			
			System.out.println("Posle try");	
	}
}
