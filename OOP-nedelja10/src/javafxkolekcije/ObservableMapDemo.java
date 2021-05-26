package javafxkolekcije;

import java.util.HashMap;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;

public class ObservableMapDemo{
	
	public static void main(String[] args) {

		
		Map<String,String> jeziciMapa = new HashMap<String,String>();		
		jeziciMapa.put("srp", "Srpski");
		jeziciMapa.put("eng", "Engleski");
		jeziciMapa.put("fre", "Francuski");		
		
		
		ObservableMap<String,String> observableMap = FXCollections.observableMap(jeziciMapa);
		observableMap.addListener(new MapChangeListener<String,String>() {
            @Override
            public void onChanged(MapChangeListener.Change change) {
                System.out.println("Detektovana promena na mapi ");
                if(change.wasAdded()) {
                	System.out.println("dodat element kljuc: "
                			+change.getKey()+", vrednost:"+change.getValueAdded());
                }
            }
        });
		
        // Promena na observable mapi
        observableMap.put("ita","Italijanski");
        System.out.println("Velicina: "+observableMap.size());
        
        // Promena na mapi - ne registruje se
        jeziciMapa.put("ger", "Nemacki");
        System.out.println("Velicina: "+observableMap.size());        
        System.out.println(observableMap);
		
		
		
	}


	
}
