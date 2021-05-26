package javafxkolekcije;

import java.util.ArrayList;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class ObservableListDemo {

	public static void main(String[] args) {
		
		// obicna lista		
		List<String> list = new ArrayList<>();
		list.add("elem1");
		list.add("elem2");
			 
        // kreiranje Observable list
		ObservableList<String> observableList = FXCollections.observableList(list);
		
		// dodavanje listener-a
        observableList.addListener(new ListChangeListener<String>() {	 
            @Override
            public void onChanged(ListChangeListener.Change change) {             	
                System.out.println("Detektovana promena na listi! ");
            }
        });
 
       System.out.println("Dodavanje elemenata u observablelist");
        // dodovanje stavke u observable list proizvodi dogadjaj
       observableList.add("element1");     
       observableList.add("element2");    
        
       observableList.remove("element2");
 
        
     
        System.out.println("Dodavanje elemenata u list");
        // dodavanje stavke u obicnu listu ne proizvodi dogadjaj
        // ali dodaje element u listu
        list.add("element-lista");
       
 
        System.out.println("Velicina observableList: "+observableList.size() + "   "+observableList);
        System.out.println("Velicina list: "+list.size() + "   "+ list);
        
        
       }
}


