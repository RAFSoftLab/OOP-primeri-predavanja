package izuzeci;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Primer6 {

	public static void main(String[] args) {		
		try{		
			obradiFajl();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void obradiFajl() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("noviFajl.txt");
	}

}
