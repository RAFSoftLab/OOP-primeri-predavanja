package izuzeci;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj:");
		String brojStr = in.nextLine();
		try{
			int broj = Integer.parseInt(brojStr);
			boolean paranBroj = broj%2==0;
			if(paranBroj)
				System.out.println("Uneti broj je paran.");
		}catch(NumberFormatException e){
			System.out.println("Pogresan format broja.");
		}
		in.close();
	}

}
