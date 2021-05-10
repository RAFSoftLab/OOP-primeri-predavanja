package izuzeci;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite tri broja sa razmakom:");
		String brojevi[] = in.nextLine().split(" ");
		int a[] = new int[2];
		try{
			int i = 0;
			for(String br:brojevi){
				a[i++] = Integer.parseInt(br);				
			}
			//Integer broj = (Integer) new Object();
			
		}catch(IndexOutOfBoundsException e1){
			System.out.println("Pogresan indeks niza");
			
		}catch(NumberFormatException e2){
			System.out.println("Pogresan format broja");			
		}
		finally{
			System.out.println("Blok finally");
		}

	}

}
