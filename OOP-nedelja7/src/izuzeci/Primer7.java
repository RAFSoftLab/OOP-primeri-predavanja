package izuzeci;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Primer7 {
	
	static PrintWriter pw = null;
	static Scanner in = null;

	public static void main(String[] args) {
		
		try {
			pw = new PrintWriter("noviFajl.txt");
			in = new Scanner(System.in);
			System.out.println("Unesite tri broja sa razmakom:");
			String brojevi[] = in.nextLine().split(" ");						
			for(String br:brojevi){				
				pw.println(Integer.parseInt(br));
			}
			}catch (NumberFormatException e) {			
				
			
						
			}catch (FileNotFoundException e) {			
				e.printStackTrace();
			}finally{
				System.out.println("finally");
				if(pw!=null)
					pw.close();	
				if(in!=null)
					in.close();
			}
		System.out.println("Posle finally");
	}

}
