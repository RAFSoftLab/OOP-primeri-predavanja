package izuzeci;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Primer2 {

	public static void main(String[] args) {
		
			try {
				PrintWriter pw = new PrintWriter("noviFajl.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
