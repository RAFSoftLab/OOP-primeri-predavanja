package izuzeci;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite tri broja sa raznakom:");
		String brojevi[] = in.nextLine().split(" ");
		int a[] = new int[2];
		try{
			int i = 0;
			for(String br:brojevi){
				a[i++] = Integer.parseInt(br);
			}			
		}catch(IndexOutOfBoundsException|NumberFormatException  e1){			
			System.out.println("Greska!");			
			
		}
		
	}

}
