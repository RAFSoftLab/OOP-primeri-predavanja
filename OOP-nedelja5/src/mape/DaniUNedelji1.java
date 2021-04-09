package mape;

import java.util.HashMap;
import java.util.Map;

public class DaniUNedelji1 {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>(); 
		mapa.put("Ponedeljak", 1);
		mapa.put("Utorak",2);
		mapa.put("Sreda", 3);
		mapa.put("Cetvrtak", 4);
		mapa.put("Subota", 4);  // mogu da se ponove iste vrednosti za različite ključeve		
		
		System.out.println(mapa);   //{Ponedeljak=1, Sreda=3, Cetvrtak=4, Subota=4, Utorak=2}
		System.out.println(mapa.get("Sreda"));  // 3		
		System.out.println(mapa.containsKey("Petak"));  // false		
		System.out.println(mapa.keySet());	 // [Ponedeljak, Sreda, Cetvrtak, Subota, Utorak]
		Integer broj = mapa.remove("Sreda");  // uklanja element za dati ključ i vraća njegovu vrednost 	 	
		System.out.println(mapa);  // {Ponedeljak=1, Cetvrtak=4, Subota=4, Utorak=2}
		System.out.println(broj);  // 3
		Integer broj1 = mapa.put("Ponedeljak",5); // pregazi vrednost postojećeg kljuca, vraca staru vrednost
		System.out.println(mapa);  // {Ponedeljak=5, Cetvrtak=4, Subota=4, Utorak=2} 
		System.out.println(broj1); // 1 - vrednost koja je pregazena u liniji 23
	}

}
