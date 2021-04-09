package mape;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import skupovi.ElementSkupa;

public class TestMap {

	public static void main(String[] args) {
		Map<ElementSkupa, String> mapa = new TreeMap<ElementSkupa, String>(); 
		mapa.put(new ElementSkupa("1"), "Prvi");
		mapa.put(new ElementSkupa("2"), "Drugi");
		mapa.put(new ElementSkupa("2"), null);		
		
		System.out.println(mapa);
		
				
		
		
	}

}
