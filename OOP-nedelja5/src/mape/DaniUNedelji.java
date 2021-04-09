package mape;

import java.util.HashMap;
import java.util.Map;

import skupovi.ElementSkupa;

public class DaniUNedelji {
	
	public static void main(String[] args){
		
		Map<Integer, String> mapa = new HashMap<Integer, String>(); 
		mapa.put(5, "Ponedeljak");
		mapa.put(2, "Utorak");
		mapa.put(3, "Sreda");
		mapa.put(4, "Cetvrtak");
		
		System.out.println("mapa.put(5, \"Petak\") = "+mapa.put(5, "Petak"));
		System.out.println(mapa);   //{1=Ponedeljak, 2=Utorak, 3=Sreda, 4=Cetvrtak, 5=Petak}		
		System.out.println(mapa.get(3));  // Sreda		
		System.out.println(mapa.containsKey(6));  // false		
		System.out.println(mapa.keySet());	 // [1, 2, 3, 4, 5]	
		mapa.remove(5);	
		
		System.out.println(mapa);  // {1=Ponedeljak, 2=Utorak, 3=Sreda, 4=Cetvrtak}
		
		
		
		
	}

}
