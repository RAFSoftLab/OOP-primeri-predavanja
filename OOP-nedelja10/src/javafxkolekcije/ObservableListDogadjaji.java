package javafxkolekcije;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class ObservableListDogadjaji {
	
	public static void main(String[] args) {
		
		List<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(10);
		lista3.add(20);		
		ObservableList<Integer> obList3 = FXCollections.observableArrayList(lista3);		
		obList3.addListener(new ListChangeListener<Integer>() {	 
            @Override
            public void onChanged(ListChangeListener.Change change) {
            	System.out.println("Promena na listi");
            	while (change.next()) {
                    if(change.wasAdded()) {
                    	System.out.println("dodati elementi "+change.getAddedSubList());
                    }
                    if(change.wasRemoved()) {
                    	System.out.println("ukonjeni elementi"+ change.getRemoved());
                    }                    
                }
           }            
        });
		
		obList3.addAll(List.of(30,40,50,60));
		obList3.remove(Integer.valueOf(30));		
		lista3.add(40);
		lista3.add(70);		
		obList3.removeAll(lista3);		
		System.out.println("obLista = "+obList3);
		System.out.println("lista = "+lista3);		
	}
}
