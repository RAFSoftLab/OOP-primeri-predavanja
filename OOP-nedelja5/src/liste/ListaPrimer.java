package liste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ListaPrimer {
	
	public static void main(String[] args){		
		
		List<String> lista = new ArrayList<String>();
		lista.add("Ponedeljak");		
		lista.add(1, "Sreda");
		lista.add(2,null);
		lista.add(3, "Cetvrtak"); // ako pokusamo da dodamo na indeks veci od 3 - izuzetak
		lista.add(null); // ako pokusamo da dodamo na indeks veci od 3 - izuzetak
		
		
				
		lista.remove(2); // uklanja treci element liste
		System.out.println(lista.indexOf("Cetvrtak")); // Cetvrtak je sada na indeksu 2		
		System.out.println(lista.indexOf("Ponedeljak")); // element koji se više puta pojavljuje, 
		                                                 // vraća se indeks prvog pojavljivanja
		System.out.println(lista.lastIndexOf("Ponedeljak")); // indeks poslednjeg pojavljivanja													
		for(String str:lista)   // ispis elemenata liste for-each petljom u novom redu 
			System.out.println(str);	
		
		System.out.println("Cela lista: "+lista);  // poziva se toString 
		
	
		
		 
		
		List<Integer> listaL = new LinkedList<Integer>();
		listaL.add(5);
		listaL.add(2);
		listaL.add(1);
		listaL.add(4);
		listaL.add(5);
		
		// dve varijante metode remove, argument Object (uklanja element) i argument int (uklanja po indeksu) 
		listaL.remove(2);  // argument int
		listaL.remove(Integer.valueOf(2));  // argument Object
		System.out.println(listaL);   // [5, 4, 5] 	
		
		
		if (listaL.contains(4)) // true
			System.out.println("Lista sadrzi broj 4");
		
		if (listaL.contains(Integer.valueOf(5)))  // true
			System.out.println("Lista sadrzi broj 5");
		
		
		
		
	/*	
	
		List<Integer> podlista = listaL.subList(0, 2); // podlista			
		ListIterator<Integer> it = podlista.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());			
		}
		*/
		
		List<Integer> listaL1 = new LinkedList<Integer>();
		listaL1.add(8);
		listaL1.add(2);
		listaL1.add(6);
		listaL1.add(4);
		listaL1.add(5);
		listaL1.add(6);
	/*	
		Iterator<Integer> itL = listaL1.iterator();
		while(itL.hasNext()){
			Integer temp = itL.next();
			System.out.println(temp);
			if(temp%2==0) {
				itL.remove();
			}
			
		}  */
		System.out.println(listaL1);
		
		// ukoloniti parne elemente liste
		
		// ovako ne moze - menjamo listu kroz koju iteriramo
	    /*for(Integer i:listaL1){
			if(i%2==0) listaL1.remove(Integer.valueOf(i));
		}*/
		
		int i = 0;
		while(i<listaL1.size()) {
			if(listaL1.get(i)%2==0) {
				listaL1.remove(i);
			}else
				i++;
		}
		System.out.println(listaL1);
	/*		
		Iterator<Integer> itL = listaL1.iterator();
		while(itL.hasNext()){
			if(itL.next()%2==0) itL.remove();
			
		}
		
		
		/*
		ListIterator<Integer> itL = listaL1.listIterator();
		while(itL.hasNext()){
			if(itL.next()%2==0) itL.remove();
			
		}
		
		
		
				
		System.out.println("promenjena lista: "+listaL1);
		*/
		
		
		 // List<Osoba> osobe = new ArrayList<Nastavnik>(); - ne moze
		
		//List<Osoba> osobe = new ArrayList<Osoba>();
		

		
		
		
		/*
		
		List<? extends Osoba> osobe1 = new ArrayList<Sluzbenik>();
		
		
		List<? extends Osoba> osobe2 = new ArrayList<Osoba>();
		
		
		
		
		List<? super Nastavnik> nastavnici = new ArrayList<Osoba>();		
		List<? super Nastavnik> nastavnici1 = new ArrayList<Nastavnik>();
		// List<? super Nastavnik> nastavnici2 = new ArrayList<Sluzbenik>(); - ne moze
		
		*/
 	}
}
