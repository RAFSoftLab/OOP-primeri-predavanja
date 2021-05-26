package javafxkolekcije;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ObservableListDemo1 {

	public static void main(String[] args) {
		
		// kreiranje prazne liste
		ObservableList<String> obList1 = FXCollections.observableArrayList();
		obList1.add("april");
		obList1.add("maj");
		obList1.add("februar");
		System.out.println(obList1);
		
		// sa nabrajanjem elemenata
		ObservableList<Integer> obList2 = FXCollections.observableArrayList(23,13,12,2);
		System.out.println(obList2);
		
		List<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(23);
		lista3.add(13);
		lista3.add(33);
		
		// kreira se nova observable lista i u nju se ubacuju elementi 
		// prosledjene kolekcije		
		ObservableList<Integer> obList3 = FXCollections.observableArrayList(lista3);
		System.out.println(obList3);		
		lista3.add(30);
		obList3.add(100);
		System.out.println(obList3);
		
		
		
		
		
		/*
		
		
		System.out.println("------------------------------");
		
		// razlika između FXCollections.observableArrayList i FXCollections.observableList
		
		
		List<Integer> lista4 = new ArrayList<Integer>();
		lista4.add(10);
		lista4.add(20);
		lista4.add(30);
		ObservableList<Integer> obList4 = FXCollections
				.observableList(lista4);
		System.out.println(obList4);		
		lista4.add(40);
		System.out.println(obList4);
		*/
	} 
	
	
	

}
